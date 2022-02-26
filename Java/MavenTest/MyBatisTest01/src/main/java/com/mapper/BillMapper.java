package com.mapper;

import com.entity.Bill;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BillMapper {

    @Select("select * from smbms_bill")
    public List<Bill> getBillList();


    @Select("SELECT * FROM smbms_bill WHERE id = #{id}")
    public Bill getBillByID(int id);

    @Insert( "insert into smbms_bill (billCode, productName, " +
            "productDesc, productUnit, productCount, totalPrice, isPayment, providerId, " +
            "createdBy, creationDate, modifyBy, modifyDate) values (#{billCode},#{productName},#{productDesc}"
            + ",#{productUnit},#{productCount},#{totalPrice},#{isPayment},#{providerId},#{createdBy}"
            + ",#{creationDate},#{modifyBy},#{modifyDate})" )
    public int addNewBill(Bill bill);

    @Update("update smbms_bill set "
            + "billCode=#{billCode},"
            + "productName=#{productName},"
            + "productDesc=#{productDesc},"    //注意这里的逗号
            + "productUnit=#{productUnit},"
            + "productCount=#{productCount},"
            + "totalPrice=#{totalPrice},"
            + "isPayment=#{isPayment},"
            + "providerId=#{providerId},"
            + "createdBy=#{createdBy},"
            + "creationDate=#{creationDate},"
            + "modifyBy=#{modifyBy}"
            + "modifyDate=#{modifyDate}"
            + "where id=#{id}")
    public int updateBill(Bill bill);

    @Delete("delete from smbms_bill where id=#{id}")
    public int deleteBillByID(int id);

}
