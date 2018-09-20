
package project;

public class Person {
    private String Name,Address,Phone,Email,DateofBirth,Sex,ID;
    
    public Person(){
        
    }
    
    public Person(String Name,String Address,String Phone,String Email,String DateofBirth,String Sex,String ID){
        this.Address=Address;
        this.DateofBirth=DateofBirth;
        this.Email=Email;
        this.ID=ID;
        this.Name=Name;
        this.Phone=Phone;
        this.Sex=Sex;
    }
    
    public String getName(){
        return this.Name;
    }
    
    public String getPhone(){
        return this.Phone;
    }
    
    public String getAddress(){
        return this.Address;
    }
    
    public String getEmail(){
        return this.Email;
    }
    
    public String getDateofBirth(){
        return this.DateofBirth;
    }
    
    public String getSex(){
        return this.Sex;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public void setName(String Name){
        this.Name=Name;
    }
    
    public void setAddress(String Address){
        this.Address=Address;
    }
    
    public void setPhone(String Phone){
        this.Phone=Phone;
    }
    
    public void setEmail(String Email){
        this.Email=Email;
    }
    
    public void setDateofBirth(String DateofBirth){
        this.DateofBirth=DateofBirth;
    }
    
    public void setSex(String Sex){
        this.Sex=Sex;
    }
    
    public void setID(String ID){
        this.ID=ID;
    }
    
}
