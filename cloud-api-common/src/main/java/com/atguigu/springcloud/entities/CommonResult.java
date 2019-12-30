package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author King-qin
 * @create 2019-12-29 20:25
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T data;
}
