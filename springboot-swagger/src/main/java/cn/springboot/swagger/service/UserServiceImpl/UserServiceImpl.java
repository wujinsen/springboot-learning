package cn.springboot.swagger.service.UserServiceImpl;

import cn.springboot.swagger.dao.UserDao;
import cn.springboot.swagger.domain.User;
import cn.springboot.swagger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User selectByPrimaryKey(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
