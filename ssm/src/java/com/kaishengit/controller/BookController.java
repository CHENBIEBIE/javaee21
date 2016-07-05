package com.kaishengit.controller;

import com.kaishengit.pojo.Book;
import com.kaishengit.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Inject
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model){

        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList",bookList);
        return "/books/list";
    }
}
