import Shapes.Cat;
import Shapes.Naruto;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class DrawPanel extends JPanel implements ActionListener {
    private final static String projectDir = System.getProperty("user.dir");
    private final static Image BACKGROUND_IMG;

    static {
        try {
            BACKGROUND_IMG = ImageIO.read(
                    new File(projectDir + "\\resources\\images\\background.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int CHARACTER_INDENT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;

    private Cat cat;
    private Naruto naruto;

    public DrawPanel(final int width, final int height, final int characterIndent, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.CHARACTER_INDENT = characterIndent;
        this.TIMER_DELAY = timerDelay;

        timer = new Timer(timerDelay, this);
        timer.start();


        //Вопросы:
        //1. Почему с высотой небольшие проблемы, нужно ещё 40 вычитать

        //Вариант #1
        this.cat = new Cat(PANEL_WIDTH - Cat.REFERENCE_WIDTH, PANEL_HEIGHT - (Cat.REFERENCE_HEIGHT) - 40,
                Cat.REFERENCE_WIDTH, Cat.REFERENCE_HEIGHT);
        this.naruto = new Naruto(PANEL_WIDTH - Naruto.REFERENCE_WIDTH + cat.getWidth() + CHARACTER_INDENT,
                PANEL_HEIGHT - Naruto.REFERENCE_HEIGHT - 40,
                Naruto.REFERENCE_WIDTH, Naruto.REFERENCE_HEIGHT);

        //Вариант#2
//        this.cat = new Cat(PANEL_WIDTH - Cat.REFERENCE_WIDTH / 4, PANEL_HEIGHT - (Cat.REFERENCE_HEIGHT / 4) - 40,
//                Cat.REFERENCE_WIDTH / 4, Cat.REFERENCE_HEIGHT / 4);
//        this.naruto = new Naruto(PANEL_WIDTH - Naruto.REFERENCE_WIDTH + cat.getWidth() + CHARACTER_INDENT,
//                PANEL_HEIGHT - Naruto.REFERENCE_HEIGHT - 40,
//                Naruto.REFERENCE_WIDTH, Naruto.REFERENCE_HEIGHT);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);

        //Рисуем фон
        gr.drawImage(BACKGROUND_IMG, 0, 0, this.PANEL_WIDTH, this.PANEL_HEIGHT, null);

        cat.move(15);
        cat.draw(gr);

        //Добавляем Наруто
        naruto.move(15);
        naruto.draw(gr);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
}