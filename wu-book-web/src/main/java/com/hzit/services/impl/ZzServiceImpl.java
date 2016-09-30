package com.hzit.services.impl;

import com.hzit.services.ZzService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class ZzServiceImpl implements ZzService {
    @Override
    public void getzz() {
        System.out.println("我不会因为失去了太阳而流泪，否则我将失去群星");
    }
}
