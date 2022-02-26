package com.mapper;

import com.entity.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface RoleMapper {

    //Select
    @Select("select * from smbms_role")
    public List<Role> getRoleList();

    @Select("select * from smbms_role where id = #{id}")
    public Role getRoleByID(int id);

    @Insert( "insert into smbms_role (roleCode, roleName," +
            " createdBy, creationDate, modifyBy, " +
            "modifyDate) values (#{roleCode},#{roleName},#{createdBy}"
            + ",#{creationDate},#{modifyBy},#{modifyDate})" )
    public int addNewRole(Role role);

    @Update("update smbms_role set "
            + "roleCode=#{roleCode},"
            + "roleName=#{roleName},"
            + "createdBy=#{createdBy},"    //注意这里的逗号
            + "creationDate=#{creationDate},"
            + "modifyBy=#{modifyBy},"
            + "modifyDate=#{modifyDate}"
            + "where id=#{id}")
    public int updateRole(Role role);

    @Delete("delete from smbms_role where id=#{id}")
    public int deleteRoleByID(int id);

}
