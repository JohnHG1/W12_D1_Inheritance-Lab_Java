package Staff.management;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Staff.management.Manager manager;

    @Before
    public void setUp(){
        manager = new Staff.management.Manager("JHG","AB1234O", 20000, "DevOps");
    }

    @Test
    public void canGetName(){
        assertEquals("JHG", manager.getName());
    }

    @Test
    public void canGetNatNumber(){
        assertEquals("AB1234", manager.getNatInsurance());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20000, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("DevOps", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000.5);
        assertEquals(30000.5, manager.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        assertEquals(200, manager.payBonus(), 0.1);
    }

    @Test
    public void canChangeName(){
        manager.setName("Rick");
        assertEquals("Rick", manager.getName());
    }

}