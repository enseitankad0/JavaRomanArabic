import java.util.HashMap;
import java.util.Map;

public class Engine {


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


    public boolean checkIfRomanNumber(String tempRomanNumber) {

        int currentMaximum =0;

        for(int i = 0; i <=tempRomanNumber.length()-1; i++){

            if (
                    (dictionary.get(String.valueOf(tempRomanNumber.charAt(i)))) != null) {
                currentMaximum = dictionary.get(String.valueOf(tempRomanNumber.charAt(0)));
            } else {

                return false;
            }

        }


        for (int i = 0; i < tempRomanNumber.length(); i++) {

            String currentSign = String.valueOf(tempRomanNumber.charAt(i));

            int tempMaximum = dictionary.get(currentSign);

            if (tempMaximum > currentMaximum) {
                currentMaximum = tempMaximum;

                System.out.println(tempRomanNumber + ": " + "This is not a correct roman Number. Greater values should not follow lower values.");

                return false;
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
