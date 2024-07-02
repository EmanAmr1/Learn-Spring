package org.spring.BeanLifeCycle;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentDAO dao = new StudentDAO();
        dao.selectAllRows();
        dao.deleteStudentRecord(1);

    }
}
