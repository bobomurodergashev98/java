package task13;

public class MyClass {


   /*Ikkita at
   ribut: firstAtribut va secondAttribut larga ega MyClass nomli klass yarating. Ushbu atributlar qiymatini
    aboutAttributes, yig’indisini sumAttributes,kattasini maxAttribute ekranga chiqazadigan methodlarini yarating.
     */
    private int firstAtribute;
    private int secondAtribute;

    public MyClass(int f, int s) {
        this.firstAtribute = f;
        this.secondAtribute = s;
    }

    public  void aboutAttributes(){
        System.out.println("firstAtribute: " + firstAtribute + "\n" + "secondAtribute: " + secondAtribute);
    }
    public  void sumAttributes(){
        System.out.println("yig'indisi: " + (int)(firstAtribute+secondAtribute));
    }
    public  void maxAttributes(){
        if (firstAtribute>secondAtribute) System.out.println("Kattasi: " + firstAtribute);
            else System.out.println("Kattasi: " + secondAtribute);
    }


    public static void main(String[] args) {
        MyClass myClass1=new MyClass(10,58);
        myClass1.aboutAttributes();
        myClass1.sumAttributes();
        myClass1.maxAttributes();
    }

}
