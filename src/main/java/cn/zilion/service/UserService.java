package cn.zilion.service;

import cn.zilion.pojo.User;

public interface UserService {
    String addUser(User user);

    String updateUser(User user);

    User findUserById(String userId);

    User validateUser(User user);
}
