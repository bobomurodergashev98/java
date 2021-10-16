package task22;
import java.util.Scanner;
public class Account {
    /*
    Quyidagi attributelardan iborat Account klassini encapsulation prinsipi asosida yarating:
     hisob raqami, ism familiyasi va balans.
   */

    private int raqam;
    private String surname;
    private String name;
    private long balans;


    public void schoti(){
        System.out.println(balans);
    }
    public void pulotkazish(int summa){
        balans+=summa;
        System.out.println( balans);
    }
    public void pulyechish(int summa){

            balans=balans-summa;
            System.out.println(balans);

    }
    public void hisobnitoldirish(int qanchaga){
        balans+=qanchaga;
        System.out.println("Hisobingizda : " + balans + "pul boldi " + " yana yechmqochimisz: ");
    }

    public int getRaqam() {
        return raqam;
    }

    public void setRaqam(int raqam) {
        this.raqam = raqam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalans() {
        return balans;
    }

    public void setBalans(long balans) {
        this.balans = balans;
    }







    public static void main(String[] args) {
        boolean onoff=true;

        Account account=new Account();

        while (onoff) {
            System.out.println("Menyuni tanlang: " + "1-balans" + "2-pul yechish" + "3-pul o'tkazish" + "4-Yakunlash");
            Scanner scanner=new Scanner(System.in);
            int menyu=scanner.nextInt();
            switch (menyu){
                case 1:
                    account.setBalans(1000);
                    account.schoti();
                    break;
                case 2:
                    System.out.println("qancha yechay: ");


                    int summa=scanner.nextInt();
                    if (summa<= account.getBalans()){
                        account.pulyechish(summa);}
                    else {
                        System.out.println("Hisobingizda yetarli miqdorda pul yoq iltimos avval hisobingizni to'ldiring: ");
                        int qanchaga=scanner.nextInt();
                        account.hisobnitoldirish(qanchaga);


                    }
                    break;
                case 3:
                    System.out.println("qancha o'tkazish kerak: ");
                    int summa2=scanner.nextInt();
                    account.pulotkazish(summa2);
                    break;
                case 4:
                    onoff=false;
                    break;
                default:
                    System.out.println("nimadur");

            }



        }

    }
}
