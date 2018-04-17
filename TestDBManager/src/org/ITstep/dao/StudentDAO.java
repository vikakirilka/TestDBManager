package org.ITstep.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.ITstep.model.Student;

public class StudentDAO {

	public void save(Student student) {
		Connection connect=DBConnection.getConnection();
		PreparedStatement statement = null;
		String sql = "INSERT INTO STUDENTS(first_name, second_name, birth_date, groups_id) VALUES(?, ?, ?, ?)";
		try {
			statement = connect.prepareStatement(sql);
			statement.setString(1, student.getFirstName());
			statement.setString(2, student.getSecondName());
			statement.setLong(3, student.getBirthDate());
			statement.setInt(4, student.getGroupId());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

	public long get(Student student) {
		long id=0;
		
		return id;

	}

	public void update(Student student) {

	}

	public void delete(long id) {

	}

}
