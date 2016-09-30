package com.hzit.services;

import java.util.List;

/**
 * Created by Administrator on 2016/9/30.
 */
public interface JinxinService {

    boolean add(Object object);

    boolean del( Object object);

    boolean update(Object object );

    List findAll( Object object);

    List findById( Object object);
}
