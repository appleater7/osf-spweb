package com.osf.web.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public interface AddrDAO {
	public List<Map<String, String>> selectAddrList();
}
