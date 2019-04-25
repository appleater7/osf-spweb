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
	public List<Map<String, String>> selectCustomerInfoList() {
		
		return cidao.selectCustomerInfoList();
	}

	@Override
	public int insertCustomerInfo() {

		return cidao.insertCustomerInfo();
	}

	@Override
	public int updateCustomerInfo() {

		return cidao.updateCustomerInfo();
	}

	@Override
	public int deleteCustomerInfo() {

		return cidao.deleteCustomerInfo();
	}

}
