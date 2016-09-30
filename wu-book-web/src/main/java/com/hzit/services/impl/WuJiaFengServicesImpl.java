package com.hzit.services.impl;

import com.hzit.services.WuJiaFengServices;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class WuJiaFengServicesImpl implements WuJiaFengServices {
    @Override
    public Date time() {
        return new Date();
    }

    @Override
    public void login() {

    }

    @Override
    public int add() {
        return 0;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public int delete() {
        return 0;
    }
}
