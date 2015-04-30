import java.util.Scanner;


public class main {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		IdentitasRuangKelas identitas = new IdentitasRuangKelas();
		System.out.print("Masukkan Nama Ruang, Lokasi, dan Fakultas :");
		identitas.setNamaRuang(in.next());
		identitas.setLokasiRuang(in.next());
		identitas.setFakultas(in.next());
		
		KondisiRuangKelas kondisi = new KondisiRuangKelas();
		System.out.print("Masukkan panjangRuang, lebarRuang");
		kondisi.setPanjangRuang(in.nextInt());
		kondisi.setLebarRuang(in.nextInt());
		System.out.println("luas ruang ini adalah "+kondisi.hitungLuasRuang(kondisi.getPanjangRuang(), kondisi.getLebarRuang()));
		System.out.println("bentuk ruang adalah "+kondisi.hitungBentukRuang(kondisi.getPanjangRuang(), kondisi.getLebarRuang()));
		System.out.println("Masukkan jumlah kursi");
		kondisi.setJumlahKursi(in.nextInt());
		System.out.println("rasio luas "+kondisi.hitungRasioLuas(kondisi.hitungLuasRuang(kondisi.getPanjangRuang(),kondisi.getLebarRuang()), kondisi.getJumlahKursi()));
		System.out.println("Masukkan jumlahPintu, jumlahJendela");
		kondisi.setJumlahPintu(in.nextInt());
		kondisi.setJumlahJendela(in.nextInt());
		System.out.println("pintu dan jendela "+kondisi.analisisPintuJendela(kondisi.getJumlahPintu(), kondisi.getJumlahJendela()));
		
		JumlahKondisidanPosisiSarana sarana = new JumlahKondisidanPosisiSarana();
		System.out.println("Masukkan jumlahSteker ");
		sarana.setJumlahStopkontak(in.nextInt());
		System.out.println("KondisiSteker (1.Baik, 2.Rusak, 3.Kurang Baik)");
		sarana.setKondisiStopKontak(in.nextInt());
		System.out.println("posisiSteker (1.pojok ruang dan dekat dosen, 2.di tengah ruang, 3.dekat pintu)");
		sarana.setPosisiStopKontak(in.nextInt());
		System.out.println("analisis kelistrikan "+sarana.analisisListrik(sarana.getJumlahStopkontak(), sarana.getKondisiStopKontak(), sarana.getPosisiStopKontak()));
		System.out.println("Masukkan jumlahKabelLcd ");
		sarana.setJumlahKabelLcd(in.nextInt());
		System.out.println("kondidiKabelLcd(1.berfungsi, 2.rusak)");
		sarana.setKondisiKabelLcd(in.nextInt());
		System.out.println("posisiKabelLcd(1.dekat pintu, 2. dekat dosen, 3.di tengah ruang)");
		sarana.setPosisiKabelLcd(in.nextInt());
		System.out.println("analisis Lcd "+sarana.analisisLcd(sarana.getJumlahKabelLcd(), sarana.getPosisiKabelLcd(), sarana.getKondisiKabelLcd()));
		System.out.println("Masukkan jumlahLampu ");
		sarana.setJumlahLampu(in.nextInt());
		System.out.println("kondisiLampu(1.baik 14, 2.baik 18, 3.baik 5");
		sarana.setKondisiLampu(in.nextInt());
		System.out.println("posisiLampu(1.atap ruangan, 2.dinding ruangan");
		sarana.setPosisiLampu(in.nextInt());
		System.out.println("analisis Lampu "+sarana.analisisLampu(sarana.getJumlahLampu(), sarana.getPosisiLampu(), sarana.getKondisiLampu()));
		System.out.println("Masukkan jumlahKipaAngin ");
		sarana.setJumlahKipasAngin(in.nextInt());
		System.out.println("kondisiKipasAngin(1.rusak semua, 2.baik 1, 3.baik 2 ");
		sarana.setKondisiKipasAngin(in.nextInt());
		System.out.println("posisiKipasAngin(1.dinding ruangan,2.atap ruangan");
		sarana.setPosisiKipasAngin(in.nextInt());
		System.out.println("analisis kipas angin "+sarana.analisiKipasAngin(sarana.getJumlahKipasAngin(), sarana.getPosisiKipasAngin(), sarana.getKondisiKipasAngin()));
		System.out.println("masukkan jumlahAc ");
		sarana.setJumlahAc(in.nextInt());
		System.out.println("kondisiAc(1.baik, 2.rusak)");
		sarana.setKondisiAc(in.nextInt());
		System.out.println("posisiAc(1.ditengah, 2.dibelakang/disamping)");
		sarana.setPosisiAc(in.nextInt());
		System.out.println("analisis AC "+sarana.analisiAc(sarana.getJumlahAc(), sarana.getKondisiAc(), sarana.getPosisiAc()));
		System.out.println("Pilih SSID (1.UMM Hotspot, 2.UMM Hotspot Premium, 3.CORO, 4.Komo Pindah)");
		sarana.setSSID(in.nextInt());
		System.out.println("bandwidth (1.tidak bisa login, 2.bisa login)");
		sarana.setInputBandwidth(in.nextInt());
		System.out.println("analisis internet "+sarana.analisiInterner(sarana.getSSID(), sarana.getInputBandwidth()));
		System.out.println("Masukkan jumlahCctv ");
		sarana.setJumlahCctv(in.nextInt());
		System.out.println("kondisiCctv(1. rusak semua, 2.baik 2, 3.baik 1");
		sarana.setKondisiCctv(in.nextInt());
		System.out.println("posisiCctv(1.depan dan belakang, 2. samping kanan dan kiri");
		sarana.setPosisiCctv(in.nextInt());
		System.out.println("analisis Cctv "+sarana.analisiCctv(sarana.getJumlahCctv(), sarana.getKondisiCctv(), sarana.getPosisiCctv()));
		
		LingkunganRuangKelas lingkup = new LingkunganRuangKelas();
		System.out.println("Masukkan kondisi lantai, kondisi dinding, kondisi atap, kondisi pintu, kondisi jendela");
		lingkup.setKondisiLantai(in.next());
		lingkup.setKondisiDinding(in.next());
		lingkup.setKondisiAtap(in.next());
		lingkup.setKondisiPintu(in.next());
		lingkup.setKondisiJendela(in.next());
		System.out.println("analisis kebersihan " +lingkup.analisisKebersihan(lingkup.getKondisiLantai(), lingkup.getKondisiDinding(), lingkup.getKondisiAtap(), lingkup.getKondisiPintu(), lingkup.getKondisiJendela()));
		
		KebersihanRuangKelas bersih = new KebersihanRuangKelas();
		System.out.println("Masukkan sirkulasi udara");
		bersih.setSirkulasiUdara(in.next());
		System.out.println("analisis sirkulasi udara "+bersih.analisisSirkulasiUdara(bersih.getSirkulasiUdara()));
		System.out.println("Masukkan nilai pencahayaan");
		bersih.setNilaiPencahayaan(in.nextInt());
		System.out.println("analisis pencahayaan "+bersih.analisisPencahayaan(bersih.getNilaiPencahayaan()));
		System.out.println("Masukkan kelembapan");
		bersih.setInputKelembapan(in.nextInt());
		System.out.println("analisis kelembapan "+bersih.analisisKelembapan(bersih.getInputKelembapan()));
		System.out.println("Masukkan suhu");
		bersih.setInputSuhu(in.nextInt());
		System.out.println("analisis suhu "+bersih.analisisSuhu(bersih.getInputSuhu()));
		
		KenyamananRuangKelas nyaman = new KenyamananRuangKelas();
		System.out.println("Masukkan kebisingan(1.tidak bising, 2.bising");
		nyaman.setKebisingan(in.nextInt());
		System.out.println("analisis kebisingan "+nyaman.analisisKebisingan(nyaman.getKebisingan()));
		System.out.println("Masukkan bau(1.bau, 2.tidak bau");
		nyaman.setBau(in.nextInt());
		System.out.println("analisis bau "+nyaman.analisisBau(nyaman.getBau()));
		System.out.println("Masukkan kebocoran(1.bocor, 2.tidak bocor");
		nyaman.setKebocoran(in.nextInt());
		System.out.println("analisis kebocoran "+nyaman.analisisKebocoran(nyaman.getKebocoran()));
		System.out.println("Masukkan kerusakan(1.tidak rusak,2.rusak)");
		nyaman.setKerusakan(in.nextInt());
		System.out.println("analisis kerusakan "+nyaman.analisisKerusakan(nyaman.getKerusakan()));
		System.out.println("Masukkan keausan(1.aus, 2.tidak aus");
		nyaman.setKeausan(in.nextInt());
		System.out.println("analisis keausan "+nyaman.analisisKeausan(nyaman.getKeausan()));
		
		KeamananRuangKelas keamananan = new KeamananRuangKelas();
		boolean ulang=false;
		while(ulang==false){
			System.out.println("Masukkan kekokohan ");
			keamananan.setKekokohan(in.next());
			System.out.println("Kekokohan "+keamananan.analisisKekokohan(keamananan.getKekokohan()));
			System.out.println("Masukkan Kunci pintu dan Jendela ");
			keamananan.setKunciPintu(in.next());
			keamananan.setKunciJendela(in.next());
			System.out.println("Analisis Kunci Pintu dan Jendela "+keamananan.analisisKunciPintuJendela(keamananan.getKunciPintu(), keamananan.getKunciJendela()));
			System.out.println("Masukkan Bahaya ");
			keamananan.setBahaya(in.next());
			System.out.println("Analisis Keamanan Ruang "+keamananan.keamananRuang(keamananan.getBahaya()));
			
			System.out.println("List Inputan\nDi kelas Keamanan Ruang"
					+ "\nKekokohan "+keamananan.getKekokohan()+
					"\nKunci Pintu "+keamananan.getKunciPintu()+
					"\nKunci Jendela "+keamananan.getKunciJendela()+
					"\nBahaya "+keamananan.getBahaya()+
					"\nIngin Edit? (y/n)");
			if(in.next().toLowerCase().equals("y")){
				ulang=false;
			}else{
				ulang=true;
				break;
			}
		}
		
		
		System.out.println("Selesai");
		
	}

}
