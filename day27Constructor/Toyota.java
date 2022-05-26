package day27Constructor;

public class Toyota {
    String marka = "Toyota";
    int tekerAdedi = 4;
    boolean motoruVarMi =true;
    String model;
    String yakit ;
    int yil;
    public void maxHiz(){
        if (yakit.equals("Benzin")){
            System.out.println("benzinli araclar en fazla 240 km");
        }else if (yakit.equals("Dizel")){
            System.out.println("Dizel araclar en fazla 260 km");
        }
    }
    public void renkTercihleri(){
        if(model.equals("Corolla")){
            System.out.println("sari ve lacivertz");
        }
        else if (model.equals("Yaris")){
            System.out.println("sari ve beyaz");
        }
    }
}
