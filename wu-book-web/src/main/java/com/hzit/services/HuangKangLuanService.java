package com.hzit.services;

/**
 * Created by Administrator on 2016/9/30.
 */
public interface HuangKangLuanService {
    /**
     * 查询所有信息
     */
    public void findAll();

    /**
     * 增加
     * @return
     */
    public int insert();

    /**
     * 修改
     * @return
     */
    public int update();

    /**
     * 删除
     * @return
     */
    public int delete();

    /**
     * 根据ID查询信息
     * @return
     */
    public int findById();
}
