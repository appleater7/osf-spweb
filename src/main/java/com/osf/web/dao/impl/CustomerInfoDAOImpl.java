package com.osf.web.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.CustomerInfoDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class CustomerInfoDAOImpl implements CustomerInfoDAO {

	@Autowired
	private SqlSession ss;
	
	private static Map<String, String> param = new HashMap<String, String>();
	
	@Override
	public List<Map<String, String>> selectCustomerInfoList() {
		
		return ss.selectList("customer-info.selectCustomerInfoList");
	}

	@Override
	public int insertCustomerInfo() {
		return ss.insert("customer-info.insertCustomerInfoList", param);
	}

	@Override
	public int updateCustomerInfo() {
		
		return 0;
	}

	@Override
	public int deleteCustomerInfo() {
		
		return 0;
	}
	public static void main(String[] args) {
		param.put("ciId", "idabcd");
		param.put("ciPwd", "pwdabcd");
		param.put("ciName", "abcd");
		param.put("ciAge", "10");
		param.put("ciEmail", "abcd@narst.nef");
		param.put("ciZip", "35123");
		param.put("ciAddr1", "ad1abcd");
		param.put("ciAddr2", "ad2abcd");
		param.put("ciPhone", "01012341234");
		
		CustomerInfoDAO cidao = new CustomerInfoDAOImpl();
//		log.debug("insert result => {}",cidao.insertCustomerInfo());
		log.debug("insert result => {}",cidao.selectCustomerInfoList());
	}
}
