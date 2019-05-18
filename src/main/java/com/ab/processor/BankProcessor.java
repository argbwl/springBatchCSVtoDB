package com.ab.processor;

import org.springframework.batch.item.ItemProcessor;

import com.ab.model.Bank;

public class BankProcessor implements ItemProcessor<Bank, Bank> {

	@Override
	public Bank process(Bank item) throws Exception {
		return item.getIfsCode().length()<10 ? null : item;
	}
	

}
