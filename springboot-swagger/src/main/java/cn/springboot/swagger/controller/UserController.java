package cn.springboot.swagger.controller;

import cn.springboot.swagger.domain.User;
import cn.springboot.swagger.service.UserService;
import com.google.common.base.Preconditions;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@Api(value = "用户接口")
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户", notes = "根据id查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "string")
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

    @ApiOperation(value="添加用户信息", notes = "添加用户信息")
    @ApiImplicitParam(name="user", value="User", required = true, dataType = "User")
    @PostMapping("/addUser")
    public Object addUser(@RequestBody User user){
        log.info("add user:{}", user);
        return "success";
    }

}
