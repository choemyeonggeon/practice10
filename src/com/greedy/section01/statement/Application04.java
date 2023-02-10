package com.greedy.section01.statement;
import static com.greedy.common.JDBCTemplate.getConnection;
import static com.greedy.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import com.greedy.model.dto.DepartmentDTO;
public class Application04 {

	public static void main(String[] args) {

		Connection con = getConnection();
		
		Statement stmt = null;
		ResultSet rset = null;
		
		DepartmentDTO selectedEmp = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("D에해당하는 부서코드를 넣어주세요");
		String DEPT_ID = sc.nextLine();
		
		String query = "SELECT * FROM DEPARTMENT WHERE DEPT_ID = '" + DEPT_ID + "'";
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				selectedEmp = new DepartmentDTO();
				
				selectedEmp.setDeptId(rset.getString("DEPT_ID"));
				selectedEmp.setDeptTitle(rset.getString("DEPT_TITLE"));
				selectedEmp.setLocationId(rset.getString("LOCATION_ID"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
			close(con);
		}
		System.out.println(selectedEmp);
	
	}
	}