package com.hzit.services.impl;

import com.hzit.services.WangSaiJunService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class WangSaiJunServiceImpl implements WangSaiJunService {
    @Override
    public boolean updateW() {
        System.out.println("修改成功！！！");
        return true;
    }
    public void login(){
        System.out.println("登录！！1");
    }
}
