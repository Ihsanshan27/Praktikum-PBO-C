package Praktikum4;
import java.util.Scanner;

public class testSiswa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nama;
		int npm;
		
		System.out.println("Masukan Nama: ");
		nama = input.next();
		System.out.println("Masukan NPM: ");
		npm = input.nextInt();
		
		Siswa anak = new Siswa();
		anak.setNama(nama);
		anak.setNrp(npm);
		
		System.out.print("Nama Siswa : " + anak.nama + "\nNPM Siswa: " + anak.nrp);
	}
}
