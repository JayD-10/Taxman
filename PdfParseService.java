package com.example.demo.Service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.example.demo.jpa.*;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PdfParseService {

    @Autowired
    CustomerRepository customerRepository;

    public String extractTextFromPdf(InputStream pdfInputStream) throws IOException {
        // File file = new File(pathToPdf);
        String data = null;
        try (PDDocument document = PDDocument.load(pdfInputStream)) {
            PDFTextStripper stripper = new PDFTextStripper();
            data = stripper.getText(document);
            System.out.println("pdf data uploaded" + data);
            Customer customer = new Customer();
            customer.setForm16Data(data);
            customer = customerRepository.save(customer);
            System.out.println(customer.toString());
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        PdfParseService pdfParseService = new PdfParseService();
        // pdfParseService.extractTextFromPdf("C:\\Jay Semester 5\\PSL Mentorship
        // Program\\Sample Form 16\\Sample1.pdf");
    }
}
