package org.matsim.class2019.basics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void calculateArea_area(){
        Rectangle rect = new Rectangle(20,10);
        Rectangle rect1 = new Rectangle(30,40);
        double area = rect.calculateArea();
        assertEquals(200.0, area,0.001);
        assertEquals(1200.0,rect1.calculateArea(), 0.01);
    }
}
