import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Louise", "JN201232B", 500, "Bob's Burgers", 2000);
    }

    @Test
    public void canGetName(){
        assertEquals("Louise", director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("JN201232B", director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(500, director.getSalary(), 0.01);
    }

    @Test
    public void canGetRaise(){
        director.raiseSalary(50);
        assertEquals(550, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(5.0, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(2000, director.getBudget(), 0.01);
    }
}
