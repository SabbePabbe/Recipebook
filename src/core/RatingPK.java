package core;

import java.io.Serializable;

//@EqualsAndHashCode
public class RatingPK implements Serializable {

  //  @Getter
    private String userId;

    //@Getter
    private String recipeId;


    public RatingPK(String userId, String recipeId) {
        this.userId = userId;
        this.recipeId = recipeId;
    }


    @Override
    public String toString() {
        return "RatingPK{" +
                "userId='" + userId + '\'' +
                ", recipeId='" + recipeId + '\'' +
                '}';
    }
}
