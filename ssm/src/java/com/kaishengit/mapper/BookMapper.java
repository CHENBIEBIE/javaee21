package com.kaishengit.mapper;


import com.kaishengit.pojo.Book;

import javax.inject.Named;
import java.util.List;


public interface BookMapper {


    void save(Book book);

    void del(Integer id);

    void update(Book book);

    Book findById(Integer id);

    List<Book> findAll();

}
