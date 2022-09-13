package com.ecommerce.paymentservice.services;

import java.util.List;

import com.ecommerce.paymentservice.model.CardPayment;
import org.springframework.stereotype.Service;

import com.ecommerce.paymentservice.model.MobilePayment;

@Service
public interface PaymentService {

	public CardPayment addPayement(CardPayment cardPayment);
	public List<CardPayment> getAllPayements();
	
	public String PaymentIncompleted();
	public String PaymentIsNotfound();
	
	
	public List<MobilePayment> getAllMobilePayment();
	public MobilePayment addMobilePayment(MobilePayment mobilePayment);
	
	
}
