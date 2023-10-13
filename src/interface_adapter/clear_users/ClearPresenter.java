package interface_adapter.clear_users;


import use_case.clear_users.ClearInputBoundary;

public class ClearPresenter {

    final ClearInputBoundary clearUseCaseInteractor;

    public ClearPresenter(ClearInputBoundary clearUseCaseInteractor) {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute() {
        clearUseCaseInteractor.execute();
    }
}
