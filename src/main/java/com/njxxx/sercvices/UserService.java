package com.njxxx.sercvices;

import com.njxxx.dao.UserDao;
import com.njxxx.domain.UserDO;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陈亚兰 on 2018/6/4.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<UserDO> getAll(){
        return userDao.selectAll();
    }
}
