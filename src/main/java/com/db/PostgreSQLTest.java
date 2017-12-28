/**
 * 
 */
package com.db;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Administrator
 * 2011-3-29
 */
public class PostgreSQLTest {

	/**
	 * @param args
	 */
	public static void postgreSQLTest(String[] args) {
		// TODO Auto-generated method stub
		DBConnection connection=new DBConnection();
		String driver = "org.postgresql.Driver"; // 驱动字符串
		String url = "jdbc:postgresql://"; // 连接字符串
		String host = "202.115.195.58"; // 连接到的主机
		String port = "5432"; // 端口号
		String dbname = "gzdb"; // 数据库名称
		String user = "postgres"; // 数据库用户名
		String password = "wlzx610068"; // 数据库密码
		String param = ""; //数据库连接参数
		connection.initConnParam(driver, url, host, port, dbname, user, password);
		try {
			Connection conn=connection.getConnection();
			System.out.println(conn.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
