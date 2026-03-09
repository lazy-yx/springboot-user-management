package cn.duck.springbootusermanagement.service;


import cn.duck.springbootusermanagement.entity.User;

public interface UserService {

    User login(String username, String password);

    void register(User user);

    User getUserById(Long id);

}