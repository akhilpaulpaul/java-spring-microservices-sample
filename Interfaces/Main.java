package Interfaces;

public class Main {
    static void main() {
        UserRepository save = new Save();
        UserService service = new UserService(save);
        service.registerUser("Ben", "ben@gmail.com");
    }
}
