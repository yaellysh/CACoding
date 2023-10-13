package use_case.clear_users;


public class ClearOutputData {
    private final String[] usernames;

    public ClearOutputData(String[] usernames) {
        this.usernames = usernames;
    }

    public String[] getUsernames() {
        return usernames;
    }
}
