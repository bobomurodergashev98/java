package task25;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      int a=scanner.nextInt();
        tekshirish(a);

    }
    public static boolean tekshirish(int son){
        int [] mas=new int[3];
        for (int i = 0; i < mas.length; i++) {
            mas[i]=son%10;
            son=son/10;
            if (son==0){
                break;
            }
        }
        for (int i = 0; i < 2; i+=2) {
            if (mas[i]==mas[i+2]){
                return true;
            }
        }
        return false;
    }


}
