package cn.springboot.swagger.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class User {
    private Integer id;

    private String name;

    private Integer age;

    private String address;

}