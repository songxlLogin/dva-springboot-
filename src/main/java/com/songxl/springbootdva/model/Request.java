package com.songxl.springbootdva.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: songxl
 * @Date: 2019-7-28 18:53
 * @Description:
 * @Version V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    private String id;
    private String name;
    private String fileName;
}
