package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@CrossOrigin(origins = "*")
@RestController
public class HomeController {

    // List to store students
    static List<Student> result = new ArrayList<>();

    // Static block to add default student only once
    static {
        result.add(new Student("Jay", "darvekar", "example@gmail.com", "pune", "9881152524", "30/6/25"));
    }

    @GetMapping("/hello")
    public String home() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return result;
    }

    @PostMapping("/api/students")
    public ResponseEntity<Student> createStudentData(@RequestBody Student s1) {
        System.out.println(s1);
        result.add(s1);
        return ResponseEntity.ok()
                .header("Cache-Control", "no-store")
                .body(s1);
    }

    @DeleteMapping("/api/students/{email_id}")
    public ResponseEntity<Void> delete(@PathVariable String email_id) {
        for (Student s : result) {
            if (s.getEmail_id().equalsIgnoreCase(email_id)) {
                result.remove(s);
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/api/students/{email_id}")
    public ResponseEntity<Student> updateStudentData(@PathVariable String email_id, @RequestBody Student s1) {
        for (Student s : result) {
            if (s.getEmail_id().equalsIgnoreCase(email_id)) {
                s.setFname(s1.getFname());
                s.setLname(s1.getLname());
                s.setAddress(s1.getAddress());
                s.setMob_no(s1.getMob_no());
                s.setDate(s1.getDate());
                return ResponseEntity.ok(s);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
