package cn.e_mall.spider.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * JDBC������
 * 
 * @author sz
 * 
 */
public class JDBCUtils {
	private static Properties prop = new Properties();

	private JDBCUtils() {

	}

	static {
		try {
			String path = JDBCUtils.class.getClassLoader()
					.getResource("jdbc.properties").getPath();
			prop.load(new FileInputStream(new File(path)));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * �������Ӷ���
	 * 
	 * @return
	 * @throws Exception
	 */
	public static Connection getConnection() throws Exception {
		// 1.ע����
		// ����: 1.����;������ݿ����������һ�� 2.ע����ע��������
		// DriverManager.registerDriver(new Driver());
		String driver = prop.getProperty("jdbc.driver");
		String url = prop.getProperty("jdbc.url");
		String user = prop.getProperty("jdbc.username");
		String password = prop.getProperty("jdbc.password");
		
		Class.forName(driver);

		// 2.��ȡ��ݿ�����
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}

	/**
	 * �ر���Դ
	 * 
	 * @param conn
	 * @param stat
	 * @param rs
	 */
	public static void close(Connection conn, Statement stat, ResultSet rs) {
		// 6.�ͷ���Դ
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}
		if (stat != null) {
			try {
				stat.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				stat = null;
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}

}
