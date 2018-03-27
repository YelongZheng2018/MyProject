package com.myproject.dao.user;

import com.myproject.bean.user.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDAO {

    User queryUserById(@Param("id") int id);

}
