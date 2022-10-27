package backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubController {
    @GetMapping("/api/sub")
    public ResponseEntity<?> mainPage(){
        return new ResponseEntity("SUB", HttpStatus.OK);
    }
}
