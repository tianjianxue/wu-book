package com.hzit.services.impl;

import com.hzit.services.ZhongHuiGuiService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/9/30.
 */
@Service
public class ZhonghuiguiServiceImpl implements ZhongHuiGuiService {
    @Override
    public boolean unpdata() {
        System.out.print("修改成功");
        return false;
    }
}
