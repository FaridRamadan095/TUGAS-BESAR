
public class KondisiRuangKelas {
	private int panjangRuang;
	private int lebarRuang;
	private int jumlahKursi;
	private int jumlahPintu;
	private int jumlahJendela;
	public int getPanjangRuang() {
		return panjangRuang;
	}
	public void setPanjangRuang(int panjangRuang) {
		this.panjangRuang = panjangRuang;
	}
	public int getLebarRuang() {
		return lebarRuang;
	}
	public void setLebarRuang(int lebarRuang) {
		this.lebarRuang = lebarRuang;
	}
	public int getJumlahKursi() {
		return jumlahKursi;
	}
	public void setJumlahKursi(int jumlahKursi) {
		this.jumlahKursi = jumlahKursi;
	}
	public int getJumlahPintu() {
		return jumlahPintu;
	}
	public void setJumlahPintu(int jumlahPintu) {
		this.jumlahPintu = jumlahPintu;
	}
	public int getJumlahJendela() {
		return jumlahJendela;
	}
	public void setJumlahJendela(int jumlahJendela) {
		this.jumlahJendela = jumlahJendela;
	}
	
	
	int hitungLuasRuang(int panjang, int lebar){
		return panjang*lebar;
	}
	
	String hitungBentukRuang(int panjang, int lebar){
		if(panjang!=lebar){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	
	String hitungRasioLuas(int luas, int kursi){
		if((luas/kursi)>=0.5){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
		
	}
	
	
	
	String analisisPintuJendela(int pintu, int jendela){
		if(pintu>=1&&jendela>=2){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	
	

}
