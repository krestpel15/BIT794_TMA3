/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.Item;

/**
 *
 * @author krest
 */
public enum ItemType
{
    BOOK,DVD,MAGAZINE;

    private static String string;
    private static Integer hireDays;
    private static String creatorName;
    private static ItemType itemType;

    ItemType(){
        
    }

    @Override
    public String toString() {

        switch(this) {
            case BOOK: {
                string = "Book";
                break;
            }
            case DVD: {
                string = "DVD";
                break;
            }
            case MAGAZINE: {
                string = "Magazine";
                break;
            }
        }
        return string;
    }

    public Integer getRentalDays() {

        switch(this) {
            case BOOK: {
                hireDays = 21;
                break;
            }
            case DVD: {
                hireDays = 7;
                break;
            }
            case MAGAZINE: {
                hireDays = 7;
                break;
            }
        }
        return hireDays;
    }

    public String getCreatorName() {

        switch(this) {
            case BOOK: {
                creatorName = "Author(s)";
                break;
            }
            case DVD: {
                creatorName = "Director";
                break;
            }
            case MAGAZINE: {
                creatorName = "Publisher";
                break;
            }
        }
        return creatorName;
    }
    
     public ItemType getItemType()
     {
         return itemType;
     }
}
