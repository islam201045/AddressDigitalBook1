/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digital.address.book;

/**
 *
 * @author Microsoft
 */
public abstract class CommnInfo{
    private String City ;
    private String Country ;
    private String Email ;
    private String Postlcode;
    private int Telphone;

    public CommnInfo(String City, String Country, String Email, String Postlcode, int Telphone) {
        this.City = City;
        this.Country = Country;
        this.Email = Email;
        this.Postlcode = Postlcode;
        this.Telphone = Telphone;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPostlcode() {
        return Postlcode;
    }

    public void setPostlcode(String Postlcode) {
        this.Postlcode = Postlcode;
    }

    public int getTelphone() {
        return Telphone;
    }

    public void setTelphone(int Telphone) {
        this.Telphone = Telphone;
    }
    
    
    @Override
    public String toString(){
        return "  _city : "+ this.City +"  _country : "+ this.Country + "  _Email : "+this.Email + "  _postlCode : "+this.Postlcode ;
    }

    
    
}
