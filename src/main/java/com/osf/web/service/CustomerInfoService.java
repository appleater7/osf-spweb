package com.osf.web.service;

import java.util.List;
import java.util.Map;

public interface CustomerInfoService {

	public List<Map<String, String>> selectCustomerInfoList();
	public int insertCustomerInfo();
	public int updateCustomerInfo();
	public int deleteCustomerInfo();
}
