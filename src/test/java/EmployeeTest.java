import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Bob", "JN201232B", 150);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("JN201232B", employee.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(150, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetRaise(){
        employee.raiseSalary(50);
        assertEquals(200, employee.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1.5, employee.payBonus(), 0.01);
    }

    @Test
    public void canSetName(){
        employee.setName("Gene");
        assertEquals("Gene", employee.getName());
    }

    @Test
    public void cantEnterNullValue(){
        employee.setName(null);
        assertEquals("Bob", employee.getName());
    }

    @Test
    public void cantHaveNegativeSalary(){
        employee.raiseSalary(-5000);
        assertEquals(150, employee.getSalary(), 0.01);
    }

}
