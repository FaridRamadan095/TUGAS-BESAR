import java.io.*;

import javax.swing.JOptionPane;


public class BacaTulisFile {
	
	
	
	public static void simpanKondisi(JumlahKondisidanPosisiSarana dat){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datakondisi.dat"));
			oos.writeObject(dat);
			oos.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
	}
	
	public static JumlahKondisidanPosisiSarana bacaKondisi(){
		JumlahKondisidanPosisiSarana dat=null;
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datakondisi.dat"));
			dat = (JumlahKondisidanPosisiSarana)ois.readObject();
			ois.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		return dat;
	}	
	
	public static void simpanBersih(KebersihanRuangKelas dat){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("databersih.dat"));
			oos.writeObject(dat);
			oos.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
	}
	
	public static KebersihanRuangKelas bacaBersih(){
		KebersihanRuangKelas dat=null;
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("databersih.dat"));
			dat = (KebersihanRuangKelas)ois.readObject();
			ois.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		return dat;
	}	
	
	public static void simpanKeamanan(KeamananRuangKelas dat){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datakeamanan.dat"));
			oos.writeObject(dat);
			oos.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
	}
	
	public static KeamananRuangKelas bacaKeamanan(){
		KeamananRuangKelas dat=null;
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datakeamanan.dat"));
			dat = (KeamananRuangKelas)ois.readObject();
			ois.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		return dat;
	}	
}
