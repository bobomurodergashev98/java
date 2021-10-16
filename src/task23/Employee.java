package task23;

public class Employee {
    /*
   Quyidagi attributelardan iborat Employee klassini encapsulation prinsipi asosida yarating:
   identifikasiya raqami, ismi, familiyasi va oyligi.
   */


    private int raqam;
    private String ismi;
    private String familyasi;
    private int oyligi;

    public int getRaqam() {
        return raqam;
    }

    public void setRaqam(int raqam) {
        this.raqam = raqam;
    }

    public String getIsmi() {
        return ismi;
    }

    public void setIsmi(String ismi) {
        this.ismi = ismi;
    }

    public String getFamilyasi() {
        return familyasi;
    }

    public void setFamilyasi(String familyasi) {
        this.familyasi = familyasi;
    }

    public int getOyligi() {
        return oyligi;
    }

    public void setOyligi(int oyligi) {
        this.oyligi = oyligi;
    }


}
