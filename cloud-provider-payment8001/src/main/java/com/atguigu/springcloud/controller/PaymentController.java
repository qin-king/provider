package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author King-qin
 * @create 2019-12-29 20:47
 */
@RestController
public class PaymentController {
    @Resource
   private PaymentService paymentService;
    @PostMapping(value="/payment/create")
   public CommonResult create(@RequestBody Payment payment){
       paymentService.create(payment);
       return new CommonResult(200,"插入mysqlOK",payment);
   }
    @GetMapping("/payment/get/{id}")
    public CommonResult gePayment(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult(200,"查询信息见右： ",payment);
    }



}
