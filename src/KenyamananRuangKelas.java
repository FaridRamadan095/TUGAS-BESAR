public class KenyamananRuangKelas {
	
	private String kebisingan;
	private String bau;
	private String kebocoran;
	private String kerusakan;
	private String keausan;
	
	public String getKebisingan() {
		return kebisingan;
	}
	public void setKebisingan(String kebisingan) {
		this.kebisingan = kebisingan;
	}
	public String getBau() {
		return bau;
	}
	public void setBau(String bau) {
		this.bau = bau;
	}
	public String getKebocoran() {
		return kebocoran;
	}
	public void setKebocoran(String kebocoran) {
		this.kebocoran = kebocoran;
	}
	public String getKerusakan() {
		return kerusakan;
	}
	public void setKerusakan(String kerusakan) {
		this.kerusakan = kerusakan;
	}
	public String getKeausan() {
		return keausan;
	}
	public void setKeausan(String keausan) {
		this.keausan = keausan;
	}
	
	String analisisKebisingan(String bising){
		if("tidak bising".equals(bising)){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
	String analisisBau(String bau){
		if("tidak bau".equals(bau)){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
	String analisisKebocoran(String bocor){
		if("tidak bocor".equals(bocor)){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
	String analisisKerusakan(String rusak){
		if("tidak rusak".equals(rusak)){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
	String analisisKeausan(String aus){
		if("tidak aus".equals(aus)){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
	
}
