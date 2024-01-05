package Models;

import java.util.ArrayList;

public class Model2 extends BaseModel{
    public void jumpAnim() {
        ArrayList<AnimPoint> points = new ArrayList<>();
        points.add(new AnimPoint(-89, -560, 147, 333));
        points.add(new AnimPoint(-243, -560, 181, 333));
        points.add(new AnimPoint(-435, -560, 185, 333));
        points.add(new AnimPoint(-631, -560, 217, 333));
        points.add(new AnimPoint(-845, -560, 165, 333));
        points.add(new AnimPoint(-1010, -560, 211, 333));
        points.add(new AnimPoint(-1215, -560, 173, 333));
        points.add(new AnimPoint(-1387, -560, 171, 333));
        points.add(new AnimPoint(-1555, -560, 163, 333));

        currentAnimation.addPoints(points);
        currentAnimation.runAnim();
    }
    @Override
    public void doAnim() {
        jumpAnim();
    }
}
