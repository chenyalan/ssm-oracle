package com.njxxx.service;

import com.njxxx.domain.PlmProjectDO;
import com.njxxx.domain.UserDO;

import java.util.List;

/**
 * Created by 陈亚兰 on 2018/6/4.
 */
public interface UService {
    List<UserDO> getAll();
    List<PlmProjectDO> getPlmProjectAll();
}
