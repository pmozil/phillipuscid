package apps.edu.ucu.flowerstore.flowers;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }
    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}