package com.kaishengit.service;

import com.kaishengit.mapper.CustomerMapper;
import com.kaishengit.mapper.SalesMapper;
import com.kaishengit.pojo.Sales;
import com.kaishengit.util.ShiroUtil;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SalesService {

    @Inject
    private SalesMapper salesMapper;
    @Inject
    private CustomerMapper customerMapper;

    public void saveSales(Sales sales) {

        sales.setUserid(ShiroUtil.getCurrentUserID());
        sales.setUsername(ShiroUtil.getCurrentUserName());
        sales.setCustname(customerMapper.findById(sales.getCustid()).getName());

        salesMapper.save(sales);

    }
}
