package task11;

public class Point{
    //X va Y koordinatalarni ifodalovchi atributlari bor bo’lgan Point classini yozing. Koordinatalarni
    // “(45, 56)” shaklda chop etuvchi printXY() methodini yozing.

    int x;
    int y;
   public static void printXY(int x, int y){
        System.out.println( "(" + x + "," + y +")");
    }

   public static void main(String[] args) {
     printXY(5,6);

    }




}
