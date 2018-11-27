import java.util.HashMap;
import java.util.Map;

public class Engine {


    // https://www.imperiumromanum.edu.pl/kultura/cyfry-liczby-rzymskie/

    Map<String, Integer> dictionary = new HashMap<String, Integer>() {
        {
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("D", 500);
            put("M", 1000);
        }
    };


    String romanNumber;
    String arabicNumber;

//    char[] romanSigns ={'x','l','c','d'};
//    int[] romanSignsEquivalent={10,50,100,500};


    public boolean checkIfRomanNumber(String tempRomanNumber) {

        int currentMaximum = dictionary.get(String.valueOf(tempRomanNumber.charAt(0)));
        System.out.println(currentMaximum);
        int result = 0;

        for (int i = 0; i < tempRomanNumber.length(); i++) {

            String currentSign = String.valueOf(tempRomanNumber.charAt(i));
//            currentMaximum = tempMaximum;
            int tempMaximum = dictionary.get(currentSign);

            if (tempMaximum > currentMaximum) {
                currentMaximum = tempMaximum;
                System.out.println("this is not a proper roman number");
                return false;
            }

        }

        System.out.println("RESULT is" + result);
        return true;

    }

    public void converter(String tempRomanNumber) {
        if(checkIfRomanNumber(tempRomanNumber)){
            System.out.println("this is a roman number");
        }

    }


}
