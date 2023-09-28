package Shapes;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Naruto implements Movable {
    public final static int REFERENCE_WIDTH = 312;
    public final static int REFERENCE_HEIGHT = 260;
    private final static String projectDir = System.getProperty("user.dir");
    private final static Image NARUTO_LEFT;
    private final static Image NARUTO_RIGHT;

    static {
        try {
            NARUTO_LEFT = ImageIO.read(
                    new File(projectDir + "/resources/images/naruto/naruto_left.png")
            );
            NARUTO_RIGHT = ImageIO.read(
                    new File(projectDir + "/resources/images/naruto/naruto_right.png")
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Image image;
    private int x;
    private int y;
    private int width;
    private int height;

    public Naruto(final int x, final int y, final int width, final int height) {
        this.image = NARUTO_LEFT;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;

        g2d.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }

    @Override
    public void move(int px) {
        this.x = this.x - px;
        image = image == NARUTO_LEFT ? NARUTO_RIGHT : NARUTO_LEFT;
    }
}
