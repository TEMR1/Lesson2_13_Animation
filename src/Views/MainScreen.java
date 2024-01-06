package Views;

import Controllers.Controller;
import Models.BaseModel;
import Models.Model3;

import javax.swing.*;

public class MainScreen extends JFrame{
    private BaseModel model = new Model3();
    public final MainPanel mainPanel = new MainPanel();

    public MainScreen(Controller controller){
        setSize(500,500);
        setLayout(null);
        addKeyListener(controller);
        setVisible(true);

        mainPanel.setBounds(0,0, model.getWidthOfStandingNinja(), model.getHeightOfStandingNinja());
        add(mainPanel);
    }
}