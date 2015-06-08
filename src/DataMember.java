import java.io.*;

import javax.swing.*;

public class DataMember {
	public static String namafile="datamember.txt";
	public static void simpanMember(String User, String Pass){
		try {
			PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter(namafile,true)));
			tulis.print("|"+User+"|"+Pass+"|");
			tulis.println("\n");
			tulis.close();
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "GAGAL MENULIS FILE");
		}
	}
	
	public static String bacaMember(){
		BufferedReader br;
		String Data="";
		try {
			br = new BufferedReader(new FileReader(namafile));
			String tambahData;
			while((tambahData = br.readLine()) !=null){
				Data=Data+tambahData+"\n";
			}			
			br.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "GAGAL MEMBACA FILE");
		}
		return Data;
	}

}
