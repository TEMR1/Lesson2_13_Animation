package Models;

import javax.swing.*;
import java.util.ArrayList;

public class Model3 extends BaseModel{
    public Model3(JFrame frame) {
        super(frame);
    }

    public void standAnim() {
        ArrayList<AnimPoint> points = new ArrayList<>();
        points.add(new AnimPoint(-95, -70, 141, 227));

        currentAnimation.addPoints(points);
        new Thread(currentAnimation.runnable).start();
    }
    @Override
    public void doAnim() {
        standAnim();
    }
}
