/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Vy
 */
public class JDBCUtils {
    private Properties property;
	public Connection connection;

	public JDBCUtils() throws FileNotFoundException, IOException {
		property = new Properties();
		property.load(new FileInputStream(
				"C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\Java_HotelApplicationForStaff\\src\\backend\\resource\\database.properties"));
	}

// Phương thức kiểm tra kết nối tới DB
	public void connnectionTestting() throws ClassNotFoundException, SQLException {
		String url = property.getProperty("url");
		String Username = property.getProperty("username");
		String password = property.getProperty("password");
		String dirver = property.getProperty("driver");

		Class.forName(dirver);
		connection = DriverManager.getConnection(url, Username, password);
		System.out.println("Connect Success");
	}

// Phương thức tạo kết nối tới DB
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = property.getProperty("url");
		String Username = property.getProperty("username");
		String password = property.getProperty("password");
		String driver = property.getProperty("driver");
		Class.forName(driver);// throws ClassNotFoundException
		connection = DriverManager.getConnection(url, Username, password);// throws SQLException
                
          
		return connection;
	}

	public void disConnection() throws SQLException {
		connection.close();
	}

// Phương thức thực thi các câu lệnh Select trong chương trình
	public ResultSet executeQuery(String sql) throws ClassNotFoundException, SQLException {
		Connection connnection = getConnection();
		Statement statement = connnection.createStatement(); // Giống như 1 cửa sổ để làm việc
		ResultSet result = statement.executeQuery(sql);
		return result;
	}

// Phương thức tạo ra đối tượng PreparedStatement
	public PreparedStatement createPrepareStatement(String sql) throws ClassNotFoundException, SQLException {
		Connection connnection = getConnection();
		PreparedStatement preStatement = connnection.prepareStatement(sql);
		return preStatement;
	}
        
      public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException{
          JDBCUtils jDBCUtils = new JDBCUtils();
          jDBCUtils.connnectionTestting();
      }
    
}
