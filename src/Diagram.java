import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class Diagram extends JFrame {


	public Diagram (int sesuai, int tidaksesuai) {
	     DefaultPieDataset dpd = new DefaultPieDataset();
	     dpd.setValue("sesuai", sesuai);
	     dpd.setValue("tidak sesuai", tidaksesuai);
	     JFreeChart freeChart = ChartFactory.createPieChart("Hasil Menganalisis",dpd,true,true, false); //String title,PieDatasheet datasheet,boolean legends,boolean tooltips,boolean url 
	     ChartFrame cf = new ChartFrame("Data Analisis ",freeChart);
	     cf.setSize(600,600);
	     cf.setVisible(true);
	     cf.setLocationRelativeTo(null);
	     cf.setBackground(Color.BLUE);
	     cf.setForeground(Color.BLUE);
	
	}

}
