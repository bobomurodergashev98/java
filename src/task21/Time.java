package task21;

public class Time {

    /*
    Quyidagi 3ta attribute bor bo’lgan Time klassini encapsulation prinsipi asosida yarating:
    soat, minut, va sekund. “soat:minut:sekund” (Masalan: 01:25:08) formatdagi vaqtni qaytaruvchi mehod yarating.
     */
    private int soat;
    private int minut;
    private int sekund;
    boolean click=true;

    public int getSoat() {
        return soat;
    }

    public void setSoat(int soat) {
        if (soat > 0) {
            this.soat = soat;
        }
        else click=false;
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int minut) {
        if (minut > 0) {
            this.minut = minut;
        }
        else click=false;

    }

    public int getSekund() {
        return sekund;
    }

    public void setSekund(int sekund) {
        if (sekund > 0) {
            this.sekund = sekund;
        }
        else click=false;

    }
    public void vaqt(int soat,int minut ,int sekund){
        System.out.println(soat + ":" + minut + ":" + sekund);
    }
//    public void onoff(){
//        if (click==false){
//            System.out.println("Qaytadan kirit : ");
//        }
//    }



    public static void main(String[] args) {
        Time time = new Time();
        time.setSoat(11);
        time.setMinut(25);
        time.setSekund(56);
//        time.onoff();
        if (time.click == false) {
            System.out.println("Qaytadan kirit: ");
        } else {
            time.vaqt(time.getSoat(), time.getMinut(), time.getSekund());
        }
    }

}
