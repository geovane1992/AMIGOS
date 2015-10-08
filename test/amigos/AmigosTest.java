package amigos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AmigosTest {
    
    
    @Test
    public void testAmigos() {
        System.out.println("amigos");
        double n = 1.0;
        double m = 1.0;
        boolean expResult = true;
        boolean result = Amigos.amigos(n, m);
        assertEquals(expResult, result);
        
    }
    
}
