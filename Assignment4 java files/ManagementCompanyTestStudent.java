package package1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ManagementCompanyTestStudent {

    @Test
    void testConstructor() {
        ManagementCompany company = new ManagementCompany("ABC Management", "123456789", 10.0);
        assertEquals("ABC Management", company.getName());
        assertEquals("123456789", company.getTaxID());
        assertEquals(10.0, company.getMgmtFee(), 0.01);
    }

    @Test
    void testAddProperty() {
        ManagementCompany company = new ManagementCompany();
        Property property1 = new Property("House1", "City1", 1000, "Owner1", 1, 1, 2, 2);
        Property property2 = new Property("House2", "City2", 2000, "Owner2", 3, 3, 2, 2);
        Property property3 = new Property("House3", "City3", 3000, "Owner3", 0, 0, 12, 12);

        assertEquals(0, company.addProperty(property1));
        assertEquals(1, company.addProperty(property2));
        assertEquals(-3, company.addProperty(property3));
    }

    @Test
    void testGetTotalRent() {
        ManagementCompany company = new ManagementCompany();
        company.addProperty(new Property("House1", "City1", 1000, "Owner1"));
        company.addProperty(new Property("House2", "City2", 2000, "Owner2"));
        assertEquals(3000.0, company.getTotalRent(), 0.01);
    }

    @Test
    void testGetHighestRentProperty() {
        ManagementCompany company = new ManagementCompany();
        Property property1 = new Property("House1", "City1", 1000, "Owner1");
        Property property2 = new Property("House2", "City2", 3000, "Owner2");
        company.addProperty(property1);
        company.addProperty(property2);
        assertEquals(property2, company.getHighestRentProperty());
    }

    @Test
    void testIsPropertiesFull() {
        ManagementCompany company = new ManagementCompany();
        for (int i = 0; i < 5; i++) {
            company.addProperty(new Property("House" + i, "City" + i, 1000, "Owner" + i));
        }
        assertTrue(company.isPropertiesFull());
    }

    @Test
    void testRemoveLastProperty() {
        ManagementCompany company = new ManagementCompany();
        company.addProperty(new Property("House1", "City1", 1000, "Owner1"));
        company.addProperty(new Property("House2", "City2", 2000, "Owner2"));
        company.removeLastProperty();
        assertEquals(1, company.getPropertiesCount());
    }

    @Test
    void testIsManagementFeeValid() {
        ManagementCompany company = new ManagementCompany("Test Company", "123456", 15.0);
        assertTrue(company.isManagementFeeValid());
        
        ManagementCompany companyInvalid = new ManagementCompany("Test Company", "123456", 150.0);
        assertFalse(companyInvalid.isManagementFeeValid());
    }

    @Test
    void testToString() {
        ManagementCompany company = new ManagementCompany("ABC Management", "123456789", 10.0);
        company.addProperty(new Property("House1", "City1", 1000, "Owner1"));
        company.addProperty(new Property("House2", "City2", 2000, "Owner2"));
        
        String expected = """
                List of the properties for ABC Management, taxID: 123456789
                ______________________________________________________
                House1,City1,Owner1,1000.0
                House2,City2,Owner2,2000.0
                ______________________________________________________
                Total management Fee: 300.0
                """;
        assertEquals(expected.trim(), company.toString().trim());
    }
}

