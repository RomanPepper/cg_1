import javax.swing.*;
import java.awt.*;

public class WindowApplication extends JFrame {
    private final DrawPanel panel;

    public WindowApplication() throws HeadlessException {
        this.setSize(1600, 1024);

        panel = new DrawPanel(this.getWidth(), this.getHeight(), 500, 150);
        this.add(panel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
