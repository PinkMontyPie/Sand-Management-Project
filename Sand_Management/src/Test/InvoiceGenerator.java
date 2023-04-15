/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Bamboo
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;

public class InvoiceGenerator {
    
    
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int response = fileChooser.showSaveDialog(null);
        File files = null;
        if (response == JFileChooser.APPROVE_OPTION) {
            files = new File(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println(files);
        }
        try {
            if (files != null) {
                // Create a new Document object
                Document document = new Document(PageSize.A4, 50, 50, 50, 50);

                // Create a new PdfWriter object to write the document to a file
                PdfWriter.getInstance(document, new FileOutputStream(files+".pdf"));

                // Open the document
                document.open();

                // Add some content to the document
                Paragraph preface = new Paragraph();
                Paragraph name = new Paragraph("Name: John Doe");
                name.setAlignment(Element.ALIGN_RIGHT);
                preface.add(name);
                document.add(new Paragraph("Invoice"));
                document.add(new Paragraph(new Date().toString()));
                addEmptyLine(preface, 1);
                preface.add(new Paragraph("Invoice"));
                addEmptyLine(preface, 1);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                preface.add(new Paragraph("Invoice Date: " + dateFormat.format(new Date())));
                addEmptyLine(preface, 1);
                preface.add(new Paragraph("Customer Information:"));
                preface.add(new Paragraph("Name: John Doe"));
                preface.add(new Paragraph("Address: 123 Main St"));
                preface.add(new Paragraph("City: Anytown"));
                preface.add(new Paragraph("Country: USA"));
                addEmptyLine(preface, 2);
                document.add(preface);
                

                // Close the document
                document.close();

                System.out.println("Invoice created successfully.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
    
}
