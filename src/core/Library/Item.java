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
public class Item
{
    
    private String id;
    private String title;
    private ItemType itemType;
    private String creator;
    private String rentalDays;
    
    public enum ItemType
    {
        Book,DVD,Magazine;

        public ItemType getItemType()
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
    
    public Item()
    {
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public ItemType getItemType()
    {
        return itemType;
    }

    public void setItemType(ItemType itemType)
    {
        this.itemType = itemType;
    }

    public String getCreator()
    {
        return creator;
    }

    public void setCreator(String creator)
    {
        this.creator = creator;
    }

    public String getRentalDays()
    {
        return rentalDays;
    }

    public void setRentalDays(String rentalDays)
    {
        this.rentalDays = rentalDays;
    }

    @Override
    public String toString()
    {
        return "Item{" + "id=" + id + ", title=" + title + ", itemType=" + itemType + ", creator=" + creator + ", rentalDays=" + rentalDays + '}';
    }
    
    
    
}
