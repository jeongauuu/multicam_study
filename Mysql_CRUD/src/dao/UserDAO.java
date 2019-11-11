package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class UserDAO {
	public void createUserTable() {
		String sql = "create table users " 
				+ "(user_id varchar(10) , "
				+ "user_pw varchar(20) not null,"
				+ "constraint user_id_pk primary key(user_id))";

		Connection con = null;
		Statement st = null;
		try {
			con = JDBCUtil.getConnection();

			st = con.createStatement();
			st.executeUpdate(sql);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(con, st, null);
		}
	}
	
	public void registerUser(String id, String pw) {
		String sql =
				"insert into users (user_id,user_pw)"
				+ " values(?,?)";
		
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			//? 세팅작업
			
			ps.setString(1, id);
			ps.setString(2, pw);
			
			ps.executeUpdate();	//insert update delete
			
			//결과값 핸들링
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		
	}

	public int login(String id, String pw) {
		String sql =
				"select * from users where user_id = '?' and user_pw = '?'";
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int result = 0;
		try {
			con = JDBCUtil.getConnection();
			st = con.createStatement(); // statement 객체 생성
			rs = st.executeQuery(sql);
			if(rs != null) {
				result = 1;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JDBCUtil.close(con, st, rs);
		}
		
		return result;
		
		
	}
}

	