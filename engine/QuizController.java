package engine;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {

    @GetMapping("/api/quiz")
    public ResponseEntity<Object> getQuiz() {
        return ResponseEntity.ok().body(new QuizQuestion());
    }

    @PostMapping("/api/quiz")
    public ResponseEntity<Object> submitAnswer(@RequestParam int answer) {
        boolean result = answer == 2;
        return ResponseEntity.ok().body(new QuizResponse(result));
    }
}
