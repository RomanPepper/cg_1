package Shapes;

import java.awt.*;

public class Cat extends Shape2D implements Movable {
    private enum Position {
        RIGHT, LEFT;
    }

    public static final int REFERENCE_WIDTH = 512;
    public static final int REFERENCE_HEIGHT = 320;

    private static final Color BLACK_COLOR = new Color(19, 4, 0);
    private static final Color DARK_BROWN_COLOR = new Color(32, 27, 21);
    private static final Color LIGHT_BROWN_COLOR = new Color(49, 34, 19);
    private static final Color DARK_ASPHALT_COLOR = new Color(36, 33, 28);
    private static final Color LIGHT_ASPHALT_COLOR = new Color(46, 41, 36);
    private static final Color DARK_CONCRETE_COLOR = new Color(42, 40, 36);
    private static final Color LIGHT_CONCRETE_COLOR = new Color(61, 57, 55);
    private static final Color DARK_SWAMP_COLOR = new Color(28, 24, 16);
    private static final Color LIGHT_SWAMP_COLOR = new Color(45, 44, 31);
    private static final Color DARK_BEIGE_COLOR = new Color(73, 61, 48);
    private static final Color BEIGE_COLOR = new Color(104, 79, 56);
    private static final Color LIGHT_BEIGE_COLOR = new Color(154, 109, 68);
    private static final Color SAND_COLOR = new Color(181, 143, 104);
    private static final Color DARK_PINK_COLOR = new Color(100, 84, 75);
    private static final Color LIGHT_PINK_COLOR = new Color(150, 114, 93);
    private Position position;
    private int x;
    private int y;
    private int width;
    private int height;
    public Cat(final int x, final int y, final int width, final int height) {
        this.position = Position.LEFT;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void move(int px) {
        this.x = this.x - px;
        if (this.position == Position.LEFT) {
            this.position = Position.RIGHT;
        } else {
            this.position = Position.LEFT;
        }
    }

    private double scaleXIndent(double x) {
        return x / REFERENCE_WIDTH;
    }

    private double scaleYIndent(double y) {
        return y / REFERENCE_HEIGHT;
    }

    public void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        if (this.position == Position.RIGHT) {
            //ears
            g.setColor(LIGHT_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(10) * this.width),
                            (int) (this.x + scaleXIndent(31) * this.width),
                            (int) (this.x + scaleXIndent(176) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(0) * this.height),
                            (int) (this.y + scaleYIndent(31) * this.height),
                            (int) (this.y + scaleYIndent(76) * this.height)},
                    3
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(49) * this.width),
                            (int) (this.x + scaleXIndent(67) * this.width),
                            (int) (this.x + scaleXIndent(176) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(18) * this.height),
                            (int) (this.y + scaleYIndent(4) * this.height),
                            (int) (this.y + scaleYIndent(76) * this.height)},
                    3
            );
            g.setColor(SAND_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(31) * this.width),
                            (int) (this.x + scaleXIndent(133) * this.width),
                            (int) (this.x + scaleXIndent(176) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(31) * this.height),
                            (int) (this.y + scaleYIndent(82) * this.height),
                            (int) (this.y + scaleYIndent(76) * this.height)},
                    3
            );

            //face
            g.setColor(LIGHT_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(31) * this.width),
                            (int) (this.x + scaleXIndent(133) * this.width),
                            (int) (this.x + scaleXIndent(103) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(31) * this.height),
                            (int) (this.y + scaleYIndent(82) * this.height),
                            (int) (this.y + scaleYIndent(76) * this.height)},
                    3
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(31) * this.width),
                            (int) (this.x + scaleXIndent(103) * this.width),
                            (int) (this.x + scaleXIndent(66) * this.width),
                            (int) (this.x + scaleXIndent(0) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(31) * this.height),
                            (int) (this.y + scaleYIndent(76) * this.height),
                            (int) (this.y + scaleYIndent(127) * this.height),
                            (int) (this.y + scaleYIndent(76) * this.height)},
                    4
            );
            g.setColor(DARK_BROWN_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(0) * this.width),
                            (int) (this.x + scaleXIndent(4) * this.width),
                            (int) (this.x + scaleXIndent(30) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(76) * this.height),
                            (int) (this.y + scaleYIndent(99) * this.height),
                            (int) (this.y + scaleYIndent(99) * this.height)},
                    3
            );

            //body
            g.setColor(DARK_ASPHALT_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(103) * this.width),
                            (int) (this.x + scaleXIndent(133) * this.width),
                            (int) (this.x + scaleXIndent(156) * this.width),
                            (int) (this.x + scaleXIndent(176) * this.width),
                            (int) (this.x + scaleXIndent(118) * this.width),
                            (int) (this.x + scaleXIndent(66) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(76) * this.height),
                            (int) (this.y + scaleYIndent(82) * this.height),
                            (int) (this.y + scaleYIndent(78) * this.height),
                            (int) (this.y + scaleYIndent(76) * this.height),
                            (int) (this.y + scaleYIndent(194) * this.height),
                            (int) (this.y + scaleYIndent(127) * this.height)},
                    6
            );
            g.setColor(BLACK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(176) * this.width),
                            (int) (this.x + scaleXIndent(215) * this.width),
                            (int) (this.x + scaleXIndent(240) * this.width),
                            (int) (this.x + scaleXIndent(118) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(76) * this.height),
                            (int) (this.y + scaleYIndent(78) * this.height),
                            (int) (this.y + scaleYIndent(187) * this.height),
                            (int) (this.y + scaleYIndent(194) * this.height)},
                    4
            );

            g.setColor(LIGHT_ASPHALT_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(215) * this.width),
                            (int) (this.x + scaleXIndent(312) * this.width),
                            (int) (this.x + scaleXIndent(295) * this.width),
                            (int) (this.x + scaleXIndent(240) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(78) * this.height),
                            (int) (this.y + scaleYIndent(66) * this.height),
                            (int) (this.y + scaleYIndent(198) * this.height),
                            (int) (this.y + scaleYIndent(187) * this.height)},
                    4
            );
            g.setColor(LIGHT_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(312) * this.width),
                            (int) (this.x + scaleXIndent(343) * this.width),
                            (int) (this.x + scaleXIndent(295) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(66) * this.height),
                            (int) (this.y + scaleYIndent(74) * this.height),
                            (int) (this.y + scaleYIndent(198) * this.height)},
                    3
            );
            g.setColor(BLACK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(295) * this.width),
                            (int) (this.x + scaleXIndent(343) * this.width),
                            (int) (this.x + scaleXIndent(372) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(198) * this.height),
                            (int) (this.y + scaleYIndent(74) * this.height),
                            (int) (this.y + scaleYIndent(227) * this.height)},
                    3
            );
            g.setColor(LIGHT_BROWN_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(343) * this.width),
                            (int) (this.x + scaleXIndent(430) * this.width),
                            (int) (this.x + scaleXIndent(372) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(74) * this.height),
                            (int) (this.y + scaleYIndent(104) * this.height),
                            (int) (this.y + scaleYIndent(227) * this.height)},
                    3
            );
            g.setColor(DARK_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(372) * this.width),
                            (int) (this.x + scaleXIndent(430) * this.width),
                            (int) (this.x + scaleXIndent(436) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(227) * this.height),
                            (int) (this.y + scaleYIndent(104) * this.height),
                            (int) (this.y + scaleYIndent(197) * this.height)},
                    3
            );
            g.setColor(LIGHT_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(343) * this.width),
                            (int) (this.x + scaleXIndent(419) * this.width),
                            (int) (this.x + scaleXIndent(430) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(74) * this.height),
                            (int) (this.y + scaleYIndent(78) * this.height),
                            (int) (this.y + scaleYIndent(104) * this.height)},
                    3
            );

            //BUTT
            g.setColor(LIGHT_ASPHALT_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(430) * this.width),
                            (int) (this.x + scaleXIndent(447) * this.width),
                            (int) (this.x + scaleXIndent(436) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(104) * this.height),
                            (int) (this.y + scaleYIndent(134) * this.height),
                            (int) (this.y + scaleYIndent(197) * this.height)},
                    3
            );

            //tail
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(419) * this.width),
                            (int) (this.x + scaleXIndent(463) * this.width),
                            (int) (this.x + scaleXIndent(447) * this.width),
                            (int) (this.x + scaleXIndent(430) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(78) * this.height),
                            (int) (this.y + scaleYIndent(95) * this.height),
                            (int) (this.y + scaleYIndent(134) * this.height),
                            (int) (this.y + scaleYIndent(104) * this.height)},
                    4
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(463) * this.width),
                            (int) (this.x + scaleXIndent(509) * this.width),
                            (int) (this.x + scaleXIndent(447) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(95) * this.height),
                            (int) (this.y + scaleYIndent(111) * this.height),
                            (int) (this.y + scaleYIndent(134) * this.height)},
                    3
            );

            //right front paw
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(96) * this.width),
                            (int) (this.x + scaleXIndent(118) * this.width),
                            (int) (this.x + scaleXIndent(132) * this.width),
                            (int) (this.x + scaleXIndent(95) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(165) * this.height),
                            (int) (this.y + scaleYIndent(194) * this.height),
                            (int) (this.y + scaleYIndent(215) * this.height),
                            (int) (this.y + scaleYIndent(206) * this.height)},
                    4
            );
            g.setColor(LIGHT_BROWN_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(95) * this.width),
                            (int) (this.x + scaleXIndent(132) * this.width),
                            (int) (this.x + scaleXIndent(136) * this.width),
                            (int) (this.x + scaleXIndent(116) * this.width),
                            (int) (this.x + scaleXIndent(91) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(206) * this.height),
                            (int) (this.y + scaleYIndent(215) * this.height),
                            (int) (this.y + scaleYIndent(234) * this.height),
                            (int) (this.y + scaleYIndent(243) * this.height),
                            (int) (this.y + scaleYIndent(221) * this.height)},
                    5
            );
            g.setColor(BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(91) * this.width),
                            (int) (this.x + scaleXIndent(116) * this.width),
                            (int) (this.x + scaleXIndent(106) * this.width),
                            (int) (this.x + scaleXIndent(77) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(221) * this.height),
                            (int) (this.y + scaleYIndent(243) * this.height),
                            (int) (this.y + scaleYIndent(271) * this.height),
                            (int) (this.y + scaleYIndent(240) * this.height)},
                    4
            );
            g.setColor(LIGHT_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(77) * this.width),
                            (int) (this.x + scaleXIndent(106) * this.width),
                            (int) (this.x + scaleXIndent(78) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(240) * this.height),
                            (int) (this.y + scaleYIndent(271) * this.height),
                            (int) (this.y + scaleYIndent(281) * this.height)},
                    3
            );
            g.setColor(DARK_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(60) * this.width),
                            (int) (this.x + scaleXIndent(77) * this.width),
                            (int) (this.x + scaleXIndent(78) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(258) * this.height),
                            (int) (this.y + scaleYIndent(240) * this.height),
                            (int) (this.y + scaleYIndent(281) * this.height)},
                    3
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(60) * this.width),
                            (int) (this.x + scaleXIndent(78) * this.width),
                            (int) (this.x + scaleXIndent(63) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(258) * this.height),
                            (int) (this.y + scaleYIndent(281) * this.height),
                            (int) (this.y + scaleYIndent(297) * this.height)},
                    3
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(44) * this.width),
                            (int) (this.x + scaleXIndent(60) * this.width),
                            (int) (this.x + scaleXIndent(63) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(271) * this.height),
                            (int) (this.y + scaleYIndent(258) * this.height),
                            (int) (this.y + scaleYIndent(297) * this.height)},
                    3
            );
            g.setColor(SAND_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(44) * this.width),
                            (int) (this.x + scaleXIndent(63) * this.width),
                            (int) (this.x + scaleXIndent(44) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(271) * this.height),
                            (int) (this.y + scaleYIndent(297) * this.height),
                            (int) (this.y + scaleYIndent(289) * this.height)},
                    3
            );

            //left front paw
            g.setColor(DARK_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(118) * this.width),
                            (int) (this.x + scaleXIndent(240) * this.width),
                            (int) (this.x + scaleXIndent(132) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(194) * this.height),
                            (int) (this.y + scaleYIndent(187) * this.height),
                            (int) (this.y + scaleYIndent(215) * this.height)},
                    3
            );
            g.setColor(DARK_ASPHALT_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(132) * this.width),
                            (int) (this.x + scaleXIndent(240) * this.width),
                            (int) (this.x + scaleXIndent(176) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(215) * this.height),
                            (int) (this.y + scaleYIndent(187) * this.height),
                            (int) (this.y + scaleYIndent(239) * this.height)},
                    3
            );
            g.setColor(BLACK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(132) * this.width),
                            (int) (this.x + scaleXIndent(176) * this.width),
                            (int) (this.x + scaleXIndent(173) * this.width),
                            (int) (this.x + scaleXIndent(144) * this.width),
                            (int) (this.x + scaleXIndent(136) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(215) * this.height),
                            (int) (this.y + scaleYIndent(239) * this.height),
                            (int) (this.y + scaleYIndent(253) * this.height),
                            (int) (this.y + scaleYIndent(261) * this.height),
                            (int) (this.y + scaleYIndent(234) * this.height)},
                    5
            );
            g.setColor(DARK_ASPHALT_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(144) * this.width),
                            (int) (this.x + scaleXIndent(173) * this.width),
                            (int) (this.x + scaleXIndent(165) * this.width),
                            (int) (this.x + scaleXIndent(140) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(261) * this.height),
                            (int) (this.y + scaleYIndent(253) * this.height),
                            (int) (this.y + scaleYIndent(300) * this.height),
                            (int) (this.y + scaleYIndent(276) * this.height)},
                    4
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(140) * this.width),
                            (int) (this.x + scaleXIndent(165) * this.width),
                            (int) (this.x + scaleXIndent(132) * this.width),
                            (int) (this.x + scaleXIndent(128) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(276) * this.height),
                            (int) (this.y + scaleYIndent(300) * this.height),
                            (int) (this.y + scaleYIndent(307) * this.height),
                            (int) (this.y + scaleYIndent(297) * this.height)},
                    4
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(132) * this.width),
                            (int) (this.x + scaleXIndent(165) * this.width),
                            (int) (this.x + scaleXIndent(150) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(307) * this.height),
                            (int) (this.y + scaleYIndent(300) * this.height),
                            (int) (this.y + scaleYIndent(317) * this.height)},
                    3
            );

            //right rear paw
            g.setColor(BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(372) * this.width),
                            (int) (this.x + scaleXIndent(394) * this.width),
                            (int) (this.x + scaleXIndent(374) * this.width),
                            (int) (this.x + scaleXIndent(354) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(226) * this.height),
                            (int) (this.y + scaleYIndent(244) * this.height),
                            (int) (this.y + scaleYIndent(265) * this.height),
                            (int) (this.y + scaleYIndent(255) * this.height)},
                    4
            );
            g.setColor(LIGHT_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(354) * this.width),
                            (int) (this.x + scaleXIndent(374) * this.width),
                            (int) (this.x + scaleXIndent(365) * this.width),
                            (int) (this.x + scaleXIndent(343) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(255) * this.height),
                            (int) (this.y + scaleYIndent(265) * this.height),
                            (int) (this.y + scaleYIndent(293) * this.height),
                            (int) (this.y + scaleYIndent(280) * this.height)},
                    4
            );
            g.setColor(DARK_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(343) * this.width),
                            (int) (this.x + scaleXIndent(365) * this.width),
                            (int) (this.x + scaleXIndent(366) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(280) * this.height),
                            (int) (this.y + scaleYIndent(293) * this.height),
                            (int) (this.y + scaleYIndent(315) * this.height)},
                    3
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(343) * this.width),
                            (int) (this.x + scaleXIndent(366) * this.width),
                            (int) (this.x + scaleXIndent(334) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(280) * this.height),
                            (int) (this.y + scaleYIndent(315) * this.height),
                            (int) (this.y + scaleYIndent(314) * this.height)},
                    3
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(334) * this.width),
                            (int) (this.x + scaleXIndent(366) * this.width),
                            (int) (this.x + scaleXIndent(350) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(314) * this.height),
                            (int) (this.y + scaleYIndent(315) * this.height),
                            (int) (this.y + scaleYIndent(326) * this.height)},
                    3
            );

            //left rear paw
            g.setColor(LIGHT_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(372) * this.width),
                            (int) (this.x + scaleXIndent(436) * this.width),
                            (int) (this.x + scaleXIndent(440) * this.width),
                            (int) (this.x + scaleXIndent(394) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(226) * this.height),
                            (int) (this.y + scaleYIndent(197) * this.height),
                            (int) (this.y + scaleYIndent(217) * this.height),
                            (int) (this.y + scaleYIndent(244) * this.height)},
                    4
            );
            g.setColor(BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(394) * this.width),
                            (int) (this.x + scaleXIndent(440) * this.width),
                            (int) (this.x + scaleXIndent(467) * this.width),
                            (int) (this.x + scaleXIndent(430) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(244) * this.height),
                            (int) (this.y + scaleYIndent(217) * this.height),
                            (int) (this.y + scaleYIndent(268) * this.height),
                            (int) (this.y + scaleYIndent(291) * this.height)},
                    4
            );
            g.setColor(DARK_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(430) * this.width),
                            (int) (this.x + scaleXIndent(467) * this.width),
                            (int) (this.x + scaleXIndent(468) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(291) * this.height),
                            (int) (this.y + scaleYIndent(268) * this.height),
                            (int) (this.y + scaleYIndent(297) * this.height)},
                    3
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(430) * this.width),
                            (int) (this.x + scaleXIndent(468) * this.width),
                            (int) (this.x + scaleXIndent(451) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(291) * this.height),
                            (int) (this.y + scaleYIndent(297) * this.height),
                            (int) (this.y + scaleYIndent(318) * this.height)},
                    3
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(430) * this.width),
                            (int) (this.x + scaleXIndent(451) * this.width),
                            (int) (this.x + scaleXIndent(411) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(291) * this.height),
                            (int) (this.y + scaleYIndent(318) * this.height),
                            (int) (this.y + scaleYIndent(325) * this.height)},
                    3
            );

        } else {
            //ears
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(1) * this.width),
                            (int) (this.x + scaleXIndent(156) * this.width),
                            (int) (this.x + scaleXIndent(35) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(0) * this.height),
                            (int) (this.y + scaleYIndent(57) * this.height),
                            (int) (this.y + scaleYIndent(33) * this.height)},
                    3
            );
            g.setColor(LIGHT_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(56) * this.width),
                            (int) (this.x + scaleXIndent(156) * this.width),
                            (int) (this.x + scaleXIndent(43) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(4) * this.height),
                            (int) (this.y + scaleYIndent(57) * this.height),
                            (int) (this.y + scaleYIndent(17) * this.height)},
                    3
            );

            //head and face
            g.setColor(SAND_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(35) * this.width),
                            (int) (this.x + scaleXIndent(227) * this.width),
                            (int) (this.x + scaleXIndent(176) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(33) * this.height),
                            (int) (this.y + scaleYIndent(71) * this.height),
                            (int) (this.y + scaleYIndent(72) * this.height)},
                    3
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(35) * this.width),
                            (int) (this.x + scaleXIndent(176) * this.width),
                            (int) (this.x + scaleXIndent(114) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(33) * this.height),
                            (int) (this.y + scaleYIndent(72) * this.height),
                            (int) (this.y + scaleYIndent(73) * this.height)},
                    3
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(35) * this.width),
                            (int) (this.x + scaleXIndent(114) * this.width),
                            (int) (this.x + scaleXIndent(77) * this.width),
                            (int) (this.x + scaleXIndent(66) * this.width),

                            (int) (this.x + scaleXIndent(40) * this.width),
                            (int) (this.x + scaleXIndent(19) * this.width),
                            (int) (this.x + scaleXIndent(18) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(33) * this.height),
                            (int) (this.y + scaleYIndent(72) * this.height),
                            (int) (this.y + scaleYIndent(124) * this.height),
                            (int) (this.y + scaleYIndent(107) * this.height),

                            (int) (this.y + scaleYIndent(106) * this.height),
                            (int) (this.y + scaleYIndent(89) * this.height),
                            (int) (this.y + scaleYIndent(64) * this.height)},
                    7
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(18) * this.width),
                            (int) (this.x + scaleXIndent(19) * this.width),
                            (int) (this.x + scaleXIndent(9) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(64) * this.height),
                            (int) (this.y + scaleYIndent(89) * this.height),
                            (int) (this.y + scaleYIndent(80) * this.height)},
                    3
            );
            g.setColor(DARK_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(9) * this.width),
                            (int) (this.x + scaleXIndent(40) * this.width),
                            (int) (this.x + scaleXIndent(15) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(80) * this.height),
                            (int) (this.y + scaleYIndent(106) * this.height),
                            (int) (this.y + scaleYIndent(106) * this.height)},
                    3
            );

            //body
            g.setColor(DARK_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(113) * this.width),
                            (int) (this.x + scaleXIndent(176) * this.width),
                            (int) (this.x + scaleXIndent(77) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(73) * this.height),
                            (int) (this.y + scaleYIndent(72) * this.height),
                            (int) (this.y + scaleYIndent(124) * this.height)},
                    3
            );
            g.setColor(DARK_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(77) * this.width),
                            (int) (this.x + scaleXIndent(176) * this.width),
                            (int) (this.x + scaleXIndent(148) * this.width),
                            (int) (this.x + scaleXIndent(128) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(124) * this.height),
                            (int) (this.y + scaleYIndent(72) * this.height),
                            (int) (this.y + scaleYIndent(158) * this.height),
                            (int) (this.y + scaleYIndent(213) * this.height)},
                    4
            );
            g.setColor(BLACK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(176) * this.width),
                            (int) (this.x + scaleXIndent(227) * this.width),
                            (int) (this.x + scaleXIndent(271) * this.width),
                            (int) (this.x + scaleXIndent(246) * this.width),
                            (int) (this.x + scaleXIndent(148) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(72) * this.height),
                            (int) (this.y + scaleYIndent(71) * this.height),
                            (int) (this.y + scaleYIndent(196) * this.height),
                            (int) (this.y + scaleYIndent(196) * this.height),
                            (int) (this.y + scaleYIndent(158) * this.height)},
                    5
            );
            g.setColor(DARK_ASPHALT_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(227) * this.width),
                            (int) (this.x + scaleXIndent(310) * this.width),
                            (int) (this.x + scaleXIndent(302) * this.width),
                            (int) (this.x + scaleXIndent(271) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(71) * this.height),
                            (int) (this.y + scaleYIndent(62) * this.height),
                            (int) (this.y + scaleYIndent(198) * this.height),
                            (int) (this.y + scaleYIndent(196) * this.height)},
                    4
            );
            g.setColor(LIGHT_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(310) * this.width),
                            (int) (this.x + scaleXIndent(344) * this.width),
                            (int) (this.x + scaleXIndent(302) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(62) * this.height),
                            (int) (this.y + scaleYIndent(70) * this.height),
                            (int) (this.y + scaleYIndent(198) * this.height)},
                    3
            );
            g.setColor(BLACK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(302) * this.width),
                            (int) (this.x + scaleXIndent(344) * this.width),
                            (int) (this.x + scaleXIndent(380) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(198) * this.height),
                            (int) (this.y + scaleYIndent(70) * this.height),
                            (int) (this.y + scaleYIndent(195) * this.height)},
                    3
            );
            g.setColor(DARK_SWAMP_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(344) * this.width),
                            (int) (this.x + scaleXIndent(413) * this.width),
                            (int) (this.x + scaleXIndent(408) * this.width),
                            (int) (this.x + scaleXIndent(383) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(70) * this.height),
                            (int) (this.y + scaleYIndent(167) * this.height),
                            (int) (this.y + scaleYIndent(175) * this.height),
                            (int) (this.y + scaleYIndent(217) * this.height)},
                    4
            );
            g.setColor(DARK_ASPHALT_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(344) * this.width),
                            (int) (this.x + scaleXIndent(448) * this.width),
                            (int) (this.x + scaleXIndent(413) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(70) * this.height),
                            (int) (this.y + scaleYIndent(129) * this.height),
                            (int) (this.y + scaleYIndent(167) * this.height)},
                    3
            );
            g.setColor(LIGHT_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(344) * this.width),
                            (int) (this.x + scaleXIndent(413) * this.width),
                            (int) (this.x + scaleXIndent(448) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(70) * this.height),
                            (int) (this.y + scaleYIndent(73) * this.height),
                            (int) (this.y + scaleYIndent(129) * this.height)},
                    3
            );

            //left front paw
            g.setColor(DARK_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(128) * this.width),
                            (int) (this.x + scaleXIndent(148) * this.width),
                            (int) (this.x + scaleXIndent(246) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(213) * this.height),
                            (int) (this.y + scaleYIndent(158) * this.height),
                            (int) (this.y + scaleYIndent(196) * this.height)},
                    3
            );
            g.setColor(LIGHT_SWAMP_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(128) * this.width),
                            (int) (this.x + scaleXIndent(246) * this.width),
                            (int) (this.x + scaleXIndent(166) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(213) * this.height),
                            (int) (this.y + scaleYIndent(196) * this.height),
                            (int) (this.y + scaleYIndent(241) * this.height)},
                    3
            );
            g.setColor(BLACK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(128) * this.width),
                            (int) (this.x + scaleXIndent(166) * this.width),
                            (int) (this.x + scaleXIndent(155) * this.width),
                            (int) (this.x + scaleXIndent(123) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(213) * this.height),
                            (int) (this.y + scaleYIndent(241) * this.height),
                            (int) (this.y + scaleYIndent(256) * this.height),
                            (int) (this.y + scaleYIndent(261) * this.height)},
                    4
            );
            g.setColor(LIGHT_SWAMP_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(123) * this.width),
                            (int) (this.x + scaleXIndent(155) * this.width),
                            (int) (this.x + scaleXIndent(130) * this.width),
                            (int) (this.x + scaleXIndent(114) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(261) * this.height),
                            (int) (this.y + scaleYIndent(256) * this.height),
                            (int) (this.y + scaleYIndent(302) * this.height),
                            (int) (this.y + scaleYIndent(276) * this.height)},
                    4
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(94) * this.width),
                            (int) (this.x + scaleXIndent(114) * this.width),
                            (int) (this.x + scaleXIndent(130) * this.width),
                            (int) (this.x + scaleXIndent(94) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(297) * this.height),
                            (int) (this.y + scaleYIndent(276) * this.height),
                            (int) (this.y + scaleYIndent(302) * this.height),
                            (int) (this.y + scaleYIndent(305) * this.height)},
                    4
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(94) * this.width),
                            (int) (this.x + scaleXIndent(130) * this.width),
                            (int) (this.x + scaleXIndent(109) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(305) * this.height),
                            (int) (this.y + scaleYIndent(302) * this.height),
                            (int) (this.y + scaleYIndent(318) * this.height)},
                    3
            );

            //right front paw
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(170) * this.width),
                            (int) (this.x + scaleXIndent(205) * this.width),
                            (int) (this.x + scaleXIndent(205) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(239) * this.height),
                            (int) (this.y + scaleYIndent(219) * this.height),
                            (int) (this.y + scaleYIndent(238) * this.height)},
                    3
            );
            g.setColor(LIGHT_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(170) * this.width),
                            (int) (this.x + scaleXIndent(205) * this.width),
                            (int) (this.x + scaleXIndent(217) * this.width),
                            (int) (this.x + scaleXIndent(171) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(239) * this.height),
                            (int) (this.y + scaleYIndent(238) * this.height),
                            (int) (this.y + scaleYIndent(259) * this.height),
                            (int) (this.y + scaleYIndent(254) * this.height)},
                    4
            );
            g.setColor(DARK_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(171) * this.width),
                            (int) (this.x + scaleXIndent(217) * this.width),
                            (int) (this.x + scaleXIndent(204) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(254) * this.height),
                            (int) (this.y + scaleYIndent(259) * this.height),
                            (int) (this.y + scaleYIndent(280) * this.height)},
                    3
            );
            g.setColor(DARK_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(171) * this.width),
                            (int) (this.x + scaleXIndent(204) * this.width),
                            (int) (this.x + scaleXIndent(171) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(254) * this.height),
                            (int) (this.y + scaleYIndent(280) * this.height),
                            (int) (this.y + scaleYIndent(278) * this.height)},
                    3
            );
            g.setColor(SAND_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(171) * this.width),
                            (int) (this.x + scaleXIndent(204) * this.width),
                            (int) (this.x + scaleXIndent(202) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(278) * this.height),
                            (int) (this.y + scaleYIndent(280) * this.height),
                            (int) (this.y + scaleYIndent(299) * this.height)},
                    3
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(166) * this.width),
                            (int) (this.x + scaleXIndent(171) * this.width),
                            (int) (this.x + scaleXIndent(202) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(298) * this.height),
                            (int) (this.y + scaleYIndent(278) * this.height),
                            (int) (this.y + scaleYIndent(299) * this.height)},
                    3
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(166) * this.width),
                            (int) (this.x + scaleXIndent(202) * this.width),
                            (int) (this.x + scaleXIndent(181) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(298) * this.height),
                            (int) (this.y + scaleYIndent(299) * this.height),
                            (int) (this.y + scaleYIndent(309) * this.height)},
                    3
            );

            //right rear paw
            g.setColor(LIGHT_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(408) * this.width),
                            (int) (this.x + scaleXIndent(413) * this.width),
                            (int) (this.x + scaleXIndent(448) * this.width),
                            (int) (this.x + scaleXIndent(434) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(175) * this.height),
                            (int) (this.y + scaleYIndent(167) * this.height),
                            (int) (this.y + scaleYIndent(129) * this.height),
                            (int) (this.y + scaleYIndent(219) * this.height)},
                    4
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(383) * this.width),
                            (int) (this.x + scaleXIndent(408) * this.width),
                            (int) (this.x + scaleXIndent(420) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(217) * this.height),
                            (int) (this.y + scaleYIndent(175) * this.height),
                            (int) (this.y + scaleYIndent(192) * this.height)},
                    3
            );
            g.setColor(LIGHT_CONCRETE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(383) * this.width),
                            (int) (this.x + scaleXIndent(391) * this.width),
                            (int) (this.x + scaleXIndent(416) * this.width),
                            (int) (this.x + scaleXIndent(451) * this.width),
                            (int) (this.x + scaleXIndent(419) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(217) * this.height),
                            (int) (this.y + scaleYIndent(204) * this.height),
                            (int) (this.y + scaleYIndent(189) * this.height),
                            (int) (this.y + scaleYIndent(246) * this.height),
                            (int) (this.y + scaleYIndent(268) * this.height)},
                    5
            );
            g.setColor(LIGHT_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(419) * this.width),
                            (int) (this.x + scaleXIndent(451) * this.width),
                            (int) (this.x + scaleXIndent(455) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(268) * this.height),
                            (int) (this.y + scaleYIndent(246) * this.height),
                            (int) (this.y + scaleYIndent(276) * this.height)},
                    3
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(419) * this.width),
                            (int) (this.x + scaleXIndent(455) * this.width),
                            (int) (this.x + scaleXIndent(441) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(268) * this.height),
                            (int) (this.y + scaleYIndent(276) * this.height),
                            (int) (this.y + scaleYIndent(301) * this.height)},
                    3
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(397) * this.width),
                            (int) (this.x + scaleXIndent(419) * this.width),
                            (int) (this.x + scaleXIndent(441) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(301) * this.height),
                            (int) (this.y + scaleYIndent(268) * this.height),
                            (int) (this.y + scaleYIndent(301) * this.height)},
                    3
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(397) * this.width),
                            (int) (this.x + scaleXIndent(441) * this.width),
                            (int) (this.x + scaleXIndent(416) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(301) * this.height),
                            (int) (this.y + scaleYIndent(301) * this.height),
                            (int) (this.y + scaleYIndent(311) * this.height)},
                    3
            );

            //left back paw
            g.setColor(DARK_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(302) * this.width),
                            (int) (this.x + scaleXIndent(380) * this.width),
                            (int) (this.x + scaleXIndent(383) * this.width),
                            (int) (this.x + scaleXIndent(372) * this.width),
                            (int) (this.x + scaleXIndent(343) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(198) * this.height),
                            (int) (this.y + scaleYIndent(195) * this.height),
                            (int) (this.y + scaleYIndent(217) * this.height),
                            (int) (this.y + scaleYIndent(234) * this.height),
                            (int) (this.y + scaleYIndent(219) * this.height)},
                    5
            );
            g.setColor(BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(343) * this.width),
                            (int) (this.x + scaleXIndent(372) * this.width),
                            (int) (this.x + scaleXIndent(356) * this.width),
                            (int) (this.x + scaleXIndent(328) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(219) * this.height),
                            (int) (this.y + scaleYIndent(234) * this.height),
                            (int) (this.y + scaleYIndent(260) * this.height),
                            (int) (this.y + scaleYIndent(246) * this.height)},
                    4
            );
            g.setColor(BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(328) * this.width),
                            (int) (this.x + scaleXIndent(356) * this.width),
                            (int) (this.x + scaleXIndent(355) * this.width),
                            (int) (this.x + scaleXIndent(317) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(246) * this.height),
                            (int) (this.y + scaleYIndent(260) * this.height),
                            (int) (this.y + scaleYIndent(297) * this.height),
                            (int) (this.y + scaleYIndent(272) * this.height)},
                    4
            );
            g.setColor(DARK_BEIGE_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(317) * this.width),
                            (int) (this.x + scaleXIndent(355) * this.width),
                            (int) (this.x + scaleXIndent(341) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(272) * this.height),
                            (int) (this.y + scaleYIndent(297) * this.height),
                            (int) (this.y + scaleYIndent(309) * this.height)},
                    3
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(304) * this.width),
                            (int) (this.x + scaleXIndent(317) * this.width),
                            (int) (this.x + scaleXIndent(341) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(310) * this.height),
                            (int) (this.y + scaleYIndent(272) * this.height),
                            (int) (this.y + scaleYIndent(309) * this.height)},
                    3
            );
            g.setColor(LIGHT_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(304) * this.width),
                            (int) (this.x + scaleXIndent(341) * this.width),
                            (int) (this.x + scaleXIndent(336) * this.width),
                            (int) (this.x + scaleXIndent(308) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(310) * this.height),
                            (int) (this.y + scaleYIndent(309) * this.height),
                            (int) (this.y + scaleYIndent(315) * this.height),
                            (int) (this.y + scaleYIndent(316) * this.height)},
                    4
            );

            //tail
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(413) * this.width),
                            (int) (this.x + scaleXIndent(455) * this.width),
                            (int) (this.x + scaleXIndent(448) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(73) * this.height),
                            (int) (this.y + scaleYIndent(80) * this.height),
                            (int) (this.y + scaleYIndent(129) * this.height)},
                    3
            );
            g.setColor(DARK_PINK_COLOR);
            g.fillPolygon(
                    new int[]{(int) (this.x + scaleXIndent(455) * this.width),
                            (int) (this.x + scaleXIndent(510) * this.width),
                            (int) (this.x + scaleXIndent(448) * this.width)},
                    new int[]{(int) (this.y + scaleYIndent(80) * this.height),
                            (int) (this.y + scaleYIndent(87) * this.height),
                            (int) (this.y + scaleYIndent(129) * this.height)},
                    3
            );
        }
    }
}