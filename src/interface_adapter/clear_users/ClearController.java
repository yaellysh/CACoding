package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

import java.io.IOException;
import java.util.ArrayList;

public class ClearController {

    final ClearInputBoundary clearUseCaseInteractor;

    public ClearController(ClearInputBoundary clearUseCaseInteractor) {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public ArrayList<String> execute() throws IOException {
        return clearUseCaseInteractor.execute();
    }
}
