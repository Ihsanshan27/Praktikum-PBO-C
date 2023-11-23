package Praktikum1;
import java.util.Scanner;

public class Latihan1 {
	public static void main (String args[]) {
//		System.out.println("Hello World");
		
//		inisialisai input user
		Scanner input = new Scanner(System.in);
		
// 		Inisialisasi Variable
		int angka1, angka2, hasil;		

//		inputan user
		System.out.print("=======================");
		System.out.print("Program Hitung");
		System.out.print("=======================");
		System.out.print("\nMasukan angka pertama: ");
		angka1 = input.nextInt();
		
		System.out.print("Masukan angka kedua: ");
		angka2 = input.nextInt();
//		
//		Hasil Inputan
		hasil = angka1 + angka2;
		System.out.println("Hasil pertambahan : "+hasil);
		
		hasil = angka1 * angka2;
		System.out.println("Hasil perkalian : "+hasil);
		
//		Inisialisasi Variable 
		String namaDepan,namaBelakang,fullName;
		
		System.out.print("=======================");
		System.out.print("Program Input Nama");
		System.out.print("=======================");
		
		System.out.print("\nMasukan Nama Depan: ");
		namaDepan = input.next();
		System.out.print("Masukan Nama Belakang: ");
		namaBelakang = input.next();
		
		fullName = namaDepan +" "+namaBelakang;
		System.out.print("Your Name: "+fullName);
	}
}
