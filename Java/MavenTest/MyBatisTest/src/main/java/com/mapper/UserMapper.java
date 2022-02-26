package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.entity.User;

/**
 *
 * @author Jerome
 * @since 2020.9.24
 *
 */

public interface UserMapper {

    @Select("select * from smbms_user")
    public List<User> getUserList();

    @Select("SELECT * FROM smbms_user WHERE id = #{id}")
    public User getUserByID(int id);

}
