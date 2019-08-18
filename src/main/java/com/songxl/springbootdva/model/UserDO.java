package com.songxl.springbootdva.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDO {
    private Integer id;
    private String username;
    private String password;
    private String gender;
    private Integer age;
}
