package id.ac.undiksha.entities;

import id.ac.undiksha.organisasi.Prodi;

public class Mahasiswa extends Manusia{
	
	private String nim;
	private String prodi;
	
	public Mahasiswa() {
		this.setNim("(nim belum diisi)");				
		this.setProdi("(prodi belum diisi)");			
	}

	
	public Mahasiswa(String nama, String alamat, boolean jenisKelamin,
			String nim, String prodi, String jurusan, String fakultas) {
		
		super(nama, alamat, jenisKelamin);
		this.nim = nim;
		Prodi = new Prodi(kodeProdi,namaProdi);
	}

	//public Mahasiswa(String nim, String prodi, String jurusan, String fakultas) {
		//super();
		//this.nim = nim;
		//this.prodi = prodi;
		//this.jurusan = jurusan;
		//this.fakultas = fakultas;
	//}

	public void printAllinfo() {
		System.out.println("Nama: " 	+ this.getNama());
		System.out.println("Alamat: " 	+ this.getAlamat());
		System.out.println("NIM: " 		+ this.getNim());
		System.out.println("Kode Prodi: "	+ this.getProdi().getKodeProdi());
		System.out.println("Nama Prodi: "	+ this.getProdi().getNamaProdi());		
		
		System.out.println("Jenis Kelamin:"
				+ (this.isJenisKelamin() ? "Laki-laki" : "Perempuan"));
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getProdi() {
		return prodi;
	}

	public void setProdi(String prodi) {
		this.prodi = prodi;
	}


	
}
