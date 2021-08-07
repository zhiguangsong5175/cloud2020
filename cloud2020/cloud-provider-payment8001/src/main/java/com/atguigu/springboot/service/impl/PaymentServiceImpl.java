package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.dao.PaymentDao;
import com.atguigu.springboot.entities.Payment;
import com.atguigu.springboot.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
