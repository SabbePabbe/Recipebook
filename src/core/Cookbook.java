package core;

import java.util.List;

public class Cookbook {

    private String id;
    private String userID;
    private String name;
    private List<Recipe> recipes;

    public Cookbook(String id, String userID, String name, List<Recipe> recipes)
    {
        this.id = id;
        this.userID =userID;
        this.name = name;
        this.recipes =recipes;
    }
    


}
