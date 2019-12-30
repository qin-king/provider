package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author King-qin
 * @create 2019-12-29 20:21
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
