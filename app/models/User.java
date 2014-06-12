package models;


import play.db.ebean.*;

import javax.persistence.Entity;

/**
 * Created by yxzhao on 6/12/14.
 */

@Entity
public class User extends Model {

    private String userName;
    private int zipCode;

    public User(String username, int zipCode) {
        this.userName = username;
        this.zipCode = zipCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public static Finder<Long, User> find = new Finder<>(Long.class, User.class);
}
