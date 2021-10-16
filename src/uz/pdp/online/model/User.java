 package uz.pdp.online.model;

import java.util.Scanner;

public class User {
    /*
  Model package ini ichida quyidagicha atributlari bor bo’lgan User klassini yarating:
  id,  username(public), email(public), password(private),  name, address.
  Parolni o’zgartiradigan changePassword methodini yarating.
  Bunda eski parol kiritiladi agar u to’g’ri bo’lsa yangi parol kiritish mumkin bo’lsin.
   */


    int id;
    public String username;
    public String email;
    private String password;
    String name;
    String adress;
    private String [] massiv;
    public User(String password) {
        this.password = password;
    }
    public User(){


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String[] getMassiv() {
        return massiv;
    }

    public void setMassiv(String[] massiv) {
        this.massiv = massiv;
    }

    public User(int id, String username, String email, String password, String name, String adress) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    void changePassword(String eskiparol){
        Scanner sc=new Scanner(System.in);
        boolean onoff=true;

        while (onoff){
            if (eskiparol.equals(password)){
                System.out.println("Yangi parolni kiriting: ");
                String yangiparol=sc.nextLine();
                System.out.println("Parol muvaffaqiyatli o'zgartirildi!");
                onoff=false;
            }else {
                System.out.println("Parol notogti iltimos tekshirib qaytadan kiriting: ");
            }
        }
    }
}
