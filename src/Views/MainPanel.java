package Views;

import Models.AnimPoint;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MainPanel extends JPanel {
    private AnimPoint currentPoint;
    public final BaseAnimation currentAnimation = new BaseAnimation();

    @Override
    public void paintComponent(Graphics g) {
        BufferedImage image;
        try {
            image = ImageIO.read(new File("src/res/black-ninja-game-sprites_7814-467.png"));

            setSize(currentPoint.getWidth(), currentPoint.getHeight());
            g.drawImage(image, currentPoint.getX(), currentPoint.getY(), null);
        } catch (IOException e) {
            System.out.println("Image not found!");
        }
    }

    public void repaintNinja(AnimPoint point) {
        currentPoint = point;
        repaint();
    }

    public class BaseAnimation {
        private final ArrayList<ArrayList<AnimPoint>> pointsArray = new ArrayList<>();

        public void addPoints(ArrayList<AnimPoint> points) {
            pointsArray.add(points);
        }

        public Runnable runnable = new Runnable() {
            @Override
            synchronized public void run() {
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

                    repaintNinja(point);
                }
                pointsArray.removeFirst();
            }
        };
    }
}
