package com.osf.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osf.web.dao.CustomerInfoDAO;
import com.osf.web.service.CustomerInfoService;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {
	@Autowired
	private CustomerInfoDAO cidao;
	
	@Override
	public List<Map<String, String>> selectCustomerList() {
		
		return cidao.selectCustomerList();
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
		
		return cidao.insertCustomer(ci);
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
