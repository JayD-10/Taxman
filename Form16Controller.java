package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

import com.example.demo.Service.PdfParseService;

@CrossOrigin(origins = "*")

@RestController
public class Form16Controller {

    private final PdfParseService pdfParseService;

    public Form16Controller(PdfParseService pdfParseService) {
        this.pdfParseService = pdfParseService;
    }

    @GetMapping("/parsepdf")
    public String parsePdf() {
        // return pdfParseService
        // .extractTextFromPdf("C:\\Jay Semester 5\\PSL Mentorship Program\\Sample Form
        // 16\\Sample1.pdf");
        return " ";
    }

    @PostMapping("/parsepdf")

    public String postMethodName(@RequestParam("pathToPdf") MultipartFile pathToPdf) {

        try {

            // ✅ Pass the actual file content, not just the name

            return pdfParseService.extractTextFromPdf(pathToPdf.getInputStream());

        } catch (IOException e) {

            e.printStackTrace();

            return "Failed to process PDF: " + e.getMessage();

        }

    }

}
// H2 Console - http://localhost:8080/h2-console
