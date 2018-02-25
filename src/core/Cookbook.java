package core;

import java.util.List;

public class Cookbook {

    private String id;
    private String userID;
    private String cookbookName;
    private List<Recipe> recipes;



    public Cookbook(String id, String userID, String cookbookName, List<Recipe> recipes)
    {
        this.id = id;
        this.userID =userID;
        this.cookbookName = cookbookName;
        this.recipes =recipes;
    }



    @Override
    public String toString(){
        return "Cookbook{" + "id = " + id +
                ", userID = " + userID +
                ", Cookbook Name = " + cookbookName + "}";
    }

    


}
