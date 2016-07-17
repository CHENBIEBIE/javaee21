package com.kaishengit.controller;

import com.kaishengit.pojo.Sales;
import com.kaishengit.service.CustomerService;
import com.kaishengit.service.SalesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
@RequestMapping("/sales")
public class SalesController {
    @Inject
    private SalesService salesService;

    @Inject
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model){

        model.addAttribute("customerList",customerService.findAllCustomer());
        return "sales/list";
    }

    @RequestMapping(value = "/new",method = RequestMethod.POST)
    @ResponseBody
    public String saveSales(Sales sales){

        salesService.saveSales(sales);

        return "success";
    }
}
