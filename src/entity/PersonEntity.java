

package entity;



public class PersonEntity {
    
    private String name;
    private String email;
    private String city;
    private Integer amount;

    public PersonEntity(String name, String email, String city, Integer amount) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.amount = amount;
    }

    public PersonEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PersonEntity{" + "name=" + name + ", email=" + email + ", city=" + city + ", amount=" + amount + '}';
    }
    
    

}
