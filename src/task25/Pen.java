package task25;

import uz.pdp.online.model.User;

import java.util.Scanner;

public class Pen {
    private boolean knopkasi=false;
    private double siyohmiqdori=0; // ruchkadagi bor bo'lgan siyoh miqdori
    private String inqColor;
    private double kattaharfuchun=2; // katta harf uchun sarflanadigan siyoh miqdori
    private double kichikharfuchun=1;
    private String word;

    public Pen(String word) {
        this.word = word;
    }
    public Pen(){

    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void siyohquyish(int qancha){
        System.out.println("Qancha siyoh quyay: ");
        siyohmiqdori+=qancha;
    }
    public void siyohmiqdorinitekshirish(){
        System.out.println(siyohmiqdori);
    }// siyohmiqdori=10;knopka=bosilgan;
    public void yozish(String word){
        String res=" ";

        if (siyohmiqdori>word.length()){
            for (int i = 0; i < word.length(); i++) {
               if (siyohmiqdori>kichikharfuchun){
                   if (Character.isLowerCase(Integer.parseInt(word.substring(i,i+1)))){
                       siyohmiqdori-=1;

                       res +=word.substring(i,i+1);
                   }
                   if (Character.isUpperCase(Integer.parseInt(word.substring(i,i+1)))){
                       siyohmiqdori-=2;
                       res +=word.substring(i,i+1);
                   }
               } else {
                   System.out.println("siyoh qolmadi: ");
               }
            }
        }

        else {
            System.out.println("Yetarli siyoh yuq iltimos siyoh quying: ");
        }
        System.out.println(res);
    }

    public void bosilganmi(boolean bos){
        if (bos){
            System.out.println("nima qilay davom etasizmi: ");
        }
        else {
            bos=false;
        }
    }

//
//    public void yozish(String word) {
//        if (button) {
//            if (inq > 0) {
//                System.out.println(word);
//                inq -= word.length() * inqConsumption; // yozilgan harflar uchun siyohni sarflanishi
//            } else {
//                System.out.println("Ruchkada siyoh qolmagan, sterjenni almashtiring.");
//            }
//        } else {
//            System.out.println("Yozishdan oldin tugmani bosing.");
//        }
//    }
//


//
//    //    Alt+(Fn)Insert =>Constructor yaratish uchun
//    public Pen() {
//    }
//
//    public Pen(double inq, String inqColor, double inqConsumption) {
//        this.inq = inq;
//        this.inqColor = inqColor;
//        this.inqConsumption = inqConsumption;
//    }
//
//    public Pen(boolean button, double inq, String inqColor, double inqConsumption) {
//        this.button = button;
//        this.inq = inq;
//        this.inqColor = inqColor;
//        this.inqConsumption = inqConsumption;
//    }
//
//    public void clickButton() {
//        button = !button;
//
//        if (button){
//            button=false;
//        }else {
//            button=true;
//        }
//    }

//    public void changeSterjen(double inq) {
//        this.inq = inq;
//    }
//
//    public boolean isButton() {
//        return button;
//    }
//
//    public void setButton(boolean button) {
//        this.button = button;
//    }
//
//    public double getInq() {
//        return inq;
//    }
//
//    public void setInq(double inq) {
//        if (inq > 0) {
//            this.inq = inq;
//        }
//
//    }
//
//    public String getInqColor() {
//        return inqColor;
//    }
//
//    public void setInqColor(String inqColor) {
//        this.inqColor = inqColor;
//    }
//
//    public double getInqConsumption() {
//        return inqConsumption;
//    }
//
//    public void setInqConsumption(double inqConsumption) {
//        if (inqConsumption>0) {
//            this.inqConsumption = inqConsumption;
//        }
//    }

    public class Main {
        public static void main(String[] args) {
//        Pen ruchka = new Pen(100,"Ko'k",10);
//        ruchka.clickButton();
//        System.out.println(ruchka.getInq());
//        ruchka.write("Hello OOP!");
//        System.out.println(ruchka.getInq());
//        ruchka.write("Hi");

//        System.out.println("======= pen objecti=========");
//        Pen pen=new Pen();
//        pen.setInq(-100);//pen.inq=-100;
//        pen.setInqColor("Qora");
//        pen.setInqConsumption(10); //pen.inqConsumption=-10
//
//        System.out.println(pen.getInq());
//        pen.clickButton();
//        pen.write("Hi");
//        System.out.println(pen.getInq());
//        Encopsulation 2: 1) private, 2) getter va setter
            Pen pen=new Pen();
            Scanner scanner=new Scanner(System.in);
            boolean onff=true;
            while (onff){
                System.out.println("Amalni tanlang: " + "0-bosilganini tekshirish: " + "1-siyoh miqdorini ko'rish" + "2-siyoh quyish" + "3-yozish" + "4-chiqish");
                int amal= scanner.nextInt();
                switch (amal){
                    case 0:
                        pen.bosilganmi(true);
                        break;
                    case 1:
                        pen.siyohmiqdorinitekshirish();
                        break;
                    case 2:
                        pen.siyohquyish(10);

                        break;
                    case 3:
                        pen.setWord("eferfP");
                        pen.yozish(pen.getWord());
                        break;
                    case 4:
                        onff=false;
                        break;
                    default:
                        System.out.println("Qaytadan kiriting notog'ri amal kiritdingiz: ");

                }







            }




        }
    }

}
