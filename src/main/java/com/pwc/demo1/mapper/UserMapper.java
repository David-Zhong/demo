package com.pwc.demo1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pwc.demo1.model.User;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE ID = #{id}")
    User findById(@Param("id") Integer id);
    
    @Select("SELECT * FROM USER")
    List<User> findAllUser();

    @Insert("INSERT INTO USER(ID, NAME, AGE) VALUES(#{id}, #{name}, #{age})")
    int insert(@Param("id") Integer id,@Param("name") String name, @Param("age") Integer age);
    
    @Update("UPDATE USER SET NAME=#{name}, AGE=#{age} WHERE ID=#{id}")
    void updateById(@Param("name") String name, @Param("age") Integer age,@Param("id") Integer id);
    
    @Delete("DELETE FROM USER WHERE ID=#{id}")
    void deleteById(@Param("id") Integer id);
    

}