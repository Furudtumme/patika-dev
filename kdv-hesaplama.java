package patikadev;
import java.util.Scanner;
public class pratik2 {

	public static void main(String[] args) {
		int anapara;
		double kdv, sonuc=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Lütfen hesaplamak istediğiniz miktarı giriniz.");
		anapara= input.nextInt();
		if(0<anapara && anapara<1000) {
			kdv=(anapara*18)/100;
			sonuc=anapara+kdv;
			System.out.println("KDV'siz fiyat: " + anapara);
			System.out.println("KDV'li fiyat: " + sonuc);
			System.out.println("KDV: "+ kdv);
		} else if(anapara>1000) {
			kdv=(anapara*8)/100;
			sonuc=anapara+kdv;
			System.out.println("KDV'siz fiyat: " + anapara);
			System.out.println("KDV'li fiyat: " + sonuc);
			System.out.println("KDV: "+ kdv);

		}

	}

}
