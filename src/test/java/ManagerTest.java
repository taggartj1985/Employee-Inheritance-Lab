import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Linda", "JN01234NB", 300, "Bob's Burgers");
    }

    @Test
    public void canGetName(){
        assertEquals("Linda", manager.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("JN01234NB", manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(300, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetRaise(){
        manager.raiseSalary(50);
        assertEquals(350, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(3, manager.payBonus(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Bob's Burgers", manager.getDeptName());
    }

}
