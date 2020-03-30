package Staff.techStaff;
import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Mike", "CD6789", 15000);
    }
    @Test
    public void canGetSalary(){
        assertEquals(15000, databaseAdmin.getSalary(), 0.1);
    }

}