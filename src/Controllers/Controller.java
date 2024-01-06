package Controllers;

import Models.BaseModel;
import Models.Model1;
import Models.Model2;
import Models.Model3;
import Views.MainScreen;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener{
    private BaseModel model;

    public Controller(){
        new MainScreen(this);
    }
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()){
            case KeyEvent.VK_RIGHT:
                model = new Model1();
                model.doAnim();
                break;
            case KeyEvent.VK_SPACE:
                model = new Model2();
                model.doAnim();
                break;
            default:
                model = new Model3();
                model.doAnim();
                break;
        }
        model.repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        standAnim();
    }

    public void standAnim(){
        model = new Model1();
        model.doAnim();
    }
}
