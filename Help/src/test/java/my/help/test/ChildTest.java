package my.help.test;

//import my.help.Child;
import my.help.Inh1;
//import my.help.Super;
import my.help.Super;
import org.junit.Test;
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;

/**
 * Simple test.
 *
 * @author Vihovsky Roman
 * @since 25.04.2017
 */
public class ChildTest {
    /**
     * Test method.
     */
    @Test
    public void testMethod() {
       //Child child = new Child();
        Inh1 inh = new Inh1("Test", 1);
        System.out.println(inh.getName());
        System.out.println(inh.getId());
        //((Child) child).childPublic();
        //System.out.println(inh.getName());
        Super<Inh1> sup = new Inh1("Sup", 2);

    }
}