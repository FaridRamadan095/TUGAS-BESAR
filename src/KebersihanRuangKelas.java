public class KebersihanRuangKelas {
	
	private String sirkulasiUdara;
	private int nilaiPencahayaan;
	private int inputKelembapan;
	private int inputSuhu;
	
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