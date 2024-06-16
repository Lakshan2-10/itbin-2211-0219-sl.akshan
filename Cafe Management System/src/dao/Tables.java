/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author AKLakshan
 */
public class Tables {
    public static void main(String []args){
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(30), email varchar(50), mobileNumber varchar(10),address varchar (200), password varchar(200), status varchar (20), UNIQUE(email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,status) values('Admin','cms@gmail.com','0123456789','Colombo','admin123','true')";
            String catTable = "create table categroy(id int AUTO_INCREMENT primary key, name varchar(200))"; 
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200),category varchar(200),price varchar(200))";
            String billTable = "create table bill(id int primary key, name varchar(200),mobileNumber varchar(200),email varchar (200),date varchar(50),total varchar (200),createdBy varchar(200))";
            
            DBO.setDataOrDelete(userTable, "User table created successfully");
            DBO.setDataOrDelete(adminDetails, "Admin details added successfully");
            DBO.setDataOrDelete(catTable, "Category table created successfully");
            DBO.setDataOrDelete(productTable, "Product table created successfully");
            DBO.setDataOrDelete(billTable, "Bill table created successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
