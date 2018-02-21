package core;

public class User {

    private String email;
    private String username;
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
        this.picture = "Beautiful picture";
    }

    @Override
    public String toString() {
        return username + " (" + email + ")";
    }
}
