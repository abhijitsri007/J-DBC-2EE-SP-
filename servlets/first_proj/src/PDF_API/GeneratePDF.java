package PDF_API;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import org.w3c.dom.Document;

import PDF_API.*;
 


public class GeneratePDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            OutputStream file = new FileOutputStream(new File("D:\\Test.pdf"));
	 
	            Document document = new Document();
	            PdfWriter.getInstance(document, file);
	 
	            document.open();
	            document.add(new Paragraph("Hello World, iText"));
	            document.add(new Paragraph(new Date().toString()));
	 
	            document.close();
	            file.close();
	 
	        } catch (Exception e) {
	 
	            e.printStackTrace();
	        }
	}

}
