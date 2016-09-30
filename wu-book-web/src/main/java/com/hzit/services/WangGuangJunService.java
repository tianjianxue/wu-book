package com.hzit.services;

import com.hzit.services.impl.WangGuangJunSerivceImpl;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class WangGuangJunService implements WangGuangJunSerivceImpl {
    @Override
    public void find() {
        System.out.println("haha");

    }
}
