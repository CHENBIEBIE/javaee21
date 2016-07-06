package com.kaishengit.service;

import com.kaishengit.pojo.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by LL on 2016/7/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookServiceTestCase {

    private Logger logger = LoggerFactory.getLogger(BookServiceTestCase.class);
    @Inject
    private BookService bookService;

    @Test
    public void testFindAll(){
        List<Book> bookList =bookService.findAllBook();
        Assert.assertEquals(bookList.size(),29);
    }
    @Test
    public void testSave(){
        Book book = new Book();
        book.setBookauthor("林");
        book.setBookname("笑死浆糊");
        book.setBooknum(20);
        book.setBookprice(110F);
        book.setTypeid(2);
        book.setPubid(1);
        bookService.saveBook(book);
    }
    @Test
    public void testFindBookById(){
        Book book = bookService.findBookById(22);
        logger.debug("Book:{}",book);
        Assert.assertNotNull(book);
    }
    @Test
    public void testDelBook(){

        bookService.delBook(10);
    }
    @Test
    public void testUpdateBook(){
        Book book = bookService.findBookById(37);
        book.setBookname("风");
        bookService.update(book);
    }
}

