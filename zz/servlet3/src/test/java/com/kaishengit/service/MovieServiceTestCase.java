package com.kaishengit.service;

import com.kaishengit.entity.Movie;
import com.kaishengit.util.Page;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/6/18.
 */
public class MovieServiceTestCase {

    Logger logger = LoggerFactory.getLogger(MovieServiceTestCase.class);

    private MovieService movieService = new MovieService();

    @Test
    public void testFindAll(){

        List<Movie> movieList = movieService.findAllMovie();

        assertNotNull(movieList);

    }

    @Test
    public void testFindByPage(){
        Page<Movie> page = movieService.findMovieByPageNo(1);
        for (Movie movie :page.getItems()){
            logger.debug("{} ",movie);

        }

        assertEquals(10,page.getItems().size());

    }

}
