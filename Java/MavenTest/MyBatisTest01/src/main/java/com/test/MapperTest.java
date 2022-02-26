package com.test;

import com.entity.*;
import com.mapper.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

public class MapperTest {

    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession Session = sqlSessionFactory.openSession();

        /*****
         * UserMapper测试
         */

        UserMapper userMapper = Session.getMapper(UserMapper.class);

        //Select
        User user = userMapper.getUserByID( 16 );
        List<User> userList = userMapper.getUserList();
        System.out.println(user);
        System.out.println(userList);

        //Insert
//        User newUser = new User( "jerome",  "雷军",  "123456",
//                2, Date.valueOf("2020-09-29"),  "1234864674",  "陕西省西安市长安区",
//                1,  1,  Date.valueOf("2020-09-29"),
//                2,  new Date(System.currentTimeMillis()));
//        userMapper.addNewUser(newUser);
//        Session.commit();

        //Update
//        User updateUser = userMapper.getUserByID(16);
//        updateUser.setUserCode("leijun");
//        updateUser.setUserName("雷军");
//        updateUser.setUserPassword("0000000");
//        userMapper.updateUser(updateUser);
//        Session.commit();

        //Delete
//        userMapper.deleteUserByID(16);
//        Session.commit();

        /****
         * roleMapper测试
         */

        RoleMapper roleMapper = Session.getMapper(RoleMapper.class);

        //Select
        List<Role> roleList = roleMapper.getRoleList();
        Role role = roleMapper.getRoleByID(2);

        System.out.println(roleList);
        System.out.println(role);


        //Insert



        //Update



        //Delete


        /****
         * providerMapper测试
         */

        ProviderMapper providerMapper = Session.getMapper(ProviderMapper.class);

        //Select
        List<Provider> providers = providerMapper.getProviderList();
        Provider provider = providerMapper.getProviderByID(3);
        System.out.println(providers);
        System.out.println(provider);

        //Insert


        //Update


        //Delete


        /****
         * billMapper测试
         */

        BillMapper billMapper = Session.getMapper(BillMapper.class);

        //Select
        List<Bill> billList = billMapper.getBillList();
        Bill bill = billMapper.getBillByID(18);
        System.out.println(billList);
        System.out.println(bill);


        //Insert


        //Update


        //Delete


        /****
         * addressMapper测试
         */
        AddressMapper addressMapper = Session.getMapper(AddressMapper.class);

        //Select
        List<Address> addressList = addressMapper.getAddressList();
        Address address = addressMapper.getAddressByID(3);
        System.out.println(addressList);
        System.out.println(address);


        //Insert
        Address newAddress = new Address("雷军", "西安市长安区韦曲街道西安培华学院",
                "100000", "17897836967", 1, Date.valueOf("2020-10-03"), 1,
                new Date(System.currentTimeMillis()), 2);
        addressMapper.addNewAddress(newAddress);
        Session.commit();

        //Update


        //Delete

    }

}
