import java.util.Scanner;


public class main {
	
	public static void main(String [] args){
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan Nama Ruang, Lokasi, dan Fakultas :");
		JumlahKondisidanPosisiSarana kondisi = new JumlahKondisidanPosisiSarana(in.next(), in.next(), in.next());
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
		System.out.println("Masukkan jumlahSteker ");
		kondisi.setJumlahStopkontak(in.nextInt());
		System.out.println("KondisiSteker (1.Baik, 2.Rusak, 3.Kurang Baik)");
		kondisi.setKondisiStopKontak(in.nextInt());
		System.out.println("posisiSteker (1.pojok ruang dan dekat dosen, 2.di tengah ruang, 3.dekat pintu)");
		kondisi.setPosisiStopKontak(in.nextInt());
		System.out.println("analisis kelistrikan "+kondisi.analisisListrik(kondisi.getJumlahStopkontak(), kondisi.getKondisiStopKontak(), kondisi.getPosisiStopKontak()));
		System.out.println("Masukkan jumlahKabelLcd ");
		kondisi.setJumlahKabelLcd(in.nextInt());
		System.out.println("kondidiKabelLcd(1.berfungsi, 2.rusak)");
		kondisi.setKondisiKabelLcd(in.nextInt());
		System.out.println("posisiKabelLcd(1.dekat pintu, 2. dekat dosen, 3.di tengah ruang)");
		kondisi.setPosisiKabelLcd(in.nextInt());
		System.out.println("analisis Lcd "+kondisi.analisisLcd(kondisi.getJumlahKabelLcd(), kondisi.getPosisiKabelLcd(), kondisi.getKondisiKabelLcd()));
		System.out.println("Masukkan jumlahLampu ");
		kondisi.setJumlahLampu(in.nextInt());
		System.out.println("kondisiLampu(1.baik 14, 2.baik 18, 3.baik 5");
		kondisi.setKondisiLampu(in.nextInt());
		System.out.println("posisiLampu(1.atap ruangan, 2.dinding ruangan");
		kondisi.setPosisiLampu(in.nextInt());
		System.out.println("analisis Lampu "+kondisi.analisisLampu(kondisi.getJumlahLampu(), kondisi.getPosisiLampu(), kondisi.getKondisiLampu()));
		System.out.println("Masukkan jumlahKipaAngin ");
		kondisi.setJumlahKipasAngin(in.nextInt());
		System.out.println("kondisiKipasAngin(1.rusak semua, 2.baik 1, 3.baik 2 ");
		kondisi.setKondisiKipasAngin(in.nextInt());
		System.out.println("posisiKipasAngin(1.dinding ruangan,2.atap ruangan");
		kondisi.setPosisiKipasAngin(in.nextInt());
		System.out.println("analisis kipas angin "+kondisi.analisiKipasAngin(kondisi.getJumlahKipasAngin(), kondisi.getPosisiKipasAngin(), kondisi.getKondisiKipasAngin()));
		System.out.println("masukkan jumlahAc ");
		kondisi.setJumlahAc(in.nextInt());
		System.out.println("kondisiAc(1.baik, 2.rusak)");
		kondisi.setKondisiAc(in.nextInt());
		System.out.println("posisiAc(1.ditengah, 2.dibelakang/disamping)");
		kondisi.setPosisiAc(in.nextInt());
		System.out.println("analisis AC "+kondisi.analisiAc(kondisi.getJumlahAc(), kondisi.getKondisiAc(), kondisi.getPosisiAc()));
		System.out.println("Pilih SSID (1.UMM Hotspot, 2.UMM Hotspot Premium, 3.CORO, 4.Komo Pindah)");
		kondisi.setSSID(in.nextInt());
		System.out.println("bandwidth (1.tidak bisa login, 2.bisa login)");
		kondisi.setInputBandwidth(in.nextInt());
		System.out.println("analisis internet "+kondisi.analisiInterner(kondisi.getSSID(), kondisi.getInputBandwidth()));
		System.out.println("Masukkan jumlahCctv ");
		kondisi.setJumlahCctv(in.nextInt());
		System.out.println("kondisiCctv(1. rusak semua, 2.baik 2, 3.baik 1");
		kondisi.setKondisiCctv(in.nextInt());
		System.out.println("posisiCctv(1.depan dan belakang, 2. samping kanan dan kiri");
		kondisi.setPosisiCctv(in.nextInt());
		System.out.println("analisis Cctv "+kondisi.analisiCctv(kondisi.getJumlahCctv(), kondisi.getKondisiCctv(), kondisi.getPosisiCctv()));
		
		
		System.out.println("Masukkan kondisi lantai, kondisi dinding, kondisi atap, kondisi pintu, kondisi jendela");
		KebersihanRuangKelas bersih = new KebersihanRuangKelas(kondisi.getNamaRuang(), kondisi.getLokasiRuang(), kondisi.getFakultas(), in.next(), in.next(), in.next(), in.next(), in.next());
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
		
		
		KenyamananRuangKelas nyaman = new KenyamananRuangKelas(kondisi.getNamaRuang(), kondisi.getLokasiRuang(), kondisi.getFakultas(), bersih.getKondisiLantai(), bersih.getKondisiDinding(), bersih.getKondisiAtap(), bersih.getKondisiPintu(), bersih.getKondisiJendela());
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
		
		
		KeamananRuangKelas keamananan = new KeamananRuangKelas(kondisi.getNamaRuang(), kondisi.getLokasiRuang(), kondisi.getFakultas());
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
