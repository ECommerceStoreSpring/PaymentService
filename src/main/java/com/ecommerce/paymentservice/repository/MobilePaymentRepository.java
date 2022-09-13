package com.ecommerce.paymentservice.repository;

import com.ecommerce.paymentservice.model.MobilePayment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilePaymentRepository extends MongoRepository<MobilePayment,Long>{


}
