package com.example.emailprefs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PreferencesController {

    // Allow requests from any origin while testing
    @CrossOrigin(origins = "*")
    @PostMapping("/preferences")
    public ResponseEntity<Map<String, Object>> savePreferences(@RequestParam Map<String, String> allParams) {
        Map<String, Object> resp = new HashMap<>();
        resp.put("status", "ok");
        resp.put("received", allParams);
        return ResponseEntity.ok(resp);
    }
}
