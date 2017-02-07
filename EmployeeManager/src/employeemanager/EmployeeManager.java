/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Technicopro
 */
public class EmployeeManager {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        
        
        // create db connection
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root" , "");
        Statement s = c.createStatement();
        s.execute("SELECT * FROM employee INNER JOIN role ON employee.role_id = role.id;");
        ResultSet rs = s.getResultSet();
        
        
        while (rs.next()) {
            System.out.print("name: ");
            System.out.print( rs.getString("name"));
            System.out.print(",  ");
            
            System.out.print("data nasterii: ");
            System.out.print(rs.getString("birthdate"));
            System.out.print(", ");
            
            System.out.print(rs.getString("role.name"));
            
            System.out.print("\n");
            
        }
        
    }
    
}


