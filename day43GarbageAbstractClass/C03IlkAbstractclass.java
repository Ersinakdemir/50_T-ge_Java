package day43GarbageAbstractClass;

public abstract class C03IlkAbstractclass {

    public abstract void AbstractMethod();
    /*
    Abstrackt methodlar child larin Mutlaka override etmesi gereken methodlardir
    dolayisiyla HICBIR ZSAMAN direkt calistirilmazlar ve bu sebeple method body sine ihtiyac yoktur
     bir class in veya methodun abstract olup olmadigini anlayabilirmiyz?

     - Abstract yaziyorsa abstactir, yazmiyorsa degildir
     (abstract olmayan class lara concrete class/method denir)

     Abstract methodlar body e sahip olamaz
     Concrete methodlar ise method body si olmadan olusturrulmaz
     */
}
