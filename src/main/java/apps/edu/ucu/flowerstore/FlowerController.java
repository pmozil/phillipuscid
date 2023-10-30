package apps.edu.ucu.flowerstore;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apps.edu.ucu.flowerstore.flowers.Flower;
import apps.edu.ucu.flowerstore.flowers.FlowerService;

@RestController
@RequestMapping("/flower/")
public class FlowerController {
    private final FlowerService flowerService;
    
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }
    
    @GetMapping("/")
    public Flower hello() {
        return new Flower();
    }

    @GetMapping("/list")
    public List<Flower> list() {
        return flowerService.getFlowers();
    }
    
    @PostMapping
    public void addFlower(Flower flower) {
        flowerService.addFlower(flower);
    }
}
