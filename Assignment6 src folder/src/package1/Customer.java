/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description:  Implement a software for a beverage shop that automates the order transactions and reports 
 * Due:  12/15/2024 
 * Platform/compiler: eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ugonna Umunna
*/

package package1;

public class Customer {
    private String name;
    private int age;

    // Constructor
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Customer(Customer customer) {
        this.name = customer.name;
        this.age = customer.age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Override equals method to compare name and age
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same object, return true
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different classes or null object, return false
        }
        Customer other = (Customer) obj;
        return this.name.equals(other.name) && this.age == other.age; // Compare name and age
    }

    // Override hashCode for consistency with equals
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    // Override toString to provide string representation of customer
    @Override
    public String toString() {
        return "Customer: " + name + ", Age: " + age;
    }
}
