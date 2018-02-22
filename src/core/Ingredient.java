package core;


import lombok.*;
import javax.persistence.*;

@NoArgsConstructor
@EqualsAndHashCode(of = {"id", "name"})
@Entity
@IdClass(IngredientPK.class)
//@Table( name="ingredient")
public class Ingredient {

    @Id
    @Getter
    @Setter
    @Column(nullable=false)
    private String id;

    @Id
    @Getter
    @Setter
    @Column(nullable=false)
    private String name;

    public Ingredient(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "id=" + id + ", name=" + name + "}";
    }

}
