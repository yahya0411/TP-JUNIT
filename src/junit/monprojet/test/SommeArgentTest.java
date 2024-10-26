package junit.monprojet.test;

import org.junit.monprojet.SommeArgent;

import junit.framework.*;


public class SommeArgentTest extends TestCase {

	@SuppressWarnings("deprecation")
	public void test()
    {
      /*  SommeArgent m1 = new SommeArgent(12, "DINARS");
        
        SommeArgent m2= new SommeArgent(14, "DINARS");
        SommeArgent expected = new SommeArgent(26, "DINARS");
        SommeArgent result = m1.add(m2); // (2)
        Assert.assertTrue(expected.equals(result));*/
        
        
SommeArgent m1 = new SommeArgent(12, "DINARS");
        
        SommeArgent m2= new SommeArgent(14, "DINARS");
        SommeArgent m3= new SommeArgent(14, "EURO");

        Assert.assertTrue(!m1.equals(null));
      //  Assert.assertEquals(m1, m2);

    }


}
