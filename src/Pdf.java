import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class Pdf {

	public Pdf(String Kata, String NamaFile){
		Document doc = new Document();
		try {
			PdfWriter pdfkon = PdfWriter.getInstance(doc, new FileOutputStream(NamaFile));
			doc.open();
			doc.add(new Paragraph(Kata));
			doc.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	

	}
}
