package Staff.management;

import Staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void setUp(){
        director = new Director("Sky", "CA1234", 100000, "CEO", 10000);
    }
    @Test
    public void canGetBudget(){
        assertEquals(10000, director.getBudget(), 0.1);
    }
    @Test
    public void canGetUpdatedDirectorPayBonus(){
        assertEquals(20000, director.payBonus(), 0.1);
    }
}