package apps.edu.ucu.flowerstore.flowers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    
}
