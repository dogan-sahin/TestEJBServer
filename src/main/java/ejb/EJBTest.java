package ejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote(EJBTestRemote.class)
@Stateless
public class EJBTest implements EJBTestRemote{

    @Override
    public String getName(String s) {
        return "name is: " + s;
    }
}
