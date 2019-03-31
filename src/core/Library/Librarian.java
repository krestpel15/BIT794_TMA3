/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.Library;

/**
 *
 * @author krest
 */
public class Librarian
{
    private String id;
    private String name;
    private String password;
    private String phoneNum;
    private String address;
    
    //constructor for Librarian

    public Librarian(String id, String name, String password, String phoneNum,
            String address)
    {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phoneNum = phoneNum;
        this.address = address;
    }
    
    
    public Librarian(){}

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    
    
    
    
    
    //getter for Librarian name
    public String getName()
    {
        return name; 
    }
    
    //setter for Librarian name
    public void setName(String _name)
    {
       name = _name; 
    }
    
    //getter for Librarian password
    public String getPassword()
    {
        return password;
    }
    
    //setter for Librarian password
    public void setPassword(String _password)
    {
        password = _password;
    }
    
    //getter for Librarian phone number
    public String getPhoneNum()
    {
        return phoneNum;
    }
    
    //setter for Librarian phone number
    public void setPhoneNum(String _phoneNum)
    {
        phoneNum = _phoneNum;
    }
    
    //getter for Librarian address
    public String getAddress()
    {
        return address;
    }
    
    //setter for Librarian address
    public void setAddress(String _address)
    {
        address = _address;
    }
    
    @Override
    public String toString()
    {
        return "Librarian Name: " + name + " | Librarian Password: " + password
                + " | Librarian Phone number: " + phoneNum + " | Librarian Address: "
                + address;
    }
}
