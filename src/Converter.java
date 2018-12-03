import java.util.HashMap;
import java.util.Map;

public class Converter {


    Map<Integer, String> dictionary = new HashMap<Integer, String>() {
        {
            put(1, "I");
            put(5, "V");
            put(10, "X");
            put(50, "L");
            put(100, "C");
            put(500, "D");
            put(1000, "M");
            put(0, " ");
        }
    };


    public int[] countNumberComponents(int arabNumber) {

        int thousands;
        int hundereds;
        int tens;
        int units;

        thousands = arabNumber / 1000;
        hundereds = (arabNumber - thousands * 1000) / 100;
        tens = (arabNumber - (thousands * 1000 + hundereds * 100)) / 10;
        units = arabNumber - thousands * 1000 - hundereds * 100 - tens * 10;

//        System.out.println(thousands + ":" + hundereds + ":" + tens + ":" + units);

        int arr[] = {thousands, hundereds, tens, units};

        return arr;

    }


    public boolean convertToRoman(int tempArabicNumber) {

        int arabicNumber[] = countNumberComponents(tempArabicNumber);

        int thousands = arabicNumber[0];
        int hundereds = arabicNumber[1];
        int tens = arabicNumber[2];
        int units = arabicNumber[3];

        String thousandsRoman;
        String hunderedsRoman;
        String tensRoman;
        String unitsRoman;


        StringBuilder sb = new StringBuilder();


        // logic for thousands
        for (int i = 0; i < thousands; i++) {
            sb.append(dictionary.get(1000));
        }

        
        
        // logic for hundereds
        if (hundereds <= 3) {
            for (int i = 0; i < hundereds; i++) {
                sb.append(dictionary.get(100));
            }
        } else if (hundereds < 5) {

            sb.append(dictionary.get(100));
            sb.append(dictionary.get(500));

        } else if (hundereds <= 8) {
            sb.append(dictionary.get(500));
            for (int i = 0; i <= hundereds - 6; i++) {
                sb.append(dictionary.get(100));

            }

        } else if (hundereds <= 9) {
            sb.append(dictionary.get(100));
            sb.append(dictionary.get(1000));
        }

        
        
        // logic for tens
        if (tens <= 3) {
            for (int i = 0; i < tens; i++) {
                sb.append(dictionary.get(10));
            }
        } else if (tens < 5) {

            sb.append(dictionary.get(10));
            sb.append(dictionary.get(50));

        } else if (tens <= 8) {
            sb.append(dictionary.get(50));
            for (int i = 0; i <= tens - 6; i++) {
                sb.append(dictionary.get(10));

            }

        } else if (tens <= 9) {
            sb.append(dictionary.get(10));
            sb.append(dictionary.get(100));
        }

        System.out.println(tempArabicNumber + ": " + sb.toString());



        System.out.println(sb);
        return true;

    }



}
