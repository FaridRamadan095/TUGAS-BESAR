
public class KeamananRuangKelas extends IdentitasRuangKelas {

	private String kekokohan;
	private String kunciPintu;
	private String kunciJendela;
	private String bahaya;
	
	public KeamananRuangKelas(String namaRuang, String lokasiRuang,
			String Fakultas) {
		super(namaRuang, lokasiRuang, Fakultas);
		
	}
	



	public String getKekokohan() {
		return kekokohan;
	}
	public void setKekokohan(String kekokohan) {
		this.kekokohan = kekokohan;
	}
	public String getKunciPintu() {
		return kunciPintu;
	}
	public void setKunciPintu(String kunciPintu) {
		this.kunciPintu = kunciPintu;
	}
	public String getKunciJendela() {
		return kunciJendela;
	}
	public void setKunciJendela(String kunciJendela) {
		this.kunciJendela = kunciJendela;
	}
	public String getBahaya() {
		return bahaya;
	}
	public void setBahaya(String bahaya) {
		this.bahaya = bahaya;
	}
	
	
	String analisisKekokohan(String kokoh){
		if("ada".equals(kokoh)){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	String analisisKunciPintuJendela(String kunciPintu, String kunciJendela){
		if("ada".equals(kunciPintu)&&"ada".equals(kunciJendela)){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	
	String keamananRuang(String aman){
		if("aman".equals(aman)){
			return "sesuai";
		}
		else{
			return "tidak sesuai";
		}
	}
	
	
}
