package planmytrip.planmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class shop {
    @GetMapping("/hotel_shop")
    public String getData() {
        return "please book my hotel...... you are in the hotel page";

    }
}
