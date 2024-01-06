package Controllers;

import Models.*;
import Views.MainScreen;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener{
    private BaseModel model;
    public MainScreen screen;

    public Controller(){
        screen = new MainScreen(this);
        model = new Model3();
        runAnim(model);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()){
            case KeyEvent.VK_RIGHT:
                model = new Model1();
                break;
            case KeyEvent.VK_SPACE:
                model = new Model2();
                break;
            default:
                model = new Model3();
                break;
        }
        runAnim(model);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        model = new Model3();
        runAnim(model);
    }

    private void runAnim(BaseModel model){
        var points = model.getPoints();
        screen.mainPanel.currentAnimation.addPoints(points);
        new Thread(screen.mainPanel.currentAnimation.runnable).start();
    }
}
