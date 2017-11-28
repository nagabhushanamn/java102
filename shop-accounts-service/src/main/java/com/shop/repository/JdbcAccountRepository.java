package com.shop.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.shop.db.MySQLConnectionFactory;
import com.shop.model.Account;

public class JdbcAccountRepository implements AccountRepository {

	public void save(Account account) {
		try (Connection connection = MySQLConnectionFactory.getConnection();) {
			String sql = "insert into shop1.ACCOUNTS values(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, account.getEmail());
			ps.setString(2, account.getPassword());
			ps.setString(3, account.getName());
			ps.setString(4, account.getMobile());
			int r = ps.executeUpdate();
			if (r != 1)
				throw new AccountCreationException();
		} catch (SQLException e) {
		}
	}

	public Account find(String email) {
		Account account = new Account();
		try (Connection connection = MySQLConnectionFactory.getConnection();) {
			String sql = "select * from shop1.ACCOUNTS where email=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				account.setEmail(email);
				account.setPassword(rs.getString(2));
				account.setName(rs.getString(3));
				account.setMobile(rs.getString(4));
			} else {
				throw new AccountNotFoundException();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;
	}

	public void update(Account account) {

	}

	public void delete(String email) {

	}

}
