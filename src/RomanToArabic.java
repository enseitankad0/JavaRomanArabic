import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {


    // https://www.imperiumromanum.edu.pl/kultura/cyfry-liczby-rzymskie/

    Map<String, Integer> dictionary = new HashMap<String, Integer>() {
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

// B A C K U P
//    public boolean checkIfRomanNumber(String tempRomanNumber) {
//
//        int currentMaximum =0;
//
//        for(int i = 0; i <=tempRomanNumber.length()-1; i++){
//
//            if (
//                    (dictionary.get(String.valueOf(tempRomanNumber.charAt(i)))) != null) {
//                currentMaximum = dictionary.get(String.valueOf(tempRomanNumber.charAt(0)));
//            } else {
//
//                return false;
//            }
//
//        }
//
//
//        for (int i = 0; i < tempRomanNumber.length(); i++) {
//
//            String currentSign = String.valueOf(tempRomanNumber.charAt(i));
//
//            int tempMaximum = dictionary.get(currentSign);
//
//            if (tempMaximum > currentMaximum) {
//                currentMaximum = tempMaximum;
//
//                System.out.println(tempRomanNumber + ": " + "This is not a correct roman Number. Greater values should not follow lower values.");
//
//                return false;
//            }
//
//        }
//
//
//        return true;
//
//    }

//    Roman number are based on seven symbols: I, V, X, L, C, D, M, and their decimal values are 1, 5, 10, 50, 100, 500, 1000
//    Generally, symbols are placed in order of value, starting with the largest values. When smaller values precede larger values, the smaller values are subtracted from the larger values, and the result is added to the total. For example MCMXLIV = 1000 + (1000 - 100) + (50 - 10) + (5 - 1) = 1944.
//    The symbols "I", "X", "C", and "M" can be repeated three times in succession, but no more. (They may appear four times if the third and fourth are separated by a smaller value, such as XXXIX.) "D", "L", and "V" can never be repeated.
//            "I" can be subtracted from "V" and "X" only. "X" can be subtracted from "L" and "C" only. "C" can be subtracted from "D" and "M" only. "V", "L", and "D" can never be subtracted.
//    Only one small-value symbol may be subtracted from any large-value symbol.

    public boolean checkIfRomanNumber(String tempRomanNumber) {

        for (int i = 0; i <= tempRomanNumber.length() - 1; i++) {


            // validation to check if String contains Roman letters e.x "X", "L", "M"
            if (
                    (dictionary.get(String.valueOf(tempRomanNumber.charAt(i)))) != null) {

            } else return false;

        }

        // validation to check if numbers are substracted from correct numbers e.x X can be before L and C NOT M or D


        for (int i = 0; i <= tempRomanNumber.length() - 1; i++) {
            tempRomanNumber = tempRomanNumber + " ";

            String currentSign = String.valueOf(tempRomanNumber.charAt(i));
            String nextSign = String.valueOf(tempRomanNumber.charAt(i + 1));

            if (currentSign == "I" && (nextSign == "L" || nextSign == "C" || nextSign == "D" || nextSign == "M")) {
                return false;
            }

            if (currentSign == "V" && (nextSign == "C" || nextSign == "D" || nextSign == "M")) {
                return false;
            }

            if (currentSign == "X" && (nextSign == "D" || nextSign == "M")) {
                return false;
            }

            if (currentSign == "L" && (nextSign == "M")) {
                return false;
            }




        }


        return false;
    }


    // changes on the begining
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

//    public boolean findMatchWitchKeySet(String romanNumber, Map<String, Integer> dictionary){
//
//        for(int i =0; i<romanNumber.length();i++){
//
//            for(int k = 0; k < dictionary.keySet())
//
//
//
//
//        }
//
//
//
//    }

}
