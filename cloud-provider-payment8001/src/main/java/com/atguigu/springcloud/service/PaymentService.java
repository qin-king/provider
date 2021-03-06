package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entities.Payment;

import java.util.List;

/**
 * @author King-qin
 * @create 2019-12-29 20:41
 */
public interface PaymentService {

    public void create(Payment payment);

    public void delete(Long id);

    public void update(Payment payment);

    public Payment getPaymentById(Long id);

    public List<Payment> list();

}
