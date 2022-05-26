package day30PaasByValue;

public class C02StaticBloks {{
    //static olmayan bloklar ise obje olusturulurken calisir static
    // bloklar sadece 1 kere en basta calisir ama static
    // olmayan bloklar her obje olusturulurken tekrar calistzirilir
    System.out.println("static olmayan method calisti");
}
static {
    System.out.println("static blok calisti");
}


}
