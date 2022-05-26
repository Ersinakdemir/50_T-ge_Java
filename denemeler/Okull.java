package denemeler;

public class Okull {
    String schule= "Yildiz Koleji";
    String name;
    String nachName;
    int note;

    public Okull(String schule, String name, String nachName, int note) {
        this.schule = schule;
        this.name = name;
        this.nachName = nachName;
        this.note = note;
    }

    public Okull() {
    }

    public Okull(String schule, String name, String nachName) {
        this.schule = schule;
        this.name = name;
        this.nachName = nachName;

    }

    public void method1(){

        System.out.println("method1 calisti");
    }

    @Override
    public String toString() {
        return "Ögrenci{" +
                "schule='" + schule + '\'' +
                ", name='" + name + '\'' +
                ", nachName='" + nachName + '\'' +
                ", note=" + note +
                '}';
    }
    public String toStringÖgretmen() {
        return "Ögretmen{" +
                "schule='" + schule + '\'' +
                ", name='" + name + '\'' +
                ", nachName='" + nachName + '\'' +
                '}';
    }


}
