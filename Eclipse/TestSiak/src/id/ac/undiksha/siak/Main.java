package id.ac.undiksha.siak;

import id.ac.undiksha.entities.Dosen;
import id.ac.undiksha.entities.Mahasiswa;
import id.ac.undiksha.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		System.out.println("==MAHASISWA==");
		System.out.println();
		
		Mahasiswa mhs2 = new Mahasiswa("Andika", "Singaraja", false, "12344534", "Ilkom", "TI", "FTK");
		mhs2.printAllinfo();
		
		System.out.println();
		System.out.println("==DOSEN==");
		System.out.println();
		
		Dosen dsn1 = new Dosen(
				"Pak Yudhi PBO",
				"Singaraja",
				true,
				"2115101003",
				"Ilkom",
				"TI",
				"FTK",
				"Dosen");
		dsn1.printAllinfo();
		
		System.out.println();
		System.out.println("==PEGAWAI==");
		System.out.println();
		
		Pegawai pgw1 = new Pegawai(
				"Dewi",
				"Singaraja",
				false,
				"12344534",
				"Admin");
		pgw1.printAllinfo();
		
		
	}

}
