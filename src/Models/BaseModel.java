package Models;

import java.util.ArrayList;

public abstract class BaseModel{

    public int getWidthOfStandingNinja() {
        return 141;
    }

    public int getHeightOfStandingNinja() {
        return 227;
    }

    public abstract ArrayList<AnimPoint> getPoints();
}
