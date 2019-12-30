package springcloud.service.impl;

import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import springcloud.dao.PaymentDao;
import springcloud.service.PaymentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author King-qin
 * @create 2019-12-29 20:42
 */
@Service
public class PaymentServiceImpl  implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public void create(Payment payment) {
        paymentDao.create(payment);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Payment payment) {

    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public List<Payment> list() {
        return null;
    }
}
