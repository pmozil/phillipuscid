package apps.edu.ucu.flowerstore.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<AppUser> getUsers() {
        return userRepository.findAll();
    }
    public void addUser(AppUser user) {
        userRepository.save(user);
    }
}