package com.simplilearn.procedure;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableStatementDemo {

	public static void main(String[] args) {
		Connection conn =	DBUtil.getDBConnection();


		try {

		CallableStatement cstmt =	(CallableStatement) conn.prepareCall("{call EMP_PRO1(?,?,?)}");

					cstmt.setInt(1, 120);
					cstmt.setString(2, "SWETA");
					cstmt.setInt(3, 88000);

					cstmt.execute(); // to execute given procedure 

					System.out.println("Stored Procedure called...");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		// TODO Auto-generated method stub

	}

}
}
