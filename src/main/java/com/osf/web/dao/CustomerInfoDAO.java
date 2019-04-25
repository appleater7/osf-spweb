package com.osf.web.dao;

import java.util.List;
import java.util.Map;

public interface CustomerInfoDAO {
	
	public List<Map<String, String>> selectCustomerInfoList();
	public int insertCustomerInfo();
	public int updateCustomerInfo();
	public int deleteCustomerInfo();
}
