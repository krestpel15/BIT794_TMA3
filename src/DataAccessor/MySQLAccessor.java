/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessor;


import core.Library.Item;
import core.Library.Borrower;
import core.Library.Librarian;
import core.Library.Loan;
import core.Library.Reservation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author krest
 */
public class MySQLAccessor
{
    String driverName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://127.0.0.1:3306/library_management_system?autoReconnect=true&useSSL=false";
    String userName = "root";
    String password = "605240EKpp15";
    Connection con;
    
    
    //Access MySQL database
    public MySQLAccessor()
    {
        try
        {
            Class.forName(driverName).newInstance(); 
            con = DriverManager.getConnection(url, userName, password);
            int a =1;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    //fetch items from mySql item table
    public ArrayList getItems(){
        ArrayList <Item> itemList = new ArrayList();
        try
        { 
            String query1 = "SELECT * FROM item";
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(query1);
            while(rs.next()){
                Item item = new Item();
                item.setId(rs.getString("itemId"));
                item.setTitle(rs.getString("title"));
                item.setItemType(getItemType(rs.getString("itemType")));
                item.setCreator(rs.getString("creator"));
                item.setRentalDays(rs.getString("rentalDays"));
                itemList.add(item);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return itemList;

    }
    
    
    //itemType enum
    public Item.ItemType getItemType(String itemTypeString){
        switch (itemTypeString){
            case "Book":
                return Item.ItemType.Book;
            case "DVD":
                return Item.ItemType.DVD;
            case "Magazine":
                return Item.ItemType.Magazine;
            default:
                return Item.ItemType.Book; //book because this is most common
        }
    }
    
    
    //fetch borrowers from mySql borrower table
    public ArrayList <Borrower> GetBorrowerList(){
        ArrayList <Borrower> borrowerList = new ArrayList();
        try
        { 
           String query1 = "SELECT * FROM borrower";
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(query1);
            Borrower borrower;
            while(rs.next()){
                borrower = new Borrower(rs.getString("borrowerId"), rs.getString("name"), rs.getString("address"), 
                        rs.getString("phoneNum"));
                borrowerList.add(borrower);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return borrowerList;
    }
    
    
    //fetch loan from mySql loan table
    public ArrayList <Loan> getLoanList(){
        ArrayList <Loan> loanList = new ArrayList();
        try
        { 
           String query1 = "SELECT * FROM loan";
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(query1);
            Loan loan;
            while(rs.next()){
                loan = new Loan(rs.getString("loanId"), rs.getString("itemId"), rs.getString("borrowerId"), rs.getDate("startDate"), rs.getDate("returnDate"));
                loanList.add(loan);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return loanList;
    }
    
    
    //fetch reservation from mySql reserve table
     public ArrayList <Reservation> getReservationList(){
        ArrayList <Reservation> reservationList = new ArrayList();
        try
        { 
           String query1 = "SELECT * FROM reserve";
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(query1);
            Reservation reservation;
            while(rs.next()){
                reservation = new Reservation();
                reservation.setReserveID(rs.getString("reserveId"));
                reservation.setItemID(rs.getString("itemId"));
                reservation.setBorrowerID(rs.getString("borrowerId")); 
                reservation.setReservedDate(rs.getDate("reserveDate"));
                reservationList.add(reservation);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return reservationList;
    }
     
    
     
     //fetch reservation from mySql reserve table
     public ArrayList <Librarian> getLibrarianList(){
        ArrayList <Librarian> librarianList = new ArrayList();
        try
        { 
           String query1 = "SELECT * FROM librarian";
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery(query1);
            while(rs.next()){
                Librarian librarian = new Librarian();
                librarian.setId(rs.getString("librarianId"));
                librarian.setPassword(rs.getString("password"));
                librarian.setName(rs.getString("name"));
                librarian.setAddress(rs.getString("address"));
                librarian.setPhoneNum(rs.getString("phoneNum"));
                librarianList.add(librarian);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return librarianList;
    }
     
     
     //Add item to item table
    public void AddItem(Item item){
        //SQL add item
        String query = "insert into item (itemId, title, itemType, creator, rentalDays) values (?,?,?,?,?)";
        try (
            // create the statement
            PreparedStatement stmt = con.prepareStatement(query);) {

            stmt.setString(1, item.getId());
            stmt.setString(2, item.getTitle());
            stmt.setString(3, item.getItemType().toString());
            stmt.setString(4, item.getCreator());
            stmt.setString(5, item.getRentalDays());

            // execute the statement
            stmt.executeUpdate();

        } catch(Exception e){
            System.out.println(e);
        }
    } 
    
    
   //Add lilbrarian to librarian table
    public void AddLibrarian(Librarian librarian){
        //SQL add librarian
        String query = "insert into librarian (librarianId, password, name, address, phoneNum) values (?,?,?,?,?)";
        try (
            // create the statement
            PreparedStatement stmt = con.prepareStatement(query);) {

            stmt.setString(1, librarian.getId());
            stmt.setString(2, librarian.getPassword());
            stmt.setString(3, librarian.getName());
            stmt.setString(4, librarian.getAddress());
            stmt.setString(5, librarian.getPhoneNum());

            // execute the statement
            stmt.executeUpdate();

        } catch(Exception e){
            System.out.println(e);
        }
    }  
    
    
    //add borrower to borrower table
    public void AddBorrower(Borrower borrower){
        //sql add borrower
        String query = "insert into borrower (borrowerId, name, address, phoneNum) values (?,?,?,?)";
        try (
            // create the statement
            PreparedStatement stmt = con.prepareStatement(query);) {

            stmt.setString(1, borrower.getBorrowerId());
            stmt.setString(2, borrower.getName());
            stmt.setString(3, borrower.getAddress());
            stmt.setString(4, borrower.getPhoneNum());

            // execute the statement
            stmt.executeUpdate();

        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    //add reservation to reservation table
    public void AddReservation(Reservation reservation){
        //SQL add item
        String query = "insert into reserve (reserveId, itemId, borrowerId, reserveDate) values (?,?,?,?)";
        try (
            // create the statement
            PreparedStatement stmt = con.prepareStatement(query);) {

            stmt.setString(1, reservation.getReserveID());
            stmt.setString(2, reservation.getItemID());
            stmt.setString(3, reservation.getBorrowerID());
            
            java.util.Date utilDate = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            stmt.setString(4, sqlDate.toString());

            // execute the statement
            stmt.executeUpdate();

        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    //add loan to loan table
    public void AddLoan(Loan loan){
        //SQL add item
        String query = "insert into loan (loanId, itemId, borrowerId, startDate, returnDate) values (?,?,?,?,?)";
        try (
            // create the statement
            PreparedStatement stmt = con.prepareStatement(query);) {

            stmt.setString(1, loan.getLoanId());
            stmt.setString(2, loan.getItemId());
            stmt.setString(3, loan.getBorrowerId());
            
            java.sql.Date sqlDate = new java.sql.Date(loan.getStartDate().getTime());
            stmt.setString(4, sqlDate.toString());
            
            java.sql.Date sql2Date = new java.sql.Date(loan.getReturnDate().getTime());
            stmt.setString(5, sql2Date.toString());

            // execute the statement
            stmt.executeUpdate();

        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    //deletes an existent reservation from reserve table
    public void cancelReservation(String reserveId){
    
        String query = "delete from reserve where reserveId = ?";
        try (
		PreparedStatement stmt = con.prepareStatement(query);) {
		
                stmt.setString(1, reserveId);
		
                stmt.executeUpdate();
                
	}catch(Exception e){
            System.out.println(e);
        }  
    }
    
    
    //deletes an item from item table and deletes referenced object from loan and reserve tables
    public void deleteItem(String itemId){
    
        String query = "delete from item where itemId = ?";
        try (
		PreparedStatement stmt = con.prepareStatement(query);) {
		
                stmt.setString(1, itemId);
		
                stmt.executeUpdate();
                
	}catch(Exception e){
            System.out.println(e);
        }  
    }
    
    
    //deletes a borrower from borrower table
    public void deleteBorrower(String borrowerId){
    
        String query = "delete from borrower where borrowerId = ?";
        try (
		PreparedStatement stmt = con.prepareStatement(query);) {
		
                stmt.setString(1, borrowerId);
		
                stmt.executeUpdate();
                
	}catch(Exception e){
            System.out.println(e);
        }  
    }
    
    
    //deletes a librarian from librarian table
    public void deleteLibrarian(String librarianId){
    
        String query = "delete from librarian where librarianId = ?";
        try (
		PreparedStatement stmt = con.prepareStatement(query);) {
		
                stmt.setString(1, librarianId);
		
                stmt.executeUpdate();
                
	}catch(Exception e){
            System.out.println(e);
        }  
    }
    
    
    //return an item on loan, deleting selected item from loan table 
    public void returnItemOnLoan(String loanId){
    
        String query = "delete from loan where loanId = ?";
        try (
		PreparedStatement stmt = con.prepareStatement(query);) {
		
                stmt.setString(1, loanId);
		
                stmt.executeUpdate();
                
	}catch(Exception e){
            System.out.println(e);
        }  
    }
    
    
    //Edit item in item table
    public void editItem(Item item){
        //SQL add item
        String query = "update item set title = ?, itemType = ?, creator = ?, rentalDays = ? where itemid = ?";
        
        try (
            // create the statement
            PreparedStatement stmt = con.prepareStatement(query);) {
            
            stmt.setString(1, item.getTitle());
            stmt.setString(2, item.getItemType().toString());
            stmt.setString(3, item.getCreator());
            stmt.setString(4, item.getRentalDays());
            stmt.setString(5, item.getId());

            // execute the statement
            stmt.executeUpdate();

        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    //Edit borrower in borrower table
   public void editBorrower(Borrower borrower){
        //SQL add item
        String query = "update borrower set name = ?, address = ?, phoneNum = ? where borrowerId = ?";
        
        try (
            // create the statement
            PreparedStatement stmt = con.prepareStatement(query);) {

            stmt.setString(1, borrower.getName());
            stmt.setString(2, borrower.getAddress());
            stmt.setString(3, borrower.getPhoneNum());
            stmt.setString(4, borrower.getBorrowerId());

            // execute the statement
            stmt.executeUpdate();

        } catch(Exception e){
            System.out.println(e);
        }
    }
   
   //Edit librarian in librarian table
   public void editLibrarian(Librarian librarian){
        //SQL add item
        String query = "update librarian set password = ?, name = ?, address = ?, phoneNum = ? where librarianId = ?";
        
        try (
            // create the statement
            PreparedStatement stmt = con.prepareStatement(query);) {
            
            stmt.setString(1, librarian.getPassword());
            stmt.setString(2, librarian.getName());
            stmt.setString(3, librarian.getAddress());
            stmt.setString(4, librarian.getPhoneNum());
            stmt.setString(5, librarian.getId());

            // execute the statement
            stmt.executeUpdate();

        } catch(Exception e){
            System.out.println(e);
        }
    }
    
}
