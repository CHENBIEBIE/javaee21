package com.kaishengit.Service;

import com.kaishengit.pojo.Book;
import com.kaishengit.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookServiceTestCase {

    @Inject
    private BookService bookService;

    @Test
    public void testSaveBook(){

        Book book = new Book();
        book.setBookname("黎林辉外传");
        book.setBookauthor("陈文彬");
        book.setBookprice(90f);
        book.setBooknum(100);
        bookService.saveBook(book);
    }


    @Test
    public void testDelBook(){
        bookService.delBook(25);
    }

    @Test
    public void testUpdateBook(){

        Book book= bookService.findById(1);


        book.setBookauthor("Li");

        book.setBooknum(100);
        bookService.updateBook(book);

    }

    @Test
    public void testFindById(){

        bookService.findById(1);
    }

    @Test
    public void testFindAll(){
        List<Book> bookList = bookService.findAll();
        Assert.assertNotNull(bookList);
    }
}
