package challenge.database.programming_challenge;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="customers")
public class Customer {
    @Id
    private int id;
    private String emailAddress;
    private String title;
    private String firstName;
    private String lastName;
    private String addressLine_1;
    private String addressLine_2;
    private String city;
    private String postcode;
    private String phoneNumber;
    private Date registered;

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return this.lastName;
    }

    public void setaddressLine_1(String addressLine_1){
        this.addressLine_1 = addressLine_1;
    }

    public String getaddressLine_1(){
        return this.addressLine_1;
    }

    public void setaddressLine_2(String addressLine_2){
        this.addressLine_2 = addressLine_2;
    }

    public String getaddressLine_2(){
        return this.addressLine_2;
    }

    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }

    public void setPostcode(String postcode){
        this.postcode = postcode;
    }

    public String getPostcode(){
        return this.postcode;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setRegistered(Date registered){
        this.registered = registered;
    }

    public Date getRegistered(){
        return this.registered;
    }
}
