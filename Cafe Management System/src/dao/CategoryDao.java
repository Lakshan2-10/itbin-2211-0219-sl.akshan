/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;

/**
 *
 * @author AKLakshan
 */
public class CategoryDao {
    public static void save(Category category){
        String query ="insert into category(name) values('"+category.getName()+"')";
        DBO.setDataOrDelete(query, "Category added successfully");
        
    }
    
    public static ArrayList<Category> getAllRecords(){
        ArrayList<Category> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBO.getData("Select * from category");
            while (rs.next()){
                Category category = new  Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        return arrayList;
    }
    
    public static void delete(String id){
        String query = "delete from category where id='"+id+"'";
        DBO.setDataOrDelete(query, "Category deleted successfully");
    }
}
