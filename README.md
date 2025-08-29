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
├── .mvn/                          ⚙️ Maven wrapper files for consistent build environment
├── .vscode/                       💼 VS Code workspace and settings
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── Service/       🛠️ Core business logic for PDF parsing
│   │   │       │   └── PdfParseService.java
│   │   │       ├── Form16Application.java  🚀 Main application starter
│   │   │       ├── Form16Controller.java   🧾 Handles Form 16 PDF upload & data extraction
│   │   │       ├── HomeController.java     🏠 Controls homepage routing and logic
│   │   │       └── Student.java             🎓 Sample entity class
│   │   └── resources/
│   │       └── UploadPdf.html             📄 Frontend upload page for Form 16 PDF
│   ├── test/
│   │   └── java/com/example/demo/
│   │       └── DemoApplicationTests.java  ✅ Automated tests for backend features
├── target/                         🎯 Compiled code and build artifacts
├── pom.properties                  🧩 Maven configuration and dependencies
└── LICENSE, README.md, etc.        📄 Documentation and licensing information

