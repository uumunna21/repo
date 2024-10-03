package package1;

public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String emergencyContactName;
    private String emergencyContactPhone;
	private String phoneNumber;
    
    public Patient() {}
    
    public Patient(String fName, String mName, String lName) {
        firstName = fName;
        middleName = mName;
        lastName = lName;
    }
    
    // Constructor for all attributes
    public Patient(String fName, String mName, String lName, String address, String cityName, String stateName, String zip, String emergencyName, String emergencyPhone) {
        firstName = fName;
        middleName = mName;
        lastName = lName;
        streetAddress = address;
        city = cityName;
        state = stateName;
        zipCode = zip;
        emergencyContactName = emergencyName;
        emergencyContactPhone = emergencyPhone;
    }
    
 // Accessors (Getters)
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getStreetAddress() { return streetAddress; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZipCode() { return zipCode; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmergencyContactName() { return emergencyContactName; }
    public String getEmergencyContactPhone() { return emergencyContactPhone; }

    // Mutators (Setters)
    public void setFirstName(String fName) { firstName = fName; }
    public void setMiddleName(String mName) { middleName = mName; }
    public void setLastName(String lName) { lastName = lName; }
    public void setStreetAddress(String address) { streetAddress = address; }
    public void setCity(String cityName) { city = cityName; }
    public void setState(String stateName) { state = stateName; }
    public void setZipCode(String zip) { zipCode = zip; }
    public void setPhoneNumber(String phone) { phoneNumber = phone; }
    public void setEmergencyContactName(String emergencyName) { emergencyContactName = emergencyName; }
    public void setEmergencyContactPhone(String emergencyPhone) { emergencyContactPhone = emergencyPhone; }
    // Method to build full name
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to build full address
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    // Method to build emergency contact
    public String buildEmergencyContact() {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    // toString method to display patient info
    @Override
    public String toString() {
        return "Name: " + buildFullName() + "\n" +
               "Address: " + buildAddress() + "\n" +
               "EmergencyContact: " + buildEmergencyContact();
    }
}
