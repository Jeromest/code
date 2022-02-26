package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

    @Insert( "insert into smbms_user (userCode,userName,userPassword,gender,birthday,phone,"
            + "address,userRole,createdBy,creationDate) values (#{userCode},#{userName},#{userPassword}"
            + ",#{gender},#{birthday},#{phone},#{address},#{userRole},#{createdBy},#{creationDate})" )
    public int addNewUser(User user);

    @Update("update smbms_user set "
            + "userCode=#{userCode},"
            + "userName=#{userName},"
            + "userPassword=#{userPassword}"    //注意这里的逗号
//            + "gender=#{gender},"
//            + "birthday=#{birthday},"
//            + "phone=#{phone},"
//            + "address=#{address},"
//            + "userRole=#{userRole},"
//            + "createdBy=#{createdBy},"
//            + "creationDate=#{creationDate},"
//            + "modifyBy=#{modifyBy},"
//            + "modifyDate=#{modifyDate}"
            + "where id=#{id}")
    public int updateUser(User user);

    @Delete("delete from smbms_user where id=#{id}")
    public int deleteUserByID(int id);

}

