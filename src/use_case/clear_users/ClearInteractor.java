package use_case.clear_users;


import entity.UserFactory;

import java.io.IOException;
import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface clearDataAccessObject;
    final ClearOutputBoundary clearPresenter;
    final UserFactory userFactory;
    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessObject, ClearOutputBoundary clearPresenter, UserFactory userFactory) {
        this.clearDataAccessObject = clearDataAccessObject;
        this.clearPresenter = clearPresenter;
        this.userFactory = userFactory;
    }

    public ArrayList<String> execute() throws IOException {
        ArrayList<String> users = clearDataAccessObject.deleteUsers();
        return users;
    }

}
