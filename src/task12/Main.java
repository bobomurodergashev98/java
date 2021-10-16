package task12;



public class Main
{
   double eni;
   double boyi;

    public static void yuza(double e,double b){
        System.out.println("Yuzasi: " + "\n" + e*b);
    }
    public static void perimetri(double e,double b){
        System.out.println("Perimetri: " + "\n" + 2*(e+b));
    }




    public static void main(String[] args) {
        yuza(6,7);
        perimetri(6,7);
    }
}
