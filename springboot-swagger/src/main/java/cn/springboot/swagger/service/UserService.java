package cn.springboot.swagger.service;

import cn.springboot.swagger.domain.User;

public interface UserService {
    User selectByPrimaryKey(Integer id);
}
