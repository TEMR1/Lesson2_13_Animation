package Views;

import Controllers.Controller;
import Models.Ninja;

import javax.swing.*;

public class MainScreen extends JFrame{
    private final Controller controller;
    private final Ninja ninja = new Ninja();

    public MainScreen(Controller controller){
        this.controller =  controller;

        setSize(500,500);
        setLayout(null);
        addKeyListener(controller);
        setVisible(true);

        ninja.setBounds(0,0, ninja.getWidthOfStandingNinja(), ninja.getHeightOfStandingNinja());
        add(ninja);
        controller.standAnim();
    }
}