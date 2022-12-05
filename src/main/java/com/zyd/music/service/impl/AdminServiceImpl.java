package com.zyd.music.service.impl;

import com.zyd.music.dao.AdminMapper;
import com.zyd.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean verifyPassword(String name, String password) {
        return adminMapper.verifyPassword(name,password) > 0;
    }
}
