import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "CV.pdf";

        try {

            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();

            doc.addPage(page);

            PDPageContentStream content = new PDPageContentStream(doc, page);

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 26);
            content.moveTextPositionByAmount(80, 700);
            content.drawString("Registration Form");
            content.endText();


            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 16);
            content.moveTextPositionByAmount(80, 700);
            content.drawString("Name : ");
            content.endText();


            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 16);
            content.moveTextPositionByAmount(80,650);
            content.drawString("Father Name : ");
            content.endText();

            content.beginText();
            content.moveTextPositionByAmount(80,600);
            content.drawString("DOB : ");
            content.endText();

            content.close();
            doc.save(fileName);
            doc.close();

            System.out.println("Наш файл " + System.getProperty("user.dir"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
