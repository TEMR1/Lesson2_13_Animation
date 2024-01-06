package Models;

import java.util.ArrayList;

public class Model3 extends BaseModel{

    @Override
    public ArrayList<AnimPoint> getPoints() {
        ArrayList<AnimPoint> points = new ArrayList<>();
        points.add(new AnimPoint(-95, -70, 141, 227));

        return points;
    }
}
