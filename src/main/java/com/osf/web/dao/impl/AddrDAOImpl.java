package com.osf.web.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.AddrDAO;

@Repository
public class AddrDAOImpl implements AddrDAO {
	
//	@Autowired
//	private DataSource ds;
//	@Autowired
//	private SqlSessionFactory ssf;
	@Autowired
	private SqlSession ss;

	@Override
	public List<Map<String, String>> selectAddrList() {
//		List<Map<String,String>> addrList = new ArrayList<Map<String, String>>();
//		
//		try {
//			Connection con = ds.getConnection();
//			PreparedStatement ps = con.prepareStatement("select * from address where ad_num < 10");
//			ResultSet rs = ps.executeQuery();
//			
//			while (rs.next()) {
//				Map<String, String> map = new HashMap<String, String>();
//				map.put("adNum", rs.getString("ad_num"));
//				map.put("adSido", rs.getString("ad_sido"));
//				addrList.add(map);
//			}
//			return addrList;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return null;
		
//		SqlSession ss = ssf.openSession();
//		ss = new SqlSessionTemplate(ssf);
		Map<String, String> param = new HashMap<String, String>();
		param.put("adNum", "10");
		param.put("adSido", "부산광역시");
		
		return ss.selectList("addr.selectAddrList", param);
		
	}
}