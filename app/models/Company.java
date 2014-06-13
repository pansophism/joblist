package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by yxzhao on 6/12/14.
 */

@Entity
public class Company extends Model {

    @Id
    private long Id;

    private String name;

    private String address;
    private int zipCode;


    public static Model.Finder<Long, Company> find = new Model.Finder<>(Long.class, Company.class);

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

}
