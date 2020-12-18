
package library.management;

import java.sql.*;
import java.util.Scanner;


public class Databaseconnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public Databaseconnect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/library?"+"user=root");
            st = con.createStatement();
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    public void getData()
    {
        try{
            String query = "SELECT * from b_list";
            rs = st.executeQuery(query);
            while(rs.next()){
                
                System.out.println("Book name: " + rs.getString("Book_name"));
                System.out.println("Book type: " + rs.getString("Book_type"));
                System.out.println("Author: " + rs.getString("Author"));
                
            }
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    
    public void insertData()
    {
        
        try{
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Book name :");
            String Book_name=sc.nextLine();
            System.out.println("Book type :");
            String Book_type = sc.nextLine();
            sc.nextLine();
            System.out.println("Author :");
            String Author = sc.nextLine();
            st.executeUpdate("INSERT INTO b_list(Book_name,Book_type,Author) VALUES('"+Book_name+"','"+Book_type+"','"+Author+"')");
            System.out.println("Values Added Succesfully!!");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    
    public void upDate()
    {
        
        try{
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Book name :");
            String Book_name=sc.nextLine();
            System.out.println("Book type :");
            String Book_type = sc.nextLine();
            st.executeUpdate("UPDATE b_list SET Book_type = '"+Book_type+"'WHERE Book_name='"+Book_name+"'");
            System.out.println("Values Update Succesfully!!");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
    public void delete()
    {
        
        try{
            Scanner sc = new Scanner(System.in);
         
            System.out.println("Book name :");
            String Book_name=sc.nextLine();
           
            st.executeUpdate("DELETE FROM b_list WHERE item ='"+Book_name+"'");
            System.out.println("Values Delete Succesfully!!");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro: "+ex);
        }
    }
}
