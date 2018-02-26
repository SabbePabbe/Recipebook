package core;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode()
@Entity
public class Cookbook implements Serializable {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    @Column(nullable=false)
    private String userID;

    @Getter
    @Setter
    @Column(nullable=false)
    private String name;

    @Getter
    @Setter
    //TODO: add new class to connect Recipes with Cookbooks? Shouldn't have list as db element.
    private List<Recipe> recipes;

    public Cookbook(String id, String userID, String name, List<Recipe> recipes)
    {
        this.id = id;
        this.userID =userID;
        this.name = name;
        this.recipes =recipes;
    }
    


}
