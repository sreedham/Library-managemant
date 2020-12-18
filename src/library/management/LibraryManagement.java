
package library.management;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.sql.*;

public class LibraryManagement {


    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("::: LIBRARY Management :::");
       
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Login: \n1.Admin\n3.Exit");
            int option = input.nextInt();
            if(option == 1) {
                
                    Scanner input2 = new Scanner(System.in);
            System.out.println("\n1.Add Book\n2.Book List \n3.Update Book type\n4.Delete Book");
            int option1 = input2.nextInt();
            switch (option1) {
                case 1:
                    Databaseconnect co = new Databaseconnect();
                    co.insertData();
                    continue;
                case 2:
                    Databaseconnect a = new Databaseconnect();
                    a.getData();
                    continue;
                case 3:
                    Databaseconnect b = new Databaseconnect();
                    b.upDate();
                    continue;    
                case 4:
                    Databaseconnect c = new Databaseconnect();
                    c.delete();
                    continue;    
                
                default:
                    System.out.println(" wrong option.");
                    break ;
            } 
            System.out.println("\n....Complete...\n");
                    break ;
            }
            
            
                   
            
            else if(option ==3)
            {
                System.out.println("\n Thank You\n");
                break;
            }
        }
        
        
    }
    
}
    

