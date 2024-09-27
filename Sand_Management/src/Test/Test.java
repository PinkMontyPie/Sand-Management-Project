/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author Bamboo
 */
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class Test {
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("C:/Users/Bamboo/Desktop/Invoice.pdf"));
            document.open();
            addMetaData(document);
            addTitlePage(document);
            addOrderDetails(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addMetaData(Document document) {
        document.addTitle("Invoice");
        document.addAuthor("Soravith");
        document.addCreator("Soravith");
    }

    private static void addTitlePage(Document document) throws DocumentException {
        Paragraph preface = new Paragraph();
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Invoice", catFont));
        addEmptyLine(preface, 1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        preface.add(new Paragraph("Invoice Date: " + dateFormat.format(new Date()),smallBold));
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("Customer Information:", subFont));
        preface.add(new Paragraph("Name: John Doe"));
        preface.add(new Paragraph("Address: 123 Main St"));
        preface.add(new Paragraph("City: Anytown"));
        preface.add(new Paragraph("Country: USA"));
        addEmptyLine(preface, 2);
        document.add(preface);
    }

    private static void addOrderDetails(Document document) throws DocumentException {
        PdfPTable table = new PdfPTable(4);
        PdfPCell cell = new PdfPCell(new Phrase("Product"));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Quantity"));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Price"));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Total"));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell);
        table.setHeaderRows(1);
        table.addCell("Product A");
        table.addCell("2");
        table.addCell("$10.00");
        table.addCell("$20.00");
        table.addCell("Product B");
        table.addCell("1");
        table.addCell("$25.00");
        table.addCell("$25.00");
        document.add(table);
        addEmptyLine(new Paragraph(), 2);
        Paragraph total = new Paragraph();
        total.add(new Chunk("Total: $45.00", smallBold));
        document.add(total);
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
}
//Sand PROJECT