package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author King-qin
 * @create 2019-12-29 22:02
 */
@RestController
public class OrderController {
   // public static final String PAYMENT_URL="http://localhost:8001";
   public static final String PaymentSrv_URL = "http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult create(Payment payment){
        return  restTemplate.postForObject(PaymentSrv_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id){
        return  restTemplate.getForObject(PaymentSrv_URL+"/payment/get/"+id,CommonResult.class,id);
    }
}
