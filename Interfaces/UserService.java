package Interfaces;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String name, String email) {
        User newUser = new User(name, email);
        userRepository.save(newUser);
        System.out.println("name = " + name + ", email = " + email);
    }
}
