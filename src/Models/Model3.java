package Models;

import java.util.ArrayList;

public class Model3 extends BaseModel{
    public void standAnim() {
        ArrayList<AnimPoint> points = new ArrayList<>();
        points.add(new AnimPoint(-95, -70, 141, 227));

        currentAnimation.addPoints(points);
        currentAnimation.runAnim();
    }
    @Override
    public void doAnim() {
        standAnim();
    }
}
