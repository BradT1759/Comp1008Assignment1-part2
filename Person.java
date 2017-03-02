
package comp1008assignment1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author BradT
 */
public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String province;
    private String postalCode;
    private LocalDate birthDay;
    private int age;
    
    public Person (String firstName, String lastName, String streetAddress, String city, String province, String postalCode, LocalDate birthDay)
    {
       this.firstName = firstName;
       this.lastName = lastName;
       this.streetAddress = streetAddress;
       this.city = city;
       this.province = province;
       this.postalCode = postalCode;
       this.birthDay = birthDay;
    }
    
    /**
     * Here, we write a program to get the year of when the person for our class
     * was born.
     */
    
    public int getYearBorn()
    {
        return birthDay.getYear();
    }
    
    /**
     * This method will validate that the person is 16-90 years old and
     * set the birthDay instance variables
     * @param birthDay
     */
    public void getBirthDay(LocalDate birthDay)
    {
        LocalDate today = LocalDate.now();
        
        int age = Period.between(birthDay, today).getYears();
        
        if(age >= 16 && age <= 90) //valid Employee birthDate
            this.birthDay = birthDay;
        else
            throw new IllegalArgumentException("This person must be 16-90 years old");
    }
    
    /**
     * Here, this will get the age of the person for our class
     * @return 
     */
    
    public int getAge()
    {
        return age.getAge();
    }
    
    /**
     * This method will get the postal code for the class person
     * @return 
     */
    public String getPostalCode()
    {
        return postalCode.getPostalCode();
    }
    
    /**
     * This method will get the name of the province for the class person
     * @return 
     */
    public String getProvince()
    {
        return province.getProvince();
    }
    
    /**
     * This method will get the name of the city for the class person
     * @return 
     */
    public String getCity()
    {
        return city.getCity();
    }
    
    /**
     * This method will get the first name for the class person
     * @return 
     */
    public String firstName()
    {
        return firstName.getFirstName();
    }
    
    /**
     * This method will get the last name for the class person
     * @return 
     */
    public String lastName()
    {
        return lastName.getLastName();
    }
    
    /**
     * This method will get the street address for the class person
     * @return
     */
    public String streetAddress()
    {
        return streetAddress.getStreetAddress();
    }
    
    /**
     * This method will return the address in the form of: street address, city,
     * province, postal code.
     * @return
     */
    public String getFullAddress()
    {
       getStreetAddress();
       getProvince();
       getCity();
       getPostalCode();
       
    }
}
