package com.osf.web.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.CustomerInfoDAO;

@Repository
public class CustomerInfoDAOImpl implements CustomerInfoDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Map<String, String>> selectCustomerList() {
		
		return ss.selectList("customer.selectCustomerList");
	}

	@Override
	public Map<String, String> selectCustomer(Integer ciNum) {
		
		return null;
	}

	@Override
	public Map<String, String> selectCustomerById(String ciId) {
		
		return null;
	}

	@Override
	public int insertCustomer(Map<String, String> ci) {
		return ss.insert("customer.insertCustomer",ci);
	}

	@Override
	public int updateCustomer(Map<String, String> ci) {
		
		return 0;
	}

	@Override
	public int deleteCustomer(Integer ciNum) {
		
		return 0;
	}

	@Override
	public int deleteCustomerById(String ciId) {
		
		return 0;
	}
}
