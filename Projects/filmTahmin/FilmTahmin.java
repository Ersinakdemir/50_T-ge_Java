package Projects.filmTahmin;

import java.util.*;

public class FilmTahmin {

	static List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  kullanıcından za hakkı bıtene kadar yada sonucu bulana kadar harf istesin
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

	public static void main(String[] args) {


		System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");
		System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");
		Scanner scan = new Scanner(System.in);
		int filmNo= scan.nextInt();
		if (filmNo>8||filmNo<1){
			System.out.println("lütfen 1 ile 8 arasinda bir sayi giriniz");
		}

		filmiGetir(filmNo,film);
	}

	private static void filmiGetir(int filmNo, List<String> film) {
		Scanner scan = new Scanner(System.in);
		System.out.println(film.get(filmNo-1).replaceAll("\\w","-"));   //tüm harf karakterleri _ degistir demek
		System.out.println(film.get(filmNo - 1).length()+ " : harfli filmi tahmin etmek icin bir harf giriniz");

		//String girilenIsim =film.get(filmNo-1).replaceAll("\\w","-");
		//System.out.println(girilenIsim);
		int tahminSayisi=2*film.get(filmNo-1).length();
		int dogruTahminSayisi=0;
		//String str = scan.next();
		//char harf =str.charAt(0);
		List<String> girilenIsim =new ArrayList<>();
		for (int i = 0; i < film.get(filmNo-1).length(); i++) {
			girilenIsim.add("_");

		}
		List<String > filmList =new ArrayList<>();
		for (int i =film.get(filmNo-1).length() -1 ; i >=0; i--) {
			filmList.add(film.get(filmNo-1).substring(i,i+1));
		}
		//System.out.println(filmList);

		do {
			System.out.println("Lütfen bir harf giriniz");
			String str = scan.next().toUpperCase(Locale.ROOT);
			char harf =str.charAt(0);

			if (film.get(filmNo-1).contains(str)){
				System.out.println("Film girdigin harfi iceriyor");

				girilenIsim.set(film.get(filmNo-1).indexOf(str),str);
				//String tekrarharf = film.get(filmNo-1).substring(film.get(filmNo-1).indexOf())
				//if
				//for (int i = 0; i < ; i++) {


				//girilenIsim =girilenIsim.replace(( str.charAt(film.get(filmNo-1).indexOf(str))), harf);
				System.out.println(girilenIsim);
				dogruTahminSayisi++;
			}else  {
				tahminSayisi++;

			}


		}while ((tahminSayisi - dogruTahminSayisi) != 2*film.get(filmNo-1).length());// yanlis sayisi verilen hakka ulasana kadar bu
		                                                                             // badi calisir
		if ((tahminSayisi- dogruTahminSayisi) == 2*film.get(filmNo-1).length()){
			System.out.println("yanlis tahmin sayisi : "+ (tahminSayisi- dogruTahminSayisi) +
					" \noyun bitti.. Bulamadiginiz Film : " + film.get(filmNo-1));
		}

	}
}
