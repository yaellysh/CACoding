package use_case.clear_users;

import entity.User;


public interface ClearUserDataAccessInterface {
    boolean existsByName(String identifier);

    void save(User user);

    User get(String username);

    String[] deleteUsers(String csvPath);
}
