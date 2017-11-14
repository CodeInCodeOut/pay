package com.dayuanit.pay.service;

public interface BankPayService {
	
	String pay(int payId, String password);
	
	void processSinaNotify(String data);

}
