package com.njxxx.dao;


import com.njxxx.domain.PlmProjectDO;
import com.njxxx.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 陈亚兰 on 2018/6/4.
 */
public interface UserDao {
    @Select(" select * from agile.CTTQ_USERGROUPINFO_FOR_IP")
    @Results({
            @Result(property = "projectName",column = "NAME"),
            @Result(property = "logId",column = "LOGINID")
    })
    List<UserDO> selectAll();


    @Select("select * from AGILE.CTTQ_PROJECTINFO_FOR_IP")
    @Results({
            @Result(property = "onePlmCode",column ="YFCode" ),
            @Result(property = "onePlmName",column = "name"),
            @Result(property = "twoPlmCode",column = "SUBYFCode"),
            @Result(property = "twoPlmName",column = "SUBName"),
            @Result(property = "process",column = "PJHASE"),
            @Result(property = "responsiblePerson",column = "PJCOORDINATOR"),
            @Result(property = "projectStatus",column ="PJSTATUS" ),
            @Result(property = "YLRegistrationType",column = "YLRegistrationType"),
            @Result(property = "NEWYLRegistrationType",column = "NEWYLRegistrationType"),
            @Result(property = "ZJRegistrationType",column = "ZJRegistrationType"),
            @Result(property = "NEWZJRegistrationType",column = "NEWZJRegistrationType"),
            @Result(property = "PJCoordinatorId",column = "PJCoordinatorId"),
            @Result(property = "PJCoordinator",column = "PJCoordinator"),
            @Result(property = "APILeader",column = "APILeader"),
            @Result(property = "APILeaderId",column = "APILeaderId"),
            @Result(property = "PreparationLeaderId",column = "PreparationLeaderId"),
            @Result(property = "PreparationLeader",column = "PreparationLeader")
    })
    List<PlmProjectDO> getPlmProjectAll();
}
