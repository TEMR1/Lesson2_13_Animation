package Models;

import Controllers.Controller;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public abstract class BaseModel extends JPanel{
    protected BaseAnimation currentAnimation = new BaseAnimation();
    private AnimPoint currentPoint;
    @Override
    public void paintComponent(Graphics g) {
        BufferedImage image;
        try {
            image = ImageIO.read(new File("src/res/black-ninja-game-sprites_7814-467.png"));
            setSize(currentPoint.width(), currentPoint.height());
            int x = currentPoint.x();
            int y = currentPoint.y();
            System.out.println(x + " " + y);
            g.drawImage(image, x, y, null);
        } catch (IOException e) {
            System.out.println("Image not found!");
        }
    }

    public void repaintNinja(AnimPoint point){
        currentPoint = point;
        getParent().repaint();
    }

    class BaseAnimation{
        private final ArrayList<ArrayList<AnimPoint>> pointsArray = new ArrayList<>();

        public void addPoints(ArrayList<AnimPoint> points) {
            pointsArray.add(points);
        }

        Runnable runnable = () -> {
            if (pointsArray.isEmpty()) {
                return;
            }

            ArrayList<AnimPoint> points = pointsArray.getFirst();
            for (AnimPoint point : points) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(point.x() + " " + point.y());
                repaintNinja(point);
            }
            System.out.println("Кінець функції");
            pointsArray.removeFirst();

        };
    }

    public abstract void doAnim();
}
