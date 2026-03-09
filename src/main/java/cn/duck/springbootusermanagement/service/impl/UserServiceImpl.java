package cn.duck.springbootusermanagement.service.impl;

import cn.duck.springbootusermanagement.entity.User;
import cn.duck.springbootusermanagement.mapper.UserMapper;
import cn.duck.springbootusermanagement.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {

        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        wrapper.eq("password", password);

        return userMapper.selectOne(wrapper);
    }

    @Override
    public void register(User user) {

        userMapper.insert(user);

    }

    @Override
    public User getUserById(Long id) {

        return userMapper.selectById(id);

    }
}