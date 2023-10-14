package data_access;

import entity.User;
import use_case.clear_users.ClearUserDataAccessInterface;
import use_case.signup.SignupUserDataAccessInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryUserDataAccessObject implements SignupUserDataAccessInterface, ClearUserDataAccessInterface {

    private final Map<String, User> users = new HashMap<>();

    /**
     * @param identifier the user's username
     * @return whether the user exists
     */
    @Override
    public boolean existsByName(String identifier) {
        return users.containsKey(identifier);
    }
    @Override
    public final ArrayList<String> deleteUsers(){
        ArrayList<String> users = new ArrayList<>();
        for (User user:this.users.values()) {
            users.add(user.getName());
        }
        this.users.clear();
        return users;
    }

    /**
     * @param user the data to save
     */
    @Override
    public void save(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public User get(String username) {
        return null;
    }

    public void clearUsers() {users.clear();}
}
