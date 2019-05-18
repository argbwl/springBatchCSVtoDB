package com.ab.batch.writer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.ab.model.Bank;

public class BankItemPSSetter implements ItemPreparedStatementSetter<Bank>{

	@Override
	public void setValues(Bank item, PreparedStatement ps) throws SQLException {
		ps.setInt(1, item.getBankId());
		ps.setString(2, item.getBankName());
		ps.setString(3, item.getIfsCode());
		ps.setInt(4, item.getEstYear());
	}

}
