package cn.springboot.service;


import cn.springboot.swagger.Application;
import cn.springboot.swagger.domain.User;
import cn.springboot.swagger.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest(classes = Application.class)
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void userServiceTest() {
        User user = userService.selectByPrimaryKey(1);
        log.info("user: {}", user);
    }

}
