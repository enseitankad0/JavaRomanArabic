import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanToArabic {

    Map<String, Integer> dictionary = new HashMap<>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
            put(" ", 0);
        }
    };

    Set unwanted = Set.of("IL", "IC", "ID", "IM",
            "VV","VC","VX","VD","VM",
            "XD","XM",
            "LM","LL",
            "DD");


    public boolean checkIfRomanNumber(String tempRomanNumber) {

        for (int i = 0; i <= tempRomanNumber.length() - 1; i++) {
            // validation to check if String contains Roman letters e.x "X", "L", "M"
            if ((dictionary.get(String.valueOf(tempRomanNumber.charAt(i)))) != null) {
            } else return false;

        }

        // validation to check if numbers are substracted from correct numbers e.x X can be before L and C NOT M or D

        tempRomanNumber = tempRomanNumber + " ";

        for (int i = 0; i <= tempRomanNumber.length() - 2; i++) {

            if (unwanted.contains(tempRomanNumber.substring(i, i+2))) {
                return false;
            }
        }

        //    Only ONE small-value symbol may be subtracted from any large-value symbol.
        for (int i = 3; i <= tempRomanNumber.length() - 1; i++) {

            int first = dictionary.get(String.valueOf(tempRomanNumber.charAt(i)));
            int second = dictionary.get(String.valueOf(tempRomanNumber.charAt(i - 1)));
            int third = dictionary.get(String.valueOf(tempRomanNumber.charAt(i - 2)));
            int fourth = dictionary.get(String.valueOf(tempRomanNumber.charAt(i - 3)));

            if ((first > second && first > third) ||(second>third && second>fourth)) {
                return false;
            }
        //    The symbols "I", "X", "C" can be repeated three times in succession, but no more.
            if (first == 1 || first == 10 || first == 100) {
                if (first == second && first == third && first == fourth) {

                    return false;
                }

            }
        }
        return true;
    }


    public int converter(String tempRomanNumber) {
        if (checkIfRomanNumber(tempRomanNumber)) {

            tempRomanNumber = tempRomanNumber + " ";


            int result = 0;

            for (int i = 0; i < tempRomanNumber.length() - 1; i++) {

                String currentSign = String.valueOf(tempRomanNumber.charAt(i));
                String nextSign = String.valueOf(tempRomanNumber.charAt(i + 1));

                int valueOfSign = dictionary.get(currentSign);
                int valueOfNextSign = dictionary.get(nextSign);
                int tempvalue;

                if (valueOfNextSign > valueOfSign) {
                    tempvalue = valueOfNextSign - valueOfSign;
                    result = result + tempvalue;
                    i++;
                } else {
                    result = result + valueOfSign;

                }

            }

            System.out.println("VALUE OF " + tempRomanNumber + " IS: " + result);

            return result;

        } else {
            return -1;
        }


    }


}
