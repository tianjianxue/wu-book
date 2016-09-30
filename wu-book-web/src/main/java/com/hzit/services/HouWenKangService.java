package com.hzit.services;

import java.util.Map;

/**
 * Created by Administrator on 2016/9/30.
 */
public interface HouWenKangService {
    /**
     * 查询所有
     * @return
     */
    public Object selectALL();

    /**
     * 查询单个
     * @return
     */
    public Object selectA(Map map);
    /**
     * 删除
     */
    public Integer deleteA();
    /**
     * 修改
     */
    public Integer updateA();
    /**
     * 增加
     */
    public Integer increaseA();
}
