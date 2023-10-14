package view;

import interface_adapter.clear_users.ClearController;
import interface_adapter.clear_users.ClearState;
import interface_adapter.clear_users.ClearViewModel;
import interface_adapter.login.LoginState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class ClearView extends JPanel implements ActionListener, PropertyChangeListener {

    public final String viewName = "clear";
    private final ClearViewModel clearViewModel;
    final JButton ok;
    private final ClearController clearController;
    public ClearView(ClearViewModel clearViewModel, ClearController clearController) {
        this.clearViewModel = clearViewModel;
        this.clearController = clearController;

        JLabel title = new JLabel("Clear Users");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel buttons = new JPanel();
        ok = new JButton(clearViewModel.OK_BUTTON_LABEL);
        buttons.add(ok);

        ok.addActionListener(this);
        this.add(buttons);
    }
    @Override
    public void actionPerformed(ActionEvent evt) {
        ArrayList<String> users = null;
        try {
            users = clearController.execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringBuilder toPrint = new StringBuilder(new String());
        for (String name:users) {
            toPrint.append(name + "\n");
        }
        System.out.println(toPrint);
        JOptionPane.showMessageDialog(this, toPrint);
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        ClearState clearState = (ClearState) evt.getNewValue();
    }

}
