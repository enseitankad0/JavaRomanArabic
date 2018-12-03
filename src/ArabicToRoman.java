import java.util.HashMap;
import java.util.Map;

public class ArabicToRoman {


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


        int thousands = arabNumber / 1000;
        int hundereds = (arabNumber - thousands * 1000) / 100;
        int tens = (arabNumber - (thousands * 1000 + hundereds * 100)) / 10;
        int units = arabNumber - thousands * 1000 - hundereds * 100 - tens * 10;


        int arr[] = {thousands, hundereds, tens, units};

        return arr;

    }


    public String convertToRoman(int tempArabicNumber) {

        int arabicNumber[] = countNumberComponents(tempArabicNumber);

        int thousands = arabicNumber[0];
        int hundereds = arabicNumber[1];
        int tens = arabicNumber[2];
        int units = arabicNumber[3];

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < thousands; i++) {
            sb.append(dictionary.get(1000));
        }


        sb.append(assignOrderOfMagnitude(100, 500, 1000, hundereds));
        sb.append(assignOrderOfMagnitude(10, 50, 100, tens));
        sb.append(assignOrderOfMagnitude(1, 5, 10, units));

        return sb.toString();

    }

    public String assignOrderOfMagnitude(
            int minNumber,
            int midNumber,
            int maxNumber,
            int numberToChange


    ) {

        StringBuilder sb = new StringBuilder();

        if (numberToChange <= 3) {
            for (int i = 0; i < numberToChange; i++) {
                sb.append(dictionary.get(minNumber));
            }
        } else if (numberToChange < 5) {

            sb.append(dictionary.get(minNumber));
            sb.append(dictionary.get(midNumber));

        } else if (numberToChange <= 8) {
            sb.append(dictionary.get(midNumber));
            for (int i = 0; i <= numberToChange - 6; i++) {
                sb.append(dictionary.get(minNumber));

            }

        } else if (numberToChange <= 9) {
            sb.append(dictionary.get(minNumber));
            sb.append(dictionary.get(maxNumber));
        }

        return sb.toString();
    }


}
