public class KebersihanRuangKelas extends LingkunganRuangKelas {
	
	private String sirkulasiUdara;
	private int nilaiPencahayaan;
	private int inputKelembapan;
	private int inputSuhu;
	
	public KebersihanRuangKelas(String namaRuang, String lokasiRuang,
			String Fakultas, String kondisiLantai, String kondisiDinding,
			String kondisiAtap, String kondisiPintu, String kondisiJendela) {
		super(namaRuang, lokasiRuang, Fakultas, kondisiLantai, kondisiDinding,
				kondisiAtap, kondisiPintu, kondisiJendela);
		// TODO Auto-generated constructor stub
	}
	
	public KebersihanRuangKelas(String namaRuang, String lokasiRuang,
			String Fakultas) {
		super(namaRuang, lokasiRuang, Fakultas);
		// TODO Auto-generated constructor stub
	}
	
	
	public KebersihanRuangKelas(String namaRuang, String lokasiRuang,
			String Fakultas, String sirkulasiUdara, int nilaiPencahayaan,
			int inputKelembapan, int inputSuhu) {
		super(namaRuang, lokasiRuang, Fakultas);
		this.sirkulasiUdara = sirkulasiUdara;
		this.nilaiPencahayaan = nilaiPencahayaan;
		this.inputKelembapan = inputKelembapan;
		this.inputSuhu = inputSuhu;
	}

	public String getSirkulasiUdara() {
		return sirkulasiUdara;
	}
	public void setSirkulasiUdara(String sirkulasiUdara) {
		this.sirkulasiUdara = sirkulasiUdara;
	}
	public int getNilaiPencahayaan() {
		return nilaiPencahayaan;
	}
	public void setNilaiPencahayaan(int nilaiPencahayaan) {
		this.nilaiPencahayaan = nilaiPencahayaan;
	}
	public int getInputKelembapan() {
		return inputKelembapan;
	}
	public void setInputKelembapan(int inputKelembapan) {
		this.inputKelembapan = inputKelembapan;
	}
	public int getInputSuhu() {
		return inputSuhu;
	}
	public void setInputSuhu(int inputSuhu) {
		this.inputSuhu = inputSuhu;
	}
	
	String analisisSirkulasiUdara(String sirkulasi){
		if("lancar".equals(sirkulasi)){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
	
	String analisisPencahayaan(int cahaya){
		if(cahaya <= 250 && cahaya >= 350){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisisKelembapan(int lembab){
		if(lembab <= 70 && lembab >= 80){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisisSuhu(int lembab){
		if(lembab <= 25 && lembab >= 35){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	
	
}