public class Main {

    public static void main(String[] args) {

        // ROMAN to ARAB

//        Engine engine = new Engine();
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
        Converter conv = new Converter();
//        conv.countNumberComponents(4005);
//        conv.countNumberComponents(12);
//
//        conv.countNumberComponents(9_995);
//        conv.countNumberComponents(100_000);
//
        conv.convertToRoman(70);
        conv.convertToRoman(2500);
        conv.convertToRoman(1914);
        conv.convertToRoman(900);


}
}
