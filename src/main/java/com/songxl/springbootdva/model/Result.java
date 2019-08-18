package com.songxl.springbootdva.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: songxl
 * @Date: 2019-7-28 16:28
 * @Description:
 * @Version V1.0
 */
@Data
@NoArgsConstructor
public class Result implements Serializable {
    private Boolean success = false;
    private String data;
}
