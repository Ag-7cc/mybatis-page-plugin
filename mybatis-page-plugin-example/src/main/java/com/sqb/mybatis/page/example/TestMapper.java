package com.sqb.mybatis.page.example;

import com.sqb.mybatis.page.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by vic.shan
 * Date: 2016/7/6.16:45
 */
public interface TestMapper {

    List<TestBean> selectAll();

    List<TestBean> selectAll(Pagination page);

    List<TestBean> selectByCity(String city);

    List<TestBean> selectByCity(@Param("city") String city, Pagination page);

    List<TestBean> selectByCityAndOlderThanAge(@Param("city") String city, @Param("age") int age);

    List<TestBean> selectByCityAndOlderThanAge(@Param("city") String city, @Param("age") int age, Pagination page);
}
