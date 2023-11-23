package Praktikum2;
import java.util.Scanner;

public class PengkondisianIF {
	public static void main (String args[]) {
// inisialisasi
		int angka1, angka2, hasil, perhitungan;
		Scanner input = new Scanner(System.in);
// input user
		System.out.print("Masukkan Angka 1: ");
		angka1 = input.nextInt();
		
		System.out.print("Masukkan Angka 2: ");
		angka2 = input.nextInt();
		
		System.out.print("List perhitungan : " 
				+ "\n 1 : Pertambahan"
				+ "\n 2 : Pengurangan"
				+ "\n 3 : Perkalian"
				+ "\n 4 : Pembagian"
				+ "\n Masukan Angka Perhitungan : ");
		perhitungan = input.nextInt();
// kondisi IF
		if(perhitungan == 1 ) {
			hasil = angka1 + angka2;
			System.out.println("Hasilnya adalah : "+hasil);
		} else if (perhitungan == 2) {
			hasil = angka1 - angka2;
			System.out.println("Hasilnya adalah : "+hasil);
		} else if (perhitungan == 3) {
			hasil = angka1 * angka2;
			System.out.println("Hasilnya adalah : "+hasil);
		} else if (perhitungan == 4) {
			hasil = angka1 / angka2;
			System.out.println("Hasilnya adalah : "+hasil);
		} else {
			System.out.println("angka yang dimasukkan tidak ada didaftar list");
		}
	}
}
