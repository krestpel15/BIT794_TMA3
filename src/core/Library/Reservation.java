/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.Library;

import java.util.Date;


/**
 *
 * @author krest
 */
public class Reservation
{
    private String reserveID;
    private String itemID;
    private String borrowerID;
    private Date reservedDate;
    
    //constructor for Reservation
    public Reservation(String reserveId, String itemId, String borrowerId, Date _reservedDate)
    {
        this.reservedDate = _reservedDate;
    }

    public Reservation()
    {
    }

    public String getReserveID()
    {
        return reserveID;
    }

    public void setReserveID(String reserveID)
    {
        this.reserveID = reserveID;
    }

    public String getItemID()
    {
        return itemID;
    }

    public void setItemID(String itemID)
    {
        this.itemID = itemID;
    }

    public String getBorrowerID()
    {
        return borrowerID;
    }

    public void setBorrowerID(String borrowerID)
    {
        this.borrowerID = borrowerID;
    }

    public Date getReservedDate()
    {
        return reservedDate;
    }

    public void setReservedDate(Date reservedDate)
    {
        this.reservedDate = reservedDate;
    }  
    
}
