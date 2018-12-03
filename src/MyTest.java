import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class MyTest {




    @Test
    public void convertRomanToArabicShouldReturnNumber(){
        RomanToArabic tester = new RomanToArabic();

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

    @Test
    public void convertArabicToRomanShouldReturnString(){

        ArabicToRoman tester2 = new ArabicToRoman();

        assertEquals("LXX",tester2.convertToRoman(70));
        assertEquals("MCMXIV",tester2.convertToRoman(1914));
        assertEquals("DCCXXXVII",tester2.convertToRoman(737));
        assertEquals("MCMXX",tester2.convertToRoman(1920));
        assertEquals("MCXX",tester2.convertToRoman(1120));
        assertEquals("LXXV",tester2.convertToRoman(75));
        assertEquals("MMXXIX",tester2.convertToRoman(2029));


    }

    @Test
    public void selfTesting(){

        ArabicToRoman arabicToRoman = new ArabicToRoman();
        RomanToArabic romanToArabic = new RomanToArabic();

        int[]  randomIntsArray = IntStream.generate(() -> new Random().nextInt(5000)).limit(1000).toArray();
        for(int i  : randomIntsArray){
            assertEquals(i,romanToArabic.converter(arabicToRoman.convertToRoman(i)));
            System.out.println(i);
        }



    }








}
