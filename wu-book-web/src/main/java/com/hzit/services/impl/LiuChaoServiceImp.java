package com.hzit.services.impl;

import com.hzit.services.LiuChaoService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class LiuChaoServiceImp implements LiuChaoService {
    @Override
    public void test() {
        System.out.println("这就是个测试咯");
    }
}
