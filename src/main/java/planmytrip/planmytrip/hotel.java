package planmytrip.planmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class hotel {
    @GetMapping("/hotel_book")
    public String getData() {
        return "please book my hotel......";
    }
}