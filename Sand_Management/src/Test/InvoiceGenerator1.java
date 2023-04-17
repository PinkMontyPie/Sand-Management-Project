package Test;

/**
 *
 * @author Bamboo
 */
import sand_management.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InvoiceGenerator1 {

    private static Font bFont = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
    private static Font nFont = new Font(Font.FontFamily.HELVETICA, 15, Font.BOLD);
    private static Font sFont = new Font(Font.FontFamily.HELVETICA, 15, Font.NORMAL);

    public static void genpdf(String path, String t, String i) {
        Connection c = null;
        Statement stmt = null;
        ResultSet rs = null;
        System.out.println(path);
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:database.db");
            stmt = c.createStatement();
            String string = "SELECT * FROM " + t + " WHERE ID = '" + i + "'";
            System.out.println(string);
            rs = stmt.executeQuery(string);

            if (path != null) {
                // Create a new Document object
                Document document = new Document(PageSize.A4, 50, 50, 50, 50);

                // Create a new PdfWriter object to write the document to a file
                PdfWriter.getInstance(document, new FileOutputStream(path + ".pdf"));

                // Open the document
                document.open();

                // Add some content to the document
                Paragraph preface = new Paragraph();
                preface.add(new Paragraph("Tax Invoice", bFont));
                preface.add(new Paragraph("Invoice No :", sFont));
                addEmptyLine(preface, 1);
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                preface.add(new Paragraph("Invoice Date: " + dateFormat.format(new Date())));
                addEmptyLine(preface, 1);
                preface.add(new Paragraph("Customer Information:", nFont));
                String name = "Name : " + rs.getString("CONTACT_NAME") + "";
                preface.add(new Paragraph(name));
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
