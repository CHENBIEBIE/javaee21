package com.kaishengit.service;

import com.kaishengit.dao.MovieDao;
import com.kaishengit.entity.Movie;
import com.kaishengit.util.Page;

import java.util.List;

/**
 * Created by Administrator on 2016/6/18.
 */

// 从数据库里读取数据返回出去
public class MovieService {

    private MovieDao movieDao = new MovieDao();

    public List<Movie> findAllMovie(){

        return movieDao.findAll();

    }




    public Page<Movie> findMovieByPageNo(int  pageNo) {
        int totalSize = movieDao.count();

        Page<Movie> page = new Page<>(pageNo,10,totalSize);

        List<Movie> movieList = movieDao.findByPage(page.getStar(),10);

        page.setItems(movieList);

        return page;

       /* int totalSize = movieDao.count();

        int size = 10;
        int totalPageSize = totalSize/size;

        if (totalSize % size !=0 ){
            totalPageSize++;
        }

        if (pageNo>totalPageSize){

            pageNo=totalPageSize;

        }

        int star = (pageNo-1)*size;

        return movieDao.findByPage(star,size);*/
    }
}
