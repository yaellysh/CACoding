package interface_adapter.clear_users;

import interface_adapter.ViewModel;
import interface_adapter.login.LoginState;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {

    public final String TITLE_LABEL = "Clear Users";
    public static final String OK_BUTTON_LABEL = "Ok";
    private ClearState state = new ClearState();

    public ClearViewModel() {
        super("Clear Users");
    }

    public void setState(ClearState state) {
        this.state = state;
    }
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    @Override
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }


    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    public ClearState getState() {
        return state;
    }
}
