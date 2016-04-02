/**
 * 
 */
package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Administrator 2011-3-29
 */
public class DBConnection {
	private String DRIVER = ""; // 驱动字符串
	private String URL = ""; // 连接字符串
	private String HOST = ""; // 连接到的主机
	private String PORT = ""; // 端口号
	private String DBNAME = ""; // 数据库名称
	private String USER = ""; // 数据库用户名
	private String PASSWORD = ""; // 数据库密码
	private String PARAM = ""; //数据库连接参数

	// 建立与数据库的连接
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL + HOST + ":" + PORT
				+ "/" + DBNAME, USER, PASSWORD);
	}

	public void initConnParam(String driver, String url, String host,
			String port, String dbname, String user, String password) {
		this.DRIVER=driver;
		this.URL=url;
		this.HOST=host;
		this.PORT=port;
		this.DBNAME=dbname;
		this.USER=user;
		this.PASSWORD=password;
	}
}
