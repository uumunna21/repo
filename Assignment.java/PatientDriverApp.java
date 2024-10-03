//package package1;
//
//import java.util.Scanner;
//
//public class PatientDriverApp {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Gather patient information from the user
//        System.out.print("Enter First Name: ");
//        String firstName = input.nextLine();
//
//        System.out.print("Enter Middle Name: ");
//        String middleName = input.nextLine();
//
//        System.out.print("Enter Last Name: ");
//        String lastName = input.nextLine();
//
//        System.out.print("Enter Street Address: ");
//        String streetAddress = input.nextLine();
//
//        System.out.print("Enter City: ");
//        String city = input.nextLine();
//
//        System.out.print("Enter State: ");
//        String state = input.nextLine();
//
//        System.out.print("Enter Zip Code: ");
//        String zipCode = input.nextLine();
//
//        System.out.print("Enter Emergency Contact Name: ");
//        String emergencyContactName = input.nextLine();
//
//        System.out.print("Enter Emergency Contact Phone: ");
//        String emergencyContactPhone = input.nextLine();
//
//        // Create Patient object
//        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, emergencyContactName, emergencyContactPhone);
//
//        // Gather procedure information for three procedures
//        Procedure procedure1 = gatherProcedureData(input, 1);
//        Procedure procedure2 = gatherProcedureData(input, 2);
//        Procedure procedure3 = gatherProcedureData(input, 3);
//
//        // Display Patient Information
//        System.out.println("\nPatient info:");
//        System.out.println(patient.toString());
//
//        // Display Procedure Information
//        System.out.println();
//        System.out.println(procedure1.toString());
//        System.out.println();
//        System.out.println(procedure2.toString());
//        System.out.println();
//        System.out.println(procedure3.toString());
//
//        // Calculate total charges
//        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
//
//        // Display Total Charges
//        System.out.printf("\nTotal Charges: $%,.2f%n", totalCharges);
//
//        // Display Student Information
//        System.out.println("\nStudent Name: Ugonna Umunna");
//        System.out.println("МС#: M21189134");
//        System.out.println("Due Date: 10/04/2024");
//    }
//
//    // Helper method to gather procedure data from the user
//    private static Procedure gatherProcedureData(Scanner input, int procedureNumber) {
//        System.out.println("\nEnter details for Procedure " + procedureNumber + ":");
//
//        System.out.print("Enter Procedure Name: ");
//        String procedureName = input.nextLine();
//
//        System.out.print("Enter Procedure Date (MM/DD/YYYY): ");
//        String procedureDate = input.nextLine();
//
//        System.out.print("Enter Practitioner Name: ");
//        String practitionerName = input.nextLine();
//
//        System.out.print("Enter Procedure Charges: ");
//        double procedureCharges = input.nextDouble();
//        input.nextLine();  // Consume the leftover newline
//
//        // Create and return a Procedure object
//        return new Procedure(procedureName, procedureDate, practitionerName, procedureCharges);
//    }
//
//    // Method to calculate total charges
//    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
//        return procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
//    }
//}

package package1;

import java.util.Scanner;

public class PatientDriverApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Gather patient information from the user
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Street Address: ");
        String streetAddress = input.nextLine();

        System.out.print("Enter City: ");
        String city = input.nextLine();

        System.out.print("Enter State: ");
        String state = input.nextLine();

        System.out.print("Enter Zip Code: ");
        String zipCode = input.nextLine();

        System.out.print("Enter Emergency Contact Name: ");
        String emergencyContactName = input.nextLine();

        System.out.print("Enter Emergency Contact Phone: ");
        String emergencyContactPhone = input.nextLine();

        // Create Patient object with user-entered data
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, emergencyContactName, emergencyContactPhone);

        // Create three Procedure objects with user input
        Procedure procedure1 = gatherProcedureData(input, 1); // Using constructor that initializes all attributes
        Procedure procedure2 = gatherProcedureDataPartial(input, 2); // Using constructor that initializes procedure name and date only
        Procedure procedure3 = gatherProcedureDataNoArg(input, 3); // Using no-arg constructor and setting everything manually

        // Display the patient information
        displayPatient(patient);

        // Display the procedure information
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display the total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("\nTotal Charges: $%,.2f%n", totalCharges);

        // Display Student Information
        System.out.println("\nStudent Name: Ugonna Umunna");
        System.out.println("МС#: M21189134");
        System.out.println("Due Date: 10/04/2024");
    }

    // Method to display patient information
    public static void displayPatient(Patient patient) {
        System.out.println("\nPatient info:");
        System.out.println(patient.toString());
    }

    // Method to display procedure information
    public static void displayProcedure(Procedure procedure) {
        System.out.println("\n" + procedure.toString());
    }

    // Method to calculate total charges of three procedures
    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
    }

    // Helper method to gather full procedure data from user input (for the constructor that initializes all attributes)
    private static Procedure gatherProcedureData(Scanner input, int procedureNumber) {
        System.out.println("\nEnter details for Procedure " + procedureNumber + ":");

        System.out.print("Enter Procedure Name: ");
        String procedureName = input.nextLine();

        System.out.print("Enter Procedure Date (MM/DD/YYYY): ");
        String procedureDate = input.nextLine();

        System.out.print("Enter Practitioner Name: ");
        String practitionerName = input.nextLine();

        System.out.print("Enter Procedure Charges: ");
        double procedureCharges = input.nextDouble();
        input.nextLine();  // Consume the leftover newline

        // Create and return a Procedure object using the constructor that initializes all attributes
        return new Procedure(procedureName, procedureDate, practitionerName, procedureCharges);
    }

    // Helper method to gather partial procedure data from user input (for the constructor that initializes procedure name and date)
    private static Procedure gatherProcedureDataPartial(Scanner input, int procedureNumber) {
        System.out.println("\nEnter details for Procedure " + procedureNumber + ":");

        System.out.print("Enter Procedure Name: ");
        String procedureName = input.nextLine();

        System.out.print("Enter Procedure Date (MM/DD/YYYY): ");
        String procedureDate = input.nextLine();

        // Create Procedure object using constructor that initializes only the procedure name and date
        Procedure procedure = new Procedure(procedureName, procedureDate);

        // Set remaining attributes
        System.out.print("Enter Practitioner Name: ");
        String practitionerName = input.nextLine();
        procedure.setPractitionerName(practitionerName);

        System.out.print("Enter Procedure Charges: ");
        double procedureCharges = input.nextDouble();
        input.nextLine();  // Consume the leftover newline
        procedure.setProcedureCharges(procedureCharges);

        return procedure;
    }

    // Helper method to gather all procedure data using the no-arg constructor and manually setting attributes
    private static Procedure gatherProcedureDataNoArg(Scanner input, int procedureNumber) {
        System.out.println("\nEnter details for Procedure " + procedureNumber + ":");

        Procedure procedure = new Procedure(); // Use no-arg constructor

        // Set all attributes
        System.out.print("Enter Procedure Name: ");
        String procedureName = input.nextLine();
        procedure.setProcedureName(procedureName);

        System.out.print("Enter Procedure Date (MM/DD/YYYY): ");
        String procedureDate = input.nextLine();
        procedure.setProcedureDate(procedureDate);

        System.out.print("Enter Practitioner Name: ");
        String practitionerName = input.nextLine();
        procedure.setPractitionerName(practitionerName);

        System.out.print("Enter Procedure Charges: ");
        double procedureCharges = input.nextDouble();
        input.nextLine();  // Consume the leftover newline
        procedure.setProcedureCharges(procedureCharges);

        return procedure;
    }
}
