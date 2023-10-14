package use_case.clear_users;

import entity.User;

import java.io.IOException;
import java.util.ArrayList;


public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);

    ArrayList<String> deleteUsers() throws IOException;

    void save(User user);

    User get(String username);

}
