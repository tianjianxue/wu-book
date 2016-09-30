package com.hzit.services.impl;
import com.hzit.services.LisikangService;
import com.wuwenjie.web.controller.LisikangController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class LisikangServiceImpl implements LisikangService{

   @Autowired
    private LisikangController lisikangController;
    @Override
    public int delete(Integer nub) {
        return  lisikangController.delect(nub);
    }
}
