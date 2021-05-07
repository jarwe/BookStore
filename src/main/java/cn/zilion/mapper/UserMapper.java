package cn.zilion.mapper;

import cn.zilion.pojo.User;

public interface UserMapper {
    User findUserById(String userId);

    User validateUser(String username, String password);

    String updateUser(User user);

    String insertUser(User user);
}
