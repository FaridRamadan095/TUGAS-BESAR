public class JumlahKondisidanPosisiSarana extends KondisiRuangKelas{
	private int jumlahStopkontak;
	private int kondisiStopKontak;
	private int posisiStopKontak;
	private int jumlahKabelLcd;
	private int kondisiKabelLcd;
	private int posisiKabelLcd;
	private int jumlahLampu;
	private int kondisiLampu;
	private int posisiLampu;
	private int jumlahKipasAngin;
	private int kondisiKipasAngin;
	private int posisiKipasAngin;
	private int jumlahAc;
	private int kondisiAc;
	private int posisiAc;
	private int SSID;
	private int inputBandwidth;
	private int jumlahCctv;
	private int kondisiCctv;
	private int posisiCctv;
	
	

	public JumlahKondisidanPosisiSarana(String namaRuang, String lokasiRuang,
			String Fakultas, int panjangRuang, int lebarRuang, int jumlahKursi,
			int jumlahPintu, int jumlahJendela) {
		super(namaRuang, lokasiRuang, Fakultas, panjangRuang, lebarRuang, jumlahKursi,
				jumlahPintu, jumlahJendela);
	
	}
	public JumlahKondisidanPosisiSarana(String namaRuang, String lokasiRuang,
			String Fakultas) {
		super(namaRuang, lokasiRuang, Fakultas);
		
	}
	
	
	
	
	public JumlahKondisidanPosisiSarana(String namaRuang, String lokasiRuang,
			String Fakultas, int jumlahStopkontak, int kondisiStopKontak,
			int posisiStopKontak, int jumlahKabelLcd, int kondisiKabelLcd,
			int posisiKabelLcd, int jumlahLampu, int kondisiLampu,
			int posisiLampu, int jumlahKipasAngin, int kondisiKipasAngin,
			int posisiKipasAngin, int jumlahAc, int kondisiAc, int posisiAc,
			int sSID, int inputBandwidth, int jumlahCctv, int kondisiCctv,
			int posisiCctv) {
		super(namaRuang, lokasiRuang, Fakultas);
		this.jumlahStopkontak = jumlahStopkontak;
		this.kondisiStopKontak = kondisiStopKontak;
		this.posisiStopKontak = posisiStopKontak;
		this.jumlahKabelLcd = jumlahKabelLcd;
		this.kondisiKabelLcd = kondisiKabelLcd;
		this.posisiKabelLcd = posisiKabelLcd;
		this.jumlahLampu = jumlahLampu;
		this.kondisiLampu = kondisiLampu;
		this.posisiLampu = posisiLampu;
		this.jumlahKipasAngin = jumlahKipasAngin;
		this.kondisiKipasAngin = kondisiKipasAngin;
		this.posisiKipasAngin = posisiKipasAngin;
		this.jumlahAc = jumlahAc;
		this.kondisiAc = kondisiAc;
		this.posisiAc = posisiAc;
		SSID = sSID;
		this.inputBandwidth = inputBandwidth;
		this.jumlahCctv = jumlahCctv;
		this.kondisiCctv = kondisiCctv;
		this.posisiCctv = posisiCctv;
	}
	public int getJumlahStopkontak() {
		return jumlahStopkontak;
	}
	public void setJumlahStopkontak(int jumlahStopkontak) {
		this.jumlahStopkontak = jumlahStopkontak;
	}
	public int getKondisiStopKontak() {
		return kondisiStopKontak;
	}
	public void setKondisiStopKontak(int kondisiStopKontak) {
		this.kondisiStopKontak = kondisiStopKontak;
	}
	public int getPosisiStopKontak() {
		return posisiStopKontak;
	}
	public void setPosisiStopKontak(int posisiStopKontak) {
		this.posisiStopKontak = posisiStopKontak;
	}
	public int getJumlahKabelLcd() {
		return jumlahKabelLcd;
	}
	public void setJumlahKabelLcd(int jumlahKabelLcd) {
		this.jumlahKabelLcd = jumlahKabelLcd;
	}
	public int getKondisiKabelLcd() {
		return kondisiKabelLcd;
	}
	public void setKondisiKabelLcd(int kondisiKabelLcd) {
		this.kondisiKabelLcd = kondisiKabelLcd;
	}
	public int getPosisiKabelLcd() {
		return posisiKabelLcd;
	}
	public void setPosisiKabelLcd(int posisiKabelLcd) {
		this.posisiKabelLcd = posisiKabelLcd;
	}
	public int getJumlahLampu() {
		return jumlahLampu;
	}
	public void setJumlahLampu(int jumlahLampu) {
		this.jumlahLampu = jumlahLampu;
	}
	public int getKondisiLampu() {
		return kondisiLampu;
	}
	public void setKondisiLampu(int kondisiLampu) {
		this.kondisiLampu = kondisiLampu;
	}
	public int getPosisiLampu() {
		return posisiLampu;
	}
	public void setPosisiLampu(int posisiLampu) {
		this.posisiLampu = posisiLampu;
	}
	public int getJumlahKipasAngin() {
		return jumlahKipasAngin;
	}
	public void setJumlahKipasAngin(int jumlahKipasAngin) {
		this.jumlahKipasAngin = jumlahKipasAngin;
	}
	public int getKondisiKipasAngin() {
		return kondisiKipasAngin;
	}
	public void setKondisiKipasAngin(int kondisiKipasAngin) {
		this.kondisiKipasAngin = kondisiKipasAngin;
	}
	public int getPosisiKipasAngin() {
		return posisiKipasAngin;
	}
	public void setPosisiKipasAngin(int posisiKipasAngin) {
		this.posisiKipasAngin = posisiKipasAngin;
	}
	public int getJumlahAc() {
		return jumlahAc;
	}
	public void setJumlahAc(int jumlahAc) {
		this.jumlahAc = jumlahAc;
	}
	public int getKondisiAc() {
		return kondisiAc;
	}
	public void setKondisiAc(int kondisiAc) {
		this.kondisiAc = kondisiAc;
	}
	public int getPosisiAc() {
		return posisiAc;
	}
	public void setPosisiAc(int posisiAc) {
		this.posisiAc = posisiAc;
	}
	public int getSSID() {
		return SSID;
	}
	public void setSSID(int sSID) {
		SSID = sSID;
	}
	public int getInputBandwidth() {
		return inputBandwidth;
	}
	public void setInputBandwidth(int inputBandwidth) {
		this.inputBandwidth = inputBandwidth;
	}
	public int getJumlahCctv() {
		return jumlahCctv;
	}
	public void setJumlahCctv(int jumlahCctv) {
		this.jumlahCctv = jumlahCctv;
	}
	public int getKondisiCctv() {
		return kondisiCctv;
	}
	public void setKondisiCctv(int kondisiCctv) {
		this.kondisiCctv = kondisiCctv;
	}
	public int getPosisiCctv() {
		return posisiCctv;
	}
	public void setPosisiCctv(int posisiCctv) {
		this.posisiCctv = posisiCctv;
	}
	
	String analisisListrik(int steker, int kondisi, int posisi){
		if(steker >= 4 && kondisi==1 && posisi==1){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisisLcd(int kabel,  int kondisi, int posisi){
		if(kabel >= 1 && kondisi==2 && posisi==1){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisisLampu(int lampu, int posisi, int kondisi){
		if(lampu >= 18 && kondisi==2 && posisi==1){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisiKipasAngin(int kipas, int posisi, int kondisi){
		if(kipas >= 2 && kondisi==3&& posisi==2){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisiAc(int ac, int kondisi, int posisi){
		if(ac >= 1 && kondisi==1&& posisi==2){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisiInterner(int SSID, int login){
		if(SSID==1 && login==2){
			return "sesuai";
		}
			else{
				return "tidak sesuai";	
			}
	}
	
	String analisiCctv(int cctv, int kondisi, int posisi){
		if(cctv >= 2 && kondisi==2 && posisi==1){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
}
