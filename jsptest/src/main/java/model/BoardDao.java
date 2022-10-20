package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDao {
	
	Connection con;	PreparedStatement ps;	ResultSet rs;
	public BoardDao() {
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			 con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jsptest", 
					"root",
					"1234");
		}catch (Exception e) { System.out.println(e);}
	}
	
	public boolean bwrite(String btitle, String bcontent, String bid, String bpw) {
		String sql = "Insert into board(btitle, bcontent, bid, bpw) values (?, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, btitle);
			ps.setString(2, bcontent);
			ps.setString(3, bid);
			ps.setString(4, bpw);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.out.println(e);
		}
		return false;
	}
	
	public ArrayList<BoardDto> getlist() {
		ArrayList<BoardDto> list = new ArrayList<>();
		String sql = "select * from board";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				BoardDto dto = new BoardDto(
					rs.getInt(1), rs.getString(2),
					rs.getString(3), rs.getString(4),
					rs.getString(5), rs.getString(6),
					rs.getInt(7)
					);
				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
	public BoardDto getboard(int bno) {
		System.out.println(bno);
		String sql = "select * from board where bno = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			rs = ps.executeQuery();
			while(rs.next()) {
				BoardDto dto = new BoardDto(
							rs.getInt(1), rs.getString(2),
							rs.getString(3), rs.getString(4),
							rs.getString(5), rs.getString(6),
							rs.getInt(7)
						);
				return dto;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
}
















