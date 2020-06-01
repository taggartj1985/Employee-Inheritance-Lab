import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", "JN201232B", 150);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("JN201232B", developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(150, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetRaise(){
        developer.raiseSalary(50);
        assertEquals(200, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1.5, developer.payBonus(), 0.01);
    }


}
