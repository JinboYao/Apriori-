package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionUtil {
	public static Connection conn;// Connection对象（连接）

	// 获取数据库连接
	public static Connection getConn() {
		try {
			// 加载并注册oracle的jdbc驱动
			Class.forName("oracle.jdbc.OracleDriver");
			// 编写连接字符串，创建并获取连接
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:CYY", "system", "cyycyy");
			System.out.println("数据库连接成功！"); //数据库连接测试
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// 关闭连接
	public static void CloseConn() {
		try {
			conn.close();// 关闭连接
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String [] args)	{ 
		getConn(); 
		}
}
