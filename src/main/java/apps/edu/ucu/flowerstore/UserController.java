package apps.edu.ucu.flowerstore;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apps.edu.ucu.flowerstore.user.AppUser;
import apps.edu.ucu.flowerstore.user.UserService;

@RestController
@RequestMapping("/user/")
public class UserController {
    private final UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/list")
    public List<AppUser> list() {
        return userService.getUsers();
    }
    
    @PostMapping
    public void addUser(AppUser user) {
        userService.addUser(user);
    }
}
