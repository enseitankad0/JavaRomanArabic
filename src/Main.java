public class Main {

    public static void main(String[] args) {

        // ROMAN to ARAB

        RomanToArabic roman = new RomanToArabic();
        roman.converter("MCMLIV"); // 1954
        roman.converter("CXVI"); // 116
        roman.converter("MCXX"); // 1120
        roman.converter("MCMXIV"); // 1914
        roman.converter("MMMMC"); // 4100
        roman.converter("MMVIII"); // 900
        roman.converter("DCCXXXVII"); // 737

        // ARAB to ROMAN

        ArabicToRoman arab = new ArabicToRoman();
        System.out.println(arab.convertToRoman(1954));
        System.out.println(arab.convertToRoman(1914));

    }
}
