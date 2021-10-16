package task15;

public class Student {
    /*
    Quyidagi atributlari bor bo’lgan Student nomli klass yarating:
    familiya,  ismi,  guruh nomeri, o’qiydigan fanlari (5 ta fandan iborat massiv).
    O’qidigan fanlari ro’yxatini ekranga chiqazuvchi printSubjects nomli method yarating

     */


    private String surname;
    private String name;
    private int groupnomer;

    public Student(String surname, String name, int groupnomer) {
        this.surname = surname;
        this.name = name;
        this.groupnomer = groupnomer;
    }

    String [] fanlar={"ona tili","matematika","rustili","english","fizika"};
    public void printSubjects(){
        System.out.println(surname + " " + name);
        for (int i = 0; i <5; i++) {
            System.out.println(i+1 + "." + fanlar[i]);
        }
    }

    public static void main(String[] args) {
        Student student=new Student("Ergashev","Bobomurod",01);
        student.printSubjects();

    }










}
