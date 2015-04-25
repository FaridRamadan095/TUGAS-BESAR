public class LingkunganRuangKelas {

	private String kondisiLantai;
	private String kondisiDinding;
	private String kondisiAtap;
	private String kondisiPintu;
	private String kondisiJendela;
	
	public String getKondisiLantai() {
		return kondisiLantai;
	}
	public void setKondisiLantai(String kondisiLantai) {
		this.kondisiLantai = kondisiLantai;
	}
	public String getKondisiDinding() {
		return kondisiDinding;
	}
	public void setKondisiDinding(String kondisiDinding) {
		this.kondisiDinding = kondisiDinding;
	}
	public String getKondisiAtap() {
		return kondisiAtap;
	}
	public void setKondisiAtap(String kondisiAtap) {
		this.kondisiAtap = kondisiAtap;
	}
	public String getKondisiPintu() {
		return kondisiPintu;
	}
	public void setKondisiPintu(String kondisiPintu) {
		this.kondisiPintu = kondisiPintu;
	}
	public String getKondisiJendela() {
		return kondisiJendela;
	}
	public void setKondisiJendela(String kondisiJendela) {
		this.kondisiJendela = kondisiJendela;
	}
	
	String analisisKebersihan(String lantai, String dinding, String atap, String pintu, String jendela){
		if("bersih".equals(lantai) && "bersih".equals(dinding) && "bersih".equals(jendela) && "bersih".equals(atap) && "bersih".equals(pintu)){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}

}
