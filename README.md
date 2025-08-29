# 🧾 Taxman

> **Effortless Form 16 PDF Processing** – Upload, Extract, View.

---

## 📌 About

**Taxman** is a web application that simplifies the extraction of data from **Form 16 PDF files**.  
With a clean HTML/CSS/JavaScript **frontend** and a powerful **Java Spring Boot** **backend**, it allows users to:

- Upload Form 16 PDFs **up to 10 MB**.
- Automatically extract all data from the file.
- Instantly view the extracted information in **raw format** on the browser.

---

## 🚀 Features

- **Easy Upload** – Simple interface to choose and send PDF files.
- **Fast Processing** – Powered by Spring Boot backend.
- **Accurate Extraction** – Parses Form 16 data efficiently.
- **Responsive Frontend** – Works across devices.
- **Secure File Handling** – Supports up to 10 MB.

---

## 🛠 Tech Stack

**Frontend**  
- HTML5  
- CSS3  
- JavaScript  

**Backend**  
- Java 17+  
- Spring Boot  
- Maven  

---

## 📂 Project Structure
Taxman - Processing of Form 16 PDF/
├── .mvn/                   # Maven wrapper files
├── .vscode/                # VS Code workspace and settings
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── Service/
│   │   │   │   └── PdfParseService.java   # Core service to parse Form 16 PDF
│   │   │   ├── Form16Application.java     # Main Spring Boot application class
│   │   │   ├── Form16Controller.java      # Handles Form 16 related API requests
│   │   │   ├── HomeController.java        # Handles basic navigation endpoints
│   │   │   └── Student.java               # Entity class for student data
│   │   └── resources/
│   │       └── UploadPdf.html             # Frontend template for PDF upload
│   └── test/java/com/example/demo/
│       └── DemoApplicationTests.java      # Unit tests
├── target/                 # Build output (generated after compilation)
├── pom.properties          # Maven configuration
├── LICENSE                 # Project license
└── README.md               # Project documentation
