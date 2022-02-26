package com.mapper;

import com.entity.Address;
import com.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AddressMapper {

    @Select("select * from smbms_address")
    public List<Address> getAddressList();

    @Select("SELECT * FROM smbms_address WHERE id = #{id}")
    public Address getAddressByID(int id);

    @Insert( "insert into smbms_address (contact, addressDesc, " +
            "postCode, tel, createdBy, creationDate, " +
            "modifyBy, modifyDate, userId) values (#{contact},#{addressDesc},#{postCode}"
            + ",#{tel},#{createdBy},#{creationDate},#{modifyBy},#{modifyDate},#{userId})" )
    public int addNewAddress(Address address);

    @Update("update smbms_address set "
            + "contact=#{contact},"
            + "addressDesc=#{addressDesc},"
            + "postCode=#{postCode},"    //注意这里的逗号
            + "tel=#{tel},"
            + "createdBy=#{createdBy},"
            + "creationDate=#{creationDate},"
            + "modifyBy=#{modifyBy},"
            + "modifyDate=#{modifyDate},"
            + "userId=#{userId}"
            + "where id=#{id}")
    public int updateAddress(Address address);

    @Delete("delete from smbms_address where id=#{id}")
    public int deleteAddressByID(int id);
}
