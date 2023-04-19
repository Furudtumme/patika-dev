package patikadev;
import java.util.Scanner;

public class pratik1 {

	public static void main(String[] args) {
	int mat, fiz, muzik, kimya, tarih, tr;
	Scanner input= new Scanner(System.in);
	System.out.println("Matematik notunuzu giriniz.");
	mat= input.nextInt();
	System.out.println("Fizik notunuzu giriniz.");
	fiz= input.nextInt();
	System.out.println("Müzik notunuzu giriniz.");
	muzik= input.nextInt();
	System.out.println("Kimya notunuzu giriniz.");
	kimya=input.nextInt();
	System.out.println("Tarih notunuzu giriniz.");
	tarih=input.nextInt();
	System.out.println("Türkçe notunuzu giriniz.");
	tr=input.nextInt();
	double ort= (mat+fiz+muzik+kimya+tarih+tr)/6.0;
	String cvp= (60.0<ort)? ("Sınıfı Geçti."): ("Sınıfta Kaldı.");
	System.out.println(cvp + ort);
	}

}
