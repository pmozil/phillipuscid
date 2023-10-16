package apps.edu.ucu.flowerstore;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apps.edu.ucu.flowerstore.flowers.Flower;

@RestController
@RequestMapping("/flower/")
public class FlowerController {
    
    @GetMapping("/")
    public Flower hello() {
        return new Flower();
    }

    @GetMapping("/list")
    public List<Flower> list() {
        Flower f1 = new Flower();
        return List.of(f1,f1,f1,f1);
    }
}
