
import edu.upc.eetac.dsa.User;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefectionTest {




    @Test
    public void basic() throws Exception {

        User u1 = new User ("1", "Juan");
        Assert.assertEquals("Juan", u1.getName());


        Class c = Class.forName("edu.upc.eetac.dsa.User");
        User u2 = (User) c.newInstance();
        u2.setName("Pere");
        Assert.assertEquals("Pere", u2.getName());

        Class c2 = u1.getClass();

        for (Constructor constr: c2.getConstructors()) {
            System.out.println(constr.toGenericString());
        }

        for (Field f: c2.getDeclaredFields()) {
            System.out.println(f.getName());

        }

        for (Method m: c2.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        System.out.println("====================");

        for (Method m: c2.getMethods()) {
            System.out.println(m.getName());
        }

    }
}
