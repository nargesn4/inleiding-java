package h13;

import h01.Show;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;



public class PraktijkOpdracht extends Show{
    public static Random rand = new Random();
    public static float scale = 1f;

    public void drawTree(Graphics2D g2, Point2D p1, int len, float angle, int depth){
        if(depth == 0 || len <= 0)
            return;

        int theta = rand.nextInt((20 - 10) + 1) + 10;

        double x1 = (len * Math.cos(Math.toRadians(angle))) * scale;
        double y1 = (len * Math.sin(Math.toRadians(angle)))* scale;

        Point2D.Double p2 = new Point2D.Double((p1.getX() + x1), (p1.getY() + y1));

        g2.draw(new Line2D.Double(p1, p2));

        drawTree(g2, p2, len - 4, angle - theta, depth - 1);
        drawTree(g2, p2, len - 4, angle + theta, depth - 1);

    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.BLACK);
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(1));
        drawTree(g2, new Point2D.Double(400, 600), 60, -90, 9);
    }
}
