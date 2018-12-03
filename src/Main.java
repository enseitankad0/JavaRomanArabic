public class Main {

    public static void main(String[] args) {

        // ROMAN to ARAB

        RomanToArabic engine = new RomanToArabic();
//        engine.converter("LXX"); //70
//        engine.converter("XLLX"); //70
//        engine.converter("MMD"); //2500
//        engine.converter("DCCX"); //710
//        engine.converter("MCMLIV"); // 1954
//        engine.converter("CXVI"); // 116
//        engine.converter("MCXX"); // 1120
//        engine.converter("MCMXIV"); // 1914
//        engine.converter("MMMMC"); // 4100
//        engine.converter("MMVIII"); // 900
//        engine.converter("X"); // 10
//        engine.converter("DCCXXXVII"); // 737

        // ARAB to ROMAN
//
        ArabicToRoman conv = new ArabicToRoman();
        System.out.println(conv.convertToRoman(442));
        System.out.println(engine.converter("VXI"));



//
//conv.assignOrderOfMagnitude(100,500,1000,900);

}
}
