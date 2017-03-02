
package comp1008assignment1;

import java.time.LocalDate;

/**
 *
 * @author BradT
 */
public class Instructor {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String province;
    private String postalCode;
    private LocalDate birthDay;
    private LocalDate hireDate;
    
    public Instructor (String firstName, String lastName, String streetAddress,
            String city, String province, String postalcode, LocalDate birthday,
            LocalDate hireDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.birthDay = birthDay;
        this.hireDate = hireDate;
    }   
    
    /**
     * Here, we write a program to get the year of when the Instructor for our class
     * was born.
     */
    
    public int getYearBorn()
    {
        return birthDay.getYear();
    }
    
    /**
     * This method will determine the date that the instructor was hired to work
     * here at Georgian. (setHireDate method, of class Instructor).
     */
    
    public void setHireDate()
    {
        return hireDate.getHireDate();
    }        
    
    /**
     * This method will help us to receive a course code in the form of a String
     * as an argument, converts it to all uppercase and stores it in the list of
     * teachable courses. (addTeachableCourse method, of class Instructor).
     * @return 
     */
    
    public String addTeachableCourse()
    {
        return .getTeachableCourse();
    }
    
    /**
     * This method will show how many years this instructor has been teaching
     * at Georgian College. (getYearsAtCollege method, of class Instructor).
     * @return 
     */
    
    public int getYearsAtCollege()
    {
        return .getYearsAtCollege();
    }
    
    /**
     * This method will determine whether or not our instructor can teach a
     * certain course at Georgian College. (Test of canTeach method, of class
     * Instructor).
     */
    
    public void canTeach()
    {
        return boolean result = Instructor.canTeach(courseCode);
    }
}
