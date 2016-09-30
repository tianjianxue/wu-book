package com.hzit.services.impl;

import com.hzit.services.MaXiangService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */


@Service
public class MaXiangServiceImpl implements MaXiangService{
    @Override
    public Date currenttime() {
        return new Date();
    }

    @Override
    public String login() {

        String s="maxiang";
        return  s;
    }

    @Override
    public int add() {
        return 0;
    }
}
