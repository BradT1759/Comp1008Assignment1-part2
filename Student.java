
package comp1008assignment1;

import java.time.LocalDate;

/**
 *
 * @author BradT
 */
public class Student {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String province;
    private String postalCode;
    private LocalDate birthDay;
    private int age;
    private LocalDate yearEnrolled;
    private int studentNumber;
    private String major;
    
    public Student (String firstName, String lastName, String streetAddress,
            String city, String Province, String postalCode, LocalDate birthDay,
            LocalDate yearEnrolled, int studentNumber, String Major)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.birthDay = birthDay;
        this.yearEnrolled = yearEnrolled;
        this.studentNumber = studentNumber;
        this.major = major;
    }
    
    /**
     * Here, we write a program to get the year of when the student for our class
     * was born.
     */
    
    public int getYearBorn()
    {
        return birthDay.getYear();
    }
    
    /**
     * This method will test the toString method involving our student's full
     * name, and his student number.
     * @return 
     */
    public String toString()
    {
        return firstName + " " + lastName + ", student number is" + studentNumber;
    }
    
    /**
     * This method will help us to test find out what year our student enrolled
     * in. (getYearEnrolled method, of class Student ).
     */
    
    public void getYearEnrolled()
    {
       return yearEnrolled.getYearEnrolled();
    }
    
    /**
     * This method will help us get our student's address.
     * @return 
     */
    public String getAddress()
    {
        return streetAddress + city + province + postalCode.getAddress();
    }
    
    /**
     * Test of changeAddress method, of class Student.
     * @return 
     */
    
    public String changeAddress()
    {
        return streetAddress.changeAddress();
    }
    
    
}
