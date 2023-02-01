package Modelo;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileNotFoundException;
//import java.awt.Color;
import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class CrearPdf {

    public void hacerPdf() {
//        File file = new File("Sistema_Envios.pdf");
//        try (PdfWriter pdfWriter = new PdfWriter(file); PdfDocument pdfDocument = new PdfDocument(pdfWriter); Document document = new Document(pdfDocument)) {
//
//            Image gasolinera = new Image(ImageDataFactory.create("C:\\Users\\User\\Downloads\\Gasolinera.jpeg"));
//            Paragraph p = new Paragraph();
//
//            p.add("Factura").add(gasolinera);
//
//            //p.add("Prueba de pdf solo con texto");
//            document.add(p);
//            document.close();
//            pdfDocument.close();
//
//            System.out.println("Pdf creado");
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

        File file = new File("Sistema_Envios.pdf");
        try (PdfWriter pdfWriter = new PdfWriter(file); PdfDocument pdfDocument = new PdfDocument(pdfWriter); Document document = new Document(pdfDocument)) {

            //Image gasolinera = new Image(ImageDataFactory.create("C:\\Users\\User\\Downloads\\Gasolinera.jpeg"));
            Paragraph p = new Paragraph();

            p.add("Factura");

            //p.add("Prueba de pdf solo con texto");
            document.add(p);
            document.close();
            pdfDocument.close();

            System.out.println("Pdf creado");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
