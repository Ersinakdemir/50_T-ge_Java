package day27Constructor;

public class Volvo {
    String marka ="Volvo";
    String mensei = "Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit ;
    boolean otomatipilot =otomotikPilotSorgusu();
    int maxHiz = maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model = mdl;
        elektrikliMi =elk;
        yil= yl;
        yakit=ykt;
        maxHiz =maxHizAta();
        otomatipilot =otomotikPilotSorgusu();


    }
    public Volvo(){

    }

    public int maxHizAta() {
        if (elektrikliMi){
            maxHiz = 160;
        }else {
            maxHiz =240;
        }
        return maxHiz;

    }

    public boolean otomotikPilotSorgusu() {
        boolean sonuc= false;
        if(elektrikliMi){
            sonuc = true;
        }else{
            sonuc = false;
        }return sonuc;
    }
    public String toString(){
        String  arabaOzellikleri = "Model : " + model+
                                    " Yakit : " + yakit+
                                    " Max hiz : "+ maxHiz;

    return arabaOzellikleri;
    }

}
