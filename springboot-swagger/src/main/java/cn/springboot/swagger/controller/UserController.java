package cn.springboot.swagger.controller;

import cn.springboot.swagger.domain.User;
import cn.springboot.swagger.service.UserService;
import com.google.common.base.Preconditions;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shaomaolin on 2018/11/2.
 */
@Api(value = "用户接口")
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户", notes = "根据id查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Integer")
    @ResponseBody
    @GetMapping(value = "/queryUser")
    public String queryRuleUser(int id) {
        try {
            User user = userService.selectByPrimaryKey(id);
            Preconditions.checkNotNull(user, "查询用户信息为空！");
            return user.toString();
        } catch (Exception e) {
            log.error("查询用户失败！", e);
            throw new RuntimeException(e.getMessage());
        }

    }

}
