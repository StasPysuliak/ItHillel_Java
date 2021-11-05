package home.work11.abstractclasses;

import java.awt.Graphics;

public class OvalComponent extends AbstractShape
{
    @Override
    protected void paintShape(Graphics g) {
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
}