package cn.springboot.swagger.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Setter
@Getter
public class User {
    private Integer id;
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "年龄", name = "年龄2")
    private Integer age;


    @NotBlank(message = "aaa")
    @NotNull(message = "bbb")
    private String address;

}