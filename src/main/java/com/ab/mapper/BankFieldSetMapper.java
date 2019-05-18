package com.ab.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.ab.model.Bank;

public class BankFieldSetMapper implements FieldSetMapper<Bank>{

	@Override
	public Bank mapFieldSet(FieldSet fieldSet) throws BindException {
		Bank bank = new Bank();
		bank.setBankId(fieldSet.readInt(0));
		bank.setBankName(fieldSet.readString(1));
		bank.setIfsCode(fieldSet.readString(2));
		bank.setEstYear(fieldSet.readInt(3));
		return bank;
	}
	

}
