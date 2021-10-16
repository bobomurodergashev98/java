package uz.pdp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}

class Book {
    /*
        Book fieldlari:  — Avtori, narxi, chegirmasi, sarlovhasi va sahifalar soni
        Book methodlari — sotuv narxini hisoblash, bojxona to’lovini hisoblash(sotuv narxini 30 %)
        EBook fieldlari — yuklab olinadigan sayt va hajmi (MB)
        EBook methodlari —sarlovhani chop etish
        PayperBook fieldlari – vazni, yetkazib berish vaqti(kun)
   */

    private String avtor;
    private int narxi;
    private int chegirma;
    private String sarlavhasi;
    private int sahifalarSoni;

    public void sotuvnarxiniHisoblash(){
        System.out.println("Kitob narxi: " + narxi);
    }

    public void rastamochka(){
        System.out.println("Bojhona to'lovi: " + narxi*0.3);
    }


    public Book() {

    }

    public Book(String avtor, int narxi, int chegirma, String sarlavhasi, int sahifalarSoni) {
        this.avtor = avtor;
        this.narxi = narxi;
        this.chegirma = chegirma;
        this.sarlavhasi = sarlavhasi;
        this.sahifalarSoni = sahifalarSoni;
    }

}


class Ebook extends Book{
    /*
  EBook fieldlari — yuklab olinadigan sayt va hajmi (MB)
        EBook methodlari —sarlovhani chop etish
   */
    private String saytnomi;
    private int hajmi;

    public void setSaytnomi(String saytnomi) {
        this.saytnomi = saytnomi;
    }

    public void setHajmi(int hajmi) {
        this.hajmi = hajmi;
    }

    public String getSaytnomi() {
        return saytnomi;
    }

    public int getHajmi() {
        return hajmi;
    }

    public Ebook(){
    }
    public Ebook(String saytnomi, int hajmi) {
        this.saytnomi = saytnomi;
        this.hajmi = hajmi;
    }

    public Ebook(String avtor, int narxi, int chegirma, String sarlavhasi, int sahifalarSoni, String saytnomi, int hajmi) {
        super(avtor, narxi, chegirma, sarlavhasi, sahifalarSoni);
        this.saytnomi = saytnomi;
        this.hajmi = hajmi;
    }
    public void chopetish(){
        System.out.println("chop etish: ");
    }


}


class PayperBook extends Book {
    private int vazni;
    private int dostavkakuni;

    public PayperBook(int vazni, int dostavkakuni) {
        this.vazni = vazni;
        this.dostavkakuni = dostavkakuni;
    }
    public  PayperBook(){};
    public PayperBook(String avtor, int narxi, int chegirma, String sarlavhasi, int sahifalarSoni, int vazni, int dostavkakuni) {
        super(avtor, narxi, chegirma, sarlavhasi, sahifalarSoni);
        this.vazni = vazni;
        this.dostavkakuni = dostavkakuni;
    }
}

