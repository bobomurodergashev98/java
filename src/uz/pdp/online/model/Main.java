package uz.pdp.online.model;

import java.util.Scanner;
public class Main {
    /*
    2-vazifaga qo'shimcha tarzda base package ichida Main classini va unda main methodini yarating.
    5 ta userdan  iborat User toifasidagi massiv yarating va massiv elementlarini ekranga chiqazing.

     */

    public static void main(String[] args) {
        User massiv []= new User[5];
        Scanner scanner=new Scanner(System.in);
//        Random random=new Random();
        User user=new User(01,"wweff","fgeg56","dgfdgdf5","bob","toshkent");


        System.out.println("Parolni o'zgartirmoqchi bolsangiz eskiparolingnizni kiriting: ");
        String eskiparol=scanner.nextLine();
        User user1=new User("ab12345");
        user1.changePassword(eskiparol);
        user1.se

//        User [] mas={"user01","user02","user03","user04","user05"};

//        main(args);
    }
}
