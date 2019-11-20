package mum.edu.leafhomestay.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.leafhomestay.domain.Payment;
import mum.edu.leafhomestay.repository.PaymentRepository;
import mum.edu.leafhomestay.service.PaymentService;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public void savePayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentRepository.save(payment);
	}
 
	
}
