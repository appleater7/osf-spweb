package com.osf.web.service;

import java.util.List;
import java.util.Map;

public interface CustomerInfoService {
	List<Map<String,String>> selectCustomerList();
	Map<String,String> selectCustomer(Integer ciNum);
	Map<String,String> selectCustomerById(String ciId);
	int insertCustomer(Map<String,String> ci);
	int updateCustomer(Map<String,String> ci);
	int deleteCustomer(Integer ciNum);
	int deleteCustomerById(String ciId);
}
