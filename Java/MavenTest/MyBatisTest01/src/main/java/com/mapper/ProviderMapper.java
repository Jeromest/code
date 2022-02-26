package com.mapper;

import com.entity.Provider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ProviderMapper {

    @Select("select * from smbms_provider")
    public List<Provider> getProviderList();


    @Select("SELECT * FROM smbms_provider WHERE id = #{id}")
    public Provider getProviderByID(int id);

    @Insert( "insert into smbms_provider (proCode, proName, " +
            "proDesc, proContact, proPhone, " +
            "proAddress, proFax, createdBy, " +
            "creationDate, modifyBy, modifyDate) values (#{proCode},#{proName},#{proDesc}"
            + ",#{proContact},#{proPhone},#{proAddress},#{proFax},#{createdBy},#{creationDate}"
            + ",#{modifyBy},#{modifyDate})" )
    public int addNewProvider(Provider provider);

    @Update("update smbms_provider set "
            + "proCode=#{proCode},"
            + "proName=#{proName},"
            + "proDesc=#{proDesc},"    //注意这里的逗号
            + "proContact=#{proContact},"
            + "proPhone=#{proPhone},"
            + "proAddress=#{proAddress},"
            + "proFax=#{proFax},"
            + "createdBy=#{createdBy},"
            + "creationDate=#{creationDate},"
            + "modifyBy=#{modifyBy},"
            + "modifyDate=#{modifyDate}"
            + "where id=#{id}")
    public int updateProvider(Provider provider);

    @Delete("delete from smbms_provider where id=#{id}")
    public int deleteProviderByID(int id);

}
