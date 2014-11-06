package cn.edu.shou.hsh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.shou.hsh.model.Employee;



@Service
public class EmployeeDao {
	private Employee employee;
	private Statement stmt=null;  
	private ResultSet rs=null;  
	public List<Employee> getEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		try{
			rs = stmt.executeQuery("select * from student order by id desc");
			while(rs.next()){
				employee = new Employee();
				employee.setName(rs.getString("name"));
				employee.setNumber(rs.getString("number"));
				employee.setEmail(rs.getString("email"));
				System.out.println(employee.getName()+"...name");//�����ͬ
				list.add(employee);//����list
			}
			for(Employee item:list){
				System.out.println(item.getName()+"...");//�����ͬ
			}
		}catch(Exception ex)  
        {  
            ex.printStackTrace();  
        }  
		
		return list;
	}
	public EmployeeDao() {
		//mysql����
		try  
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nodejs","root","root");   
            stmt = (Statement)conn.createStatement();   
            /*rs = stmt.executeQuery("SELECT * from student");   
  
            while (rs.next())   
            {   
                 System.out.println(rs.getString(2));  
            }   */
        }  
        catch(Exception ex)  
        {  
            ex.printStackTrace();  
        }  
	}
}
