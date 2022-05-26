package denemeler;

public class proje2Common {
    public static void main(String[] args) {
        int array1[] ={1,2,3};
        int array2[] ={2,3};
        boolean commenEnd =false;
        if (array1.length>=1 && array2.length>=1){
            if (array1[0]==array2[0] || array1[array1.length -1] ==array2[array2.length - 1]){
                commenEnd =true;
            }else{
                commenEnd =false;
            }
            System.out.println(commenEnd);

        }else{
            System.out.println("Array en az bir eleman icermeli");
        }


    }
}
