/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digital.address.book;


/**
 *
 * @author Microsoft
 */
public class Businesses extends CommnInfo implements Comparsion{
    private String Title;
    private String Genre ;
    private Person ContactPerson ;
    private String Website ;

    public Businesses(String Title, String Genre, Person ContactPerson, String Website, String City, String Country, String Email,String Postlcode, int Telphone) {
        super(City, Country, Email, Postlcode, Telphone);
        this.Title = Title;
        this.Genre = Genre;
        this.ContactPerson = ContactPerson;
        this.Website=Website;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public Person getContactPerson() {
        return ContactPerson;
    }

    public void setContactPerson(Person ContactPerson) {
        this.ContactPerson = ContactPerson;
    }
   
                               
       
    @Override
    public String toString (){
        return "title : " + this.Title +"  // genre : "+this.Genre +
                " // contact person " + this.ContactPerson +
               "  // Website : "+ this.Website +super.toString();
    }

    @Override
    public String compareBy(String str) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
 