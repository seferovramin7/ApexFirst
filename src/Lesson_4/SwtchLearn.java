package Lesson_4;

public class SwtchLearn {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int hefteninReqemi = scanner.nextInt();
//
//        String gununAdi = "";
//
//        switch (hefteninReqemi) {
//            case 1:
//                gununAdi = "Bazar ertesi";
//                break;
//            case 2:
//                gununAdi = "Chershenbe axshami";
//                break;
//            case 3:
//                gununAdi = "Chershenbe";
//                break;
//            case 4:
//                gununAdi = "Cume axshami";
//                break;
//            case 5:
//                gununAdi = "Cume";
//                break;
//            case 6:
//                gununAdi = "Shenbe";
//                break;
//            case 7:
//                gununAdi = "Bazar";
//                break;
//            default:
//                gununAdi = "Bele bir gun yoxdur ";
//        }
//
//        System.out.println(gununAdi);


        int yetkinlikYashi = 18;
        int yash = 18;

        boolean yetkindirMi = yash >= yetkinlikYashi;

        String veziyyet = yetkindirMi ? "Yaxshi" : "PIS";

        System.out.println(veziyyet);
    }
}
