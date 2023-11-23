package Praktikum4;
import java.util.Scanner;

public class testTabungan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int saldo, tariktunai;
		
		System.out.print("Masukan jumlah saldo: ");
		saldo = input.nextInt();
		Tabungan tabungan = new Tabungan(saldo);
		System.out.println("Saldo Awal: " + tabungan.saldo);
		
		System.out.print("Masukan saldo penarikan: ");
		tariktunai = input.nextInt();
		tabungan.ambilUang(tariktunai);
		
		System.out.println("Jumlah uang yang diambil: " + tariktunai);
		System.out.println("Saldo Sekarang: "+ tabungan.saldo);
	}
}
