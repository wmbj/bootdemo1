package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2017/4/10.
 */
@Mapper
public interface UserMapper {
    List<User> getAll();
    User getOne(String id);
    void insert(User user);
    void update(User user);
    void delete(String id);
}
