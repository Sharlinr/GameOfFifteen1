package OOPSprint3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonLogic extends JButton implements ActionListener {

    final int finalPlacement;
    int myDestination;
    ArrayList<ButtonLogic> Button; // samma arraylist från Panel class
    Panel panel;

    public ButtonLogic(String name, int finalPlacement, int myDestination, ArrayList<ButtonLogic> Buttons, Panel panel) {
        setText(name);
        this.finalPlacement = finalPlacement;
        this.myDestination = myDestination;
        this.Button = Buttons;
        this.panel = panel;
        addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
