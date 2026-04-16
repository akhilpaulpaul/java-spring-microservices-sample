package Interfaces;

public class Save implements UserRepository {

    @Override
    public void save(User user) {
        System.out.println("Actual save happens here");
    }
}
