
public class KenyamananRuangKelas {
	private int kebisingan;
	private int bau;
	private int kebocoran;
	private int kerusakan;
	private int keausan;
	

	public int getKebisingan() {
		return kebisingan;
	}
	public void setKebisingan(int kebisingan) {
		this.kebisingan = kebisingan;
	}
	public int getBau() {
		return bau;
	}
	public void setBau(int bau) {
		this.bau = bau;
	}
	public int getKebocoran() {
		return kebocoran;
	}
	public void setKebocoran(int kebocoran) {
		this.kebocoran = kebocoran;
	}
	public int getKerusakan() {
		return kerusakan;
	}
	public void setKerusakan(int kerusakan) {
		this.kerusakan = kerusakan;
	}
	public int getKeausan() {
		return keausan;
	}
	public void setKeausan(int keausan) {
		this.keausan = keausan;
	}
	String analisisKebisingan(int bising){
		if(bising==1){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
	String analisisBau(int bau){
		if(bau==2){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
	String analisisKebocoran(int bocor){
		if(bocor==2){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
	String analisisKerusakan(int rusak){
		if(rusak==1){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
	String analisisKeausan(int aus){
		if(aus==2){
			return "sesuai";
			}
			else{
			return "tidak sesuai";
			}
	}
}
