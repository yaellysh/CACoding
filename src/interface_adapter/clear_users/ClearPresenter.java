package interface_adapter.clear_users;


import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {

    private final ViewManagerModel viewManagerModel;
    private final ClearViewModel clearViewModel;

    public ClearPresenter(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData user) {

    }
}
