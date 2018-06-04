package com.njxxx.service.impl;

import com.njxxx.dao.UserDao;
import com.njxxx.domain.PlmProjectDO;
import com.njxxx.domain.UserDO;
import com.njxxx.service.UService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陈亚兰 on 2018/6/4.
 */
@Service
public class UServiceImpl implements UService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserDO> getAll() {
        return userDao.selectAll();
    }

    @Override
    public List<PlmProjectDO> getPlmProjectAll() {
        return userDao.getPlmProjectAll();
    }
}
