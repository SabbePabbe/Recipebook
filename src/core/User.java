package core;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class User implements Serializable{

    @Id
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    @Column(nullable=false)
    private String username;

    @Getter
    @Setter
    private String picture;

    //TODO: don't know how to handle images. store on database? in that case this link may be useful, idk:
    // https://stackoverflow.com/questions/16654579/java-ee-upload-image-to-database

    public User(String email, String username, String picture){
        this.email = email;
        this.username = username;
        this.picture = picture;

    }

    public User() {
        this.email = "test@email.com";
        this.username = "Test Name";
        this.picture = "Test picture";
    }

    @Override
    public String toString() {
        return username + " (" + email + ")";
    }

}
