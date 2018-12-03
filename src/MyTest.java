import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyTest {

    @Test
    public void convertRomanToArabicShouldReturnNumber(){
        Engine tester = new Engine();

        assertEquals(70,tester.converter("LXX"));
        assertEquals(-1,tester.converter("XLLX"));
        assertEquals(2500,tester.converter("MMD"));
        assertEquals(710,tester.converter("DCCX"));
        assertEquals(1954,tester.converter("MCMLIV"));
        assertEquals(116,tester.converter("CXVI"));
        assertEquals(1120,tester.converter("MCXX"));
        assertEquals(1914,tester.converter("MCMXIV"));
        assertEquals(4100,tester.converter("MMMMC"));
        assertEquals(2008,tester.converter("MMVIII"));
        assertEquals(737,tester.converter("DCCXXXVII"));
        assertEquals(-1,tester.converter("VXI"));
        assertEquals(1100,tester.converter("MC"));
        assertEquals(1920,tester.converter("MCMXX"));
        assertEquals(-1,tester.converter("asdfg"));
        assertEquals(-1,tester.converter("VIX"));
        assertEquals(-1,tester.converter("XLLX"));





    }








}
