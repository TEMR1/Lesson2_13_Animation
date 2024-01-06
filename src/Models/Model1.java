package Models;

import javax.swing.*;
import java.util.ArrayList;

public class Model1 extends BaseModel{

    public Model1(JFrame frame) {
        super(frame);
    }

    public void runAnim() {
        ArrayList<AnimPoint> points = new ArrayList<>();
        points.add(new AnimPoint(-99, -340, 200, 203));
        points.add(new AnimPoint(-311, -340, 200, 203));
        points.add(new AnimPoint(-527, -340, 200, 203));
        points.add(new AnimPoint(-745, -340, 200, 203));
        points.add(new AnimPoint(-957, -340, 200, 203));
        points.add(new AnimPoint(-1173, -340, 200, 203));

        currentAnimation.addPoints(points);
        new Thread(currentAnimation.runnable).start();
    }
    @Override
    public void doAnim() {
        runAnim();
    }
}
