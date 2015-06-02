import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.TableCellRenderer;


public class AnalisisBersih extends JFrame {


	private JTable tabel;
	private KebersihanRuangKelas bersih;
	private JButton tombolKembali;
	
	private JPanel panel;
	private JTextPane Sesuai;
	private JTextPane tdkSesuai;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnalisisBersih window = new AnalisisBersih();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AnalisisBersih() {
		try {
			initialize();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "GAGAL : "+e, "Erorr", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		bersih = BacaTulisFile.bacaBersih();
		String[] kolom = {"Analisis","Hasil"};
		String[][] data = {
				{"Kebersihan",bersih.analisisKebersihan(bersih.getKondisiLantai(), bersih.getKondisiDinding(), bersih.getKondisiAtap(), bersih.getKondisiPintu(), bersih.getKondisiJendela())},
				{"Sirkulasi Udara",bersih.analisisSirkulasiUdara(bersih.getSirkulasiUdara())},
				{"Pencahayaan",bersih.analisisPencahayaan(bersih.getNilaiPencahayaan())},
				{"Kelembapan",bersih.analisisKelembapan(bersih.getInputKelembapan())},
				{"Suhu",bersih.analisisSuhu(bersih.getInputSuhu())},
				{"Kebisingan",bersih.analisisKebisingan(bersih.getKebisingan())},
				{"Bau",bersih.analisisBau(bersih.getBau())},
				{"Kebocoran",bersih.analisisKebocoran(bersih.getKebocoran())},
				{"Kerusakan",bersih.analisisKerusakan(bersih.getKerusakan())},
				{"Keausan",bersih.analisisKeausan(bersih.getKeausan())},
		};
		
		
		setSize(500,270);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		
		tabel = new JTable(data, kolom){
			public boolean isCellEditable (int dat, int kol){
				return false;
				
				}
			
			public Component prepareRenderer(TableCellRenderer r, int dat, int kol){
				Component c = super.prepareRenderer(r, dat, kol);
				
				if(dat % 2 == 0)
					c.setBackground(new Color(204, 0, 0));
				else 
					c.setBackground(new Color(0, 0, 153));
				return c;
				
			}
		};
		
		
		tabel.setFillsViewportHeight(true);
		tabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		tabel.setForeground(Color.WHITE);
		JScrollPane jps = new JScrollPane(tabel);
		
		add(jps,BorderLayout.CENTER);
		
		tombolKembali = new JButton("Exit");
		tombolKembali.setBackground(new Color(255, 204, 51));
		tombolKembali.setForeground(Color.BLACK);
		add(tombolKembali,BorderLayout.SOUTH);
		tombolKembali.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				JOptionPane.showMessageDialog(null, ""+bersih.deskripsiKelas(),"Deskripsi Kelas",JOptionPane.PLAIN_MESSAGE);
				
			}
		});
	
		
		panel = new JPanel();
		add(panel,BorderLayout.NORTH);
		
		panel.setLayout(new GridLayout(1, 2));
		Sesuai=new JTextPane();
		Sesuai.setEditable(false);
		Sesuai.setBackground(new Color(255, 204, 51));
		Sesuai.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Sesuai.setText("Sesuai : "+bersih.hitungSesuai());
		panel.add(Sesuai);
		
		tdkSesuai = new JTextPane();
		tdkSesuai.setEditable(false);
		tdkSesuai.setBackground(new Color(255, 204, 51));
		tdkSesuai.setFont(new Font("Times New Roman", Font.BOLD, 12));
		tdkSesuai.setText("Tidak Sesuai : "+bersih.hitungTdkSesuai());
		panel.add(tdkSesuai);
		
		
	}	

}
