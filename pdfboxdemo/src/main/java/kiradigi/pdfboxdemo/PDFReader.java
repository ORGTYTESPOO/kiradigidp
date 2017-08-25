package kiradigi.pdfboxdemo;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFReader{
    public static void main(String args[]) {
        PDFTextStripper pdfStripper = null;
        PDDocument pdDoc = null;
        try {
        	pdDoc = PDDocument.load(new File("//home//saara//Documents//my.pdf"));
        	pdfStripper = new PDFTextStripper();
            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(5);
            String parsedText = pdfStripper.getText(pdDoc);
            System.out.println(parsedText);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}


