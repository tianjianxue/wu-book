package com.hzit.services.impl;

import com.hzit.services.WanLunServices;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class WanlunServicesImpl implements WanLunServices {



    @Override
    public void login() {
        System.out.println("这个是业务逻辑类的登录方法");
    }
}
