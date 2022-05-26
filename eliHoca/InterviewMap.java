package eliHoca;

import java.util.*;

public class InterviewMap {
    public static void main(String[] args) {
        // PART 1
// create a map with groupName as key and groupMembers as value
// "Group1" = ["Member1", "Member2"]
// "Group2" = ["Member3", "Member4", "Member5"]


// BÖLÜM 1
// anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
// "Grup1" = ["Üye1", "Üye2"]
// "Grup2" = ["Üye3", "Üye4", "Üye5"]

// PART 2
// find how many members each group has

// BÖLÜM 2
// her grubun kaç üyesi olduğunu bul
        Map<String, ArrayList<String>> grupIsimUyaler = new HashMap<>();

        ArrayList<String>devTeam = new ArrayList<>(Arrays.asList("Ali","Ahmet","Mehmet"));
        ArrayList<String>qaTeam = new ArrayList<>(Arrays.asList("Ersin","Bahaddin","Mehmet"));
        grupIsimUyaler.put("Devolopment Team",devTeam);
        grupIsimUyaler.put("QA Team",qaTeam);

        System.out.println(grupIsimUyaler);//{QA Team=[Ersin, Bahaddin, Mehmet], Devolopment Team=[Ali, Ahmet, Mehmet]}

        //2.Bolüm
        //1.Yol
        Collection<ArrayList<String>>values = grupIsimUyaler.values();
        for (ArrayList<String>kisi:values
             ) {
            System.out.println(kisi.size());

        }//2.Yol
        Set<String>keys=grupIsimUyaler.keySet();

        for (String key:keys
             ) {
            ArrayList<String>grupList=grupIsimUyaler.get(key);
            System.out.println("gruptaki uye sayisi :" + key + " " + grupList.size());
        }
    }
}
