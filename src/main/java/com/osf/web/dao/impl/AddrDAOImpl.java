package com.osf.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.AddrDAO;

@Repository
public class AddrDAOImpl implements AddrDAO {
	
	@Autowired
	private DataSource ds;

	@Override
	public List<Map<String, String>> selectAddrList() {

		List<Map<String,String>> addrList = new ArrayList<Map<String, String>>();
		
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from address where ad_num < 10");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("adNum", rs.getString("ad_num"));
				map.put("adSido", rs.getString("ad_sido"));
				addrList.add(map);
			}
			return addrList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}	
}