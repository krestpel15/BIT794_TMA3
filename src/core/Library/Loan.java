/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.Library;

import java.util.Date;
import java.util.Map;

/**
 *
 * @author krest
 */
public class Loan
{
    private String loanId;
    private String itemID;
    private String borrowerID;
    private Date startDate;
    private Date returnDate;

    
    //constructor for Loan
    public Loan(String L_loanId, String L_itemId, String L_borrowerId, Date L_startDate, Date L_returnDate)
    {
        this.loanId = L_loanId;
        this.itemID = L_itemId;
        this.borrowerID = L_borrowerId;
        this.startDate = L_startDate;
        this.returnDate = L_returnDate;
    }

    public Loan(){}

    //getter for loan id
    public String getLoanId()
    {
        return loanId;
    }
    
    //setter for loan id
    public void setLoanId(String _loanId)
    {
        loanId = _loanId;
    }
    
    //getter for item id
    public String getItemId()
    {
        return itemID;
    }

    //setter for item id
    public void setItemID(String itemID)
    {
        this.itemID = itemID;
    }
    
    //getter for Borrower Id
    public String getBorrowerId()
    {
        return borrowerID;
    }
    
    //setter for Borrower Id
    public void setBorrowerId(String _borrowerId)
    {
        borrowerID = _borrowerId;
    }
    
    //getter for Loan start date
    public Date getStartDate()
    {
        return startDate;
    }
    
    //setter for start date
    public void setStartDate(Date _startDate)
    {
        startDate = _startDate;
    }
    
    //getter for return date
    public Date getReturnDate()
    {
        return returnDate;
    }
    
    //setter for Loan return date
    public void setReturnDate(Date _returnDate)
    {
        returnDate = _returnDate;
    }
    
    @Override
    public String toString()
    {
        return "\nItem on Loan " + itemID + "\n to " + borrowerID + "\n on " + startDate 
                + " \nreturn on " + returnDate;
    }
}
