package Praktikum2;
import java.util.Scanner;

public class PengkondisianSwitch {
	public static void main (String args[]) {
	// inisialisasi
		Scanner input = new Scanner(System.in);
			int angka1, angka2, hasil;
			String perhitungan;
	// input user
			System.out.print("Masukkan Angka 1: ");
			angka1 = input.nextInt();
			
			System.out.print("Masukkan Angka 2: ");
			angka2 = input.nextInt();
				
			System.out.print("List perhitungan : " 
					+ "\n * : Pertambahan"
					+ "\n + : Pengurangan"
					+ "\n - : Perkalian"
					+ "\n / : Pembagian"
					+ "\n Masukan simbol Perhitungan : ");
			perhitungan = input.next();
// kondisi switch
			switch(perhitungan) {
			case "+" :
			hasil = angka1 + angka2;
			System.out.print("Hasilnya adalah "+hasil);
			break;
			
			case "-" :
			hasil = angka1 + angka2;
			System.out.print("Hasilnya adalah "+hasil);
			break;
			
			case "*" :
			hasil = angka1 + angka2;
			System.out.print("Hasilnya adalah "+hasil);
			break;
			
			case "/" :
			hasil = angka1 + angka2;
			System.out.print("Hasilnya adalah "+hasil);
			break;
			default:
				System.out.print("Simbol tak ada dalam daftar list");
			}
		}
	}

