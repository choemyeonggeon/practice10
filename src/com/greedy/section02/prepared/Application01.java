package com.greedy.section02.prepared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.greedy.common.JDBCTemplate.getConnection;
import static com.greedy.common.JDBCTemplate.close;


public class Application01 {

	public static void main(String[] args) {

		Connection con = getConnection();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			pstmt = con.prepareStatement("Select EMP_ID, EMP_NAME FROM EMPLOYEE");
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				System.out.println(rset.getString("EMP_ID")+ ", " + rset.getNString("EMP_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}	finally {
			close(pstmt);
			close(rset);
			close(con);
		}

	
	}

}
