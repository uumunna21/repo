package package1;

public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;
    
    public Procedure() {}
    
 // Parametrized constructor for procedureName and procedureDate
    public Procedure(String procName, String procDate) {
        procedureName = procName;
        procedureDate = procDate;
    }

    // Constructor for all attributes
    public Procedure(String procName, String procDate, String practitioner, double charges) {
        procedureName = procName;
        procedureDate = procDate;
        practitionerName = practitioner;
        procedureCharges = charges;
    }

 // Accessors (Getters)
    public String getProcedureName() { return procedureName; }
    public String getProcedureDate() { return procedureDate; }
    public String getPractitionerName() { return practitionerName; }
    // Accessor for charges
    public double getProcedureCharges() {
        return procedureCharges;
    }
 // Mutators (Setters)
    public void setProcedureName(String procName) { procedureName = procName; }
    public void setProcedureDate(String procDate) { procedureDate = procDate; }
    public void setPractitionerName(String practitioner) { practitionerName = practitioner; }
    public void setProcedureCharges(double charges) { procedureCharges = charges; }

    
    // toString method to display procedure info
    @Override
    public String toString() {
        return "Procedure: " + procedureName + "\n" +
               "ProcedureDate=" + procedureDate + "\n" +
               "Practitioner=" + practitionerName + "\n" +
               "Charge=" + String.format("%.2f", procedureCharges);
    }
}
