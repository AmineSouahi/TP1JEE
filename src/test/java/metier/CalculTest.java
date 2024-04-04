package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void testSomme(){
        calcul=new Calcul();
        double a=50; double b=60;
        double expected=30;
        double res= calcul.somme(a,b);
        Assert.assertTrue(res==expected);

    }
}
