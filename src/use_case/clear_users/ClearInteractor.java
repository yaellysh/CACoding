package use_case.clear_users;



public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface clearDataAccessObject;
    final ClearOutputBoundary clearPresenter;
    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessObject, ClearOutputBoundary clearPresenter) {
        this.clearDataAccessObject = clearDataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    public String[] execute(){
       String[] users = clearDataAccessObject.deleteUsers("./users.csv");
       return users;
    }

}
