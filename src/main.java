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
		System.out.println("Masukkan jumlahSteker, KondisiSteker, posisiSteker");
		sarana.setJumlahStopkontak(in.nextInt());
		sarana.setKondisiStopKontak(in.next());
		sarana.setPosisiStopKontak(in.next());
		System.out.println("analisis kelistrikan "+sarana.analisisListrik(sarana.getJumlahStopkontak(), sarana.getKondisiStopKontak(), sarana.getPosisiStopKontak()));
		System.out.println("Masukkan jumlahKabelLcd, kondidiKabelLcd, posisiKabelLcd");
		sarana.setJumlahKabelLcd(in.nextInt());
		sarana.setKondisiKabelLcd(in.next());
		sarana.setPosisiKabelLcd(in.next());
		System.out.println("analisis Lcd "+sarana.analisisLcd(sarana.getJumlahKabelLcd(), sarana.getPosisiKabelLcd(), sarana.getKondisiKabelLcd()));
		System.out.println("Masukkan jumlahLampu, kondisiLampu, posisiLampu");
		sarana.setJumlahLampu(in.nextInt());
		sarana.setKondisiLampu(in.next());
		sarana.setPosisiLampu(in.next());
		System.out.println("analisis Lampu "+sarana.analisisLampu(sarana.getJumlahLampu(), sarana.getPosisiLampu(), sarana.getKondisiLampu()));
		System.out.println("Masukkan jumlahKipaAngin, kondisiKipasAngin, posisiKipasAngin");
		sarana.setJumlahKipasAngin(in.nextInt());
		sarana.setKondisiKipasAngin(in.next());
		sarana.setPosisiKipasAngin(in.next());
		System.out.println("analisis kipas angin "+sarana.analisiKipasAngin(sarana.getJumlahKipasAngin(), sarana.getPosisiKipasAngin(), sarana.getKondisiKipasAngin()));
		System.out.println("Pilih SSID (1.UMM Hotspot, 2.UMM Hotspot Premium, 3.CORO, 4.Komo Pindah), bandwidth ");
		sarana.setSSID(in.nextInt());
		sarana.setInputBandwidth(in.next());
		System.out.println("analisis internet "+sarana.analisiInterner(sarana.getSSID(), sarana.getInputBandwidth()));
		System.out.println("Masukkan jumlahCctv, kondisiCctv, PosisiCctv");
		sarana.setJumlahCctv(in.nextInt());
		sarana.setKondisiCctv(in.next());
		sarana.setPosisiCctv(in.next());
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
		System.out.println("Masukkan kebisingan");
		nyaman.setKebisingan(in.next());
		System.out.println("analisis kebisingan "+nyaman.analisisKebisingan(nyaman.getKebisingan()));
		System.out.println("Masukkan bau");
		nyaman.setBau(in.next());
		System.out.println("analisis bau "+nyaman.analisisBau(nyaman.getBau()));
		System.out.println("Masukkan kebocoran");
		nyaman.setKebocoran(in.next());
		System.out.println("analisis kebocoran "+nyaman.analisisKebocoran(nyaman.getKebocoran()));
		System.out.println("Masukkan kerusakan");
		nyaman.setKerusakan(in.next());
		System.out.println("analisis kerusakan "+nyaman.analisisKerusakan(nyaman.getKerusakan()));
		System.out.println("Masukkan keausan");
		nyaman.setKeausan(in.next());
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
