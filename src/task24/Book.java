package task24;

public class Book {
    /*
    Quyidagi attributlardan iborat Book klassini encapsulation prinsipi asosida yarating: nomi, avtorlari
     (bir nechta bo’lishi mumkin), ISBN(13 ta sondan iborat xalqaro kitob raqami, masalan 012345689112) va narxi.
        Kitob nomi va avtorlarini chop etuvchi method yarating.
   */
    private String nomi;
    private String author;
    private long ISBN_raqami;
    private int narxi;
    private  int n;


    public void getAuthor(String [] author) {
        System.out.println("Avtorlari: ");
        for (int i = 0; i < author.length; i++) {
            System.out.print(author[i] + ", ");
        }



    }


    public String[] setAuthor(String[] author) {
//        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < author.length; i++) {
            author[i]=author[i];
        }

        return author;
    }
    public void getNomi() {
        System.out.println(nomi);
    }

    public void setNomi(String nomi) {
        this.nomi = nomi;
    }


    public long getISBN_raqami() {
        return ISBN_raqami;
    }

    public void setISBN_raqami(long ISBN_raqami) {
        this.ISBN_raqami = ISBN_raqami;
    }

    public int getNarxi() {
        return narxi;
    }

    public void setNarxi(int narxi) {
        this.narxi = narxi;
    }



    public static void main(String[] args) {
        Book book=new Book();
        book.setISBN_raqami(1557844544);
        System.out.println("Kitobniing nomi: ");
        book.setNomi("Uyda yolg'iz");
        book.getNomi();
        System.out.println("Narxi: ");
        book.setNarxi(10000);
        System.out.println(book.getNarxi());
        book.getAuthor(book.setAuthor(new String[]{"ab","iojoi","jniji","yuihi"}));
    }


}
