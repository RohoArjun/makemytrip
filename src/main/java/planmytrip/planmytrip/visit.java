package planmytrip.planmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visit {
    @GetMapping("/visit_location")
    public String getData() {
        return "chhoose the visit locations......";
    }
}