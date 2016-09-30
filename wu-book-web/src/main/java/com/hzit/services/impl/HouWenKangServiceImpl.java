package com.hzit.services.impl;

import com.hzit.services.HouWenKangService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class HouWenKangServiceImpl implements HouWenKangService {

    @Override
    public Object selectALL() {
        System.out.println("查询全部");
        return null;
    }

    @Override
    public Object selectA(Map map) {
        System.out.println("查询单个");
        return null;
    }

    @Override
    public Integer deleteA() {
        System.out.println("删除单个");
        return null;
    }

    @Override
    public Integer updateA() {
        System.out.println("更新单个");
        return null;
    }

    @Override
    public Integer increaseA() {
        System.out.println("增加单个");
        return null;
    }
}
