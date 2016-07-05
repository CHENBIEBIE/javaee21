package com.kaishengit.service;

import com.kaishengit.mapper.BookMapper;
import com.kaishengit.pojo.Book;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class BookService {

    @Inject
    private BookMapper bookMapper;

    public void saveBook(Book book){

        bookMapper.save(book);
    }

    public void delBook(Integer id){
        bookMapper.del(id);
    }

    public void updateBook(Book book){
        bookMapper.update(book);
    }

    public Book findById(Integer id){
       return bookMapper.findById(id);

    }

    public List<Book> findAll(){

        return bookMapper.findAll();
    }
}
