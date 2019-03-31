/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.Library;

import java.util.Map;



/**
 *
 * @author krest
 */
public class Borrower
{
    private String name;
    private String borrowerId;
    private String phoneNumber;
    private String address;
    private Borrower borrower;
    
    //constructor for Borrower
    public Borrower(String B_borrowerId, String B_name, String B_address, String B_phoneNum)
    {
        this.borrowerId = B_borrowerId;
        this.name = B_name;
        this.address = B_address;
        this.phoneNumber = B_phoneNum;
        
    }
    
    public Borrower(){
        
    }


    
    //getter for Borrower
    public Borrower getBorrower()
    {
        return borrower;
    }
    
    //setter for Borrower
    public void setBorrower(Borrower _borrower)
    {
        borrower = _borrower;
    }
    
    //getter for Borrower name
    public String getName()
    {
        return name;
    }
    
    //setter for Borrower name
    public void setName(String _name)
    {
        name = _name;
    }
    
    //getter for Borrower id
    public String getBorrowerId()
    {
        return borrowerId;
    }
    
    //setter for Borrower library card number
    public void setBorrowerId(String _borrowerId)
    {
        borrowerId = _borrowerId;
    }
    
    //getter for Borrower phone number
    public String getPhoneNum()
    {
        return phoneNumber;
    }
    
    //setter for Borrower phone number
    public void setPhoneNum(String _phoneNum)
    {
        phoneNumber = _phoneNum;
    }
    
    //getter for borrower address
    public String getAddress()
    {
        return address;
    }
    
    //setter for Borrower address
    public void setAddress(String _address)
    {
        address = _address;
    }
    
    @Override
    public String toString()
    {
        return "Borrower Name: " + name + " | Borrower Id: " + borrowerId
                + " | Borrower Phone number: " + phoneNumber + " | Borrower Address: "
                + address;
    }
}

