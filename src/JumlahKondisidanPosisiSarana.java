
public class JumlahKondisidanPosisiSarana {
	private int jumlahStopkontak;
	private String kondisiStopKontak;
	private String posisiStopKontak;
	private int jumlahKabelLcd;
	private String kondisiKabelLcd;
	private String posisiKabelLcd;
	private int jumlahLampu;
	private String kondisiLampu;
	private String posisiLampu;
	private int jumlahKipasAngin;
	private String kondisiKipasAngin;
	private String posisiKipasAngin;
	private int jumlahAc;
	private String kondisiAc;
	private String posisiAc;
	private int SSID;
	private String inputBandwidth;
	private int jumlahCctv;
	private String kondisiCctv;
	private String posisiCctv;
	
	public int getJumlahStopkontak() {
		return jumlahStopkontak;
	}
	public void setJumlahStopkontak(int jumlahStopkontak) {
		this.jumlahStopkontak = jumlahStopkontak;
	}
	public String getKondisiStopKontak() {
		return kondisiStopKontak;
	}
	public void setKondisiStopKontak(String kondisiStopKontak) {
		this.kondisiStopKontak = kondisiStopKontak;
	}
	public String getPosisiStopKontak() {
		return posisiStopKontak;
	}
	public void setPosisiStopKontak(String posisiStopKontak) {
		this.posisiStopKontak = posisiStopKontak;
	}
	public int getJumlahKabelLcd() {
		return jumlahKabelLcd;
	}
	public void setJumlahKabelLcd(int jumlahKabelLcd) {
		this.jumlahKabelLcd = jumlahKabelLcd;
	}
	public String getKondisiKabelLcd() {
		return kondisiKabelLcd;
	}
	public void setKondisiKabelLcd(String kondisiKabelLcd) {
		this.kondisiKabelLcd = kondisiKabelLcd;
	}
	public String getPosisiKabelLcd() {
		return posisiKabelLcd;
	}
	public void setPosisiKabelLcd(String posisiKabelLcd) {
		this.posisiKabelLcd = posisiKabelLcd;
	}
	public int getJumlahLampu() {
		return jumlahLampu;
	}
	public void setJumlahLampu(int jumlahLampu) {
		this.jumlahLampu = jumlahLampu;
	}
	public String getKondisiLampu() {
		return kondisiLampu;
	}
	public void setKondisiLampu(String kondisiLampu) {
		this.kondisiLampu = kondisiLampu;
	}
	public String getPosisiLampu() {
		return posisiLampu;
	}
	public void setPosisiLampu(String posisiLampu) {
		this.posisiLampu = posisiLampu;
	}
	public int getJumlahKipasAngin() {
		return jumlahKipasAngin;
	}
	public void setJumlahKipasAngin(int jumlahKipasAngin) {
		this.jumlahKipasAngin = jumlahKipasAngin;
	}
	public String getKondisiKipasAngin() {
		return kondisiKipasAngin;
	}
	public void setKondisiKipasAngin(String kondisiKipasAngin) {
		this.kondisiKipasAngin = kondisiKipasAngin;
	}
	public String getPosisiKipasAngin() {
		return posisiKipasAngin;
	}
	public void setPosisiKipasAngin(String posisiKipasAngin) {
		this.posisiKipasAngin = posisiKipasAngin;
	}
	public int getJumlahAc() {
		return jumlahAc;
	}
	public void setJumlahAc(int jumlahAc) {
		this.jumlahAc = jumlahAc;
	}
	public String getKondisiAc() {
		return kondisiAc;
	}
	public void setKondisiAc(String kondisiAc) {
		this.kondisiAc = kondisiAc;
	}
	public String getPosisiAc() {
		return posisiAc;
	}
	public void setPosisiAc(String posisiAc) {
		this.posisiAc = posisiAc;
	}

	public int getSSID() {
		return SSID;
	}
	public void setSSID(int SSID) {
		this.SSID = SSID;
	}
	public String getInputBandwidth() {
		return inputBandwidth;
	}
	public void setInputBandwidth(String inputBandwidth) {
		this.inputBandwidth = inputBandwidth;
	}
	public int getJumlahCctv() {
		return jumlahCctv;
	}
	public void setJumlahCctv(int jumlahCctv) {
		this.jumlahCctv = jumlahCctv;
	}
	public String getKondisiCctv() {
		return kondisiCctv;
	}
	public void setKondisiCctv(String kondisiCctv) {
		this.kondisiCctv = kondisiCctv;
	}
	public String getPosisiCctv() {
		return posisiCctv;
	}
	public void setPosisiCctv(String posisiCctv) {
		this.posisiCctv = posisiCctv;
	}
	
	String analisisListrik(int steker, String posisi, String kondisi){
		if(steker >= 4 && "baik = 4".equals(kondisi) && "pojok ruang dan dekat dosen".equals(posisi)){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisisLcd(int kabel, String posisi, String kondisi){
		if(kabel >= 1 && "baik".equals(kondisi) && "dekat dosen".equals(posisi)){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisisLampu(int lampu, String posisi, String kondisi){
		if(lampu >= 18 && "baik = 18".equals(kondisi)&& "atap ruangan".equals(posisi)){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisiKipasAngin(int kipas, String posisi, String kondisi){
		if(kipas >= 2 && "baik = 2".equals(kondisi)&& "atap ruangan".equals(posisi)){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisiAc(int ac, String kondisi, String posisi){
		if(ac >= 1 && "baik".equals(kondisi)&& "dibelakang/disamping".equals(posisi)){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisiInterner(int SSID, String login){
		if(SSID==1 && "bisa".equals(login)){
			return "sesuai";
		}
			else{
				return "tidak sesuai";	
			}
	}
	
	String analisiCctv(int cctv, String kondisi, String posisi){
		if(cctv >= 2 && "baik = 2".equals(kondisi) && "depan dan belakang".equals(posisi)){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	

}


