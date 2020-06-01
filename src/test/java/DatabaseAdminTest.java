import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Bob", "JN201232B", 150);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("JN201232B", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(150, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetRaise(){
        databaseAdmin.raiseSalary(50);
        assertEquals(200, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1.5, databaseAdmin.payBonus(), 0.01);
    }
}
