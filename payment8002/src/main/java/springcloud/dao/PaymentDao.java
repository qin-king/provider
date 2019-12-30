package springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author King-qin
 * @create 2019-12-29 20:29
 */
@Mapper
public interface PaymentDao {
    public void create(Payment payment);

    public Payment getPaymentById(Long id);
}
