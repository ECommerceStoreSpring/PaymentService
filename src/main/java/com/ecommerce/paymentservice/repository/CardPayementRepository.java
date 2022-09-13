package com.ecommerce.paymentservice.repository;

import com.ecommerce.paymentservice.model.CardPayment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardPayementRepository extends MongoRepository<CardPayment,String>{

}
