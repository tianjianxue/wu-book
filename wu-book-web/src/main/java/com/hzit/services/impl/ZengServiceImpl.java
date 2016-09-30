package com.hzit.services.impl;

import com.hzit.services.ZengService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class ZengServiceImpl implements ZengService {

    @Override
    public void add() {
        System.out.println("this is add method by zengchao");
    }

    @Override
    public void delete() {
        System.out.println("this is delete method by zengchao");
    }

    @Override
    public void findAll() {
        System.out.println("this is findAll method by zengchao");
    }
}
