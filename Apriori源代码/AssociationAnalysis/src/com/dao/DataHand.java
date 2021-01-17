package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.connectionUtil;
public class DataHand {
	private String type="脾胃处方总表"; //设置类型
	public ArrayList<String> getDetail() {
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			conn = connectionUtil.getConn();
			String sql = "select * from " + this.type;
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);			
			List<Prescription> prescriptions = new ArrayList<Prescription>();
			while(rs.next()) {
				int m_id = rs.getInt("编号");
				String pname = rs.getString("处方");
				Prescription prescription = new Prescription();
				prescription.setMedid(m_id);
				prescription.setName(pname);
				prescriptions.add(prescription);
			}				
			ArrayList<String> plist = new ArrayList<String>();			
			String pnames;
			pnames = prescriptions.get(0).getName() + "、";			
			for(int i=0;i<prescriptions.size()-1;i++) {
				if(prescriptions.get(i).getMedid()==prescriptions.get(i+1).getMedid()) {
					pnames += prescriptions.get(i+1).getName() + "、";
				}
				else {
					plist.add(pnames);
					pnames = prescriptions.get(i+1).getName() + "、";
				}
			}
			plist.add(pnames);
		
			return plist;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}	

	public static void main(String args[]) {
		DataHand dh = new DataHand();
		ArrayList<String> list = dh.getDetail();
		System.out.println(list.size());
		for(String str : list) {
			System.out.println("处方：" + str);
		}
	
	}
	
	
	
}
