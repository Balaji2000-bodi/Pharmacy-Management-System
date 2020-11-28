
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Desktop
 */
public class createdb {
    Connection con;
    ResultSet result;
    Statement state;
    PreparedStatement prepare;
    String usr="USERNAME";
    String pass="PASSWORD";
    String mail="MAIL";
    String gender="GENDER";
    String addr="ADDRESS";
    String refer="REFER";
    String date="DATE";
    String mob="MOBILE";
    String name="NAME";
    String prob="PROBLEM";
    String medunit="MEDICINEUNIT";
    String mdate="MANDATE";
    String edate="EXPDATE";
    String amnt="AMOUNT";
    
    public static void main(String args[]){
        createdb db=new createdb();
        db.create();
    }
    public void create(){
        try {
            con=jconnect.connectDB();
            String sql2="CREATE TABLE STOCKENTRY("+name+" VARCHAR(10),"+prob+" VARCHAR(20),"+medunit+" VARCHAR(5),"+mdate+" VARCHAR(10),"+edate+" VARCHAR(10),"+amnt+" VARCHAR(12))";
            String sql="CREATE TABLE SIGNUP("+usr+" VARCHAR(20),"+pass+" VARCHAR(20),"+mail+" VARCHAR(20),"+gender+" VARCHAR(10),"+addr+" VARCHAR(30),"+refer+" VARCHAR(10),"+date+" VARCHAR(10),"+mob+" VARCHAR(12))";
            state=con.createStatement();
            state.execute(sql);
            state.execute(sql2);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
