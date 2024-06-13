package lang.object.test;

import java.util.Objects;

public class Rectangle {
    private int widths;
    private int heights;

    public Rectangle(int widths, int heights) {
        this.widths = widths;
        this.heights = heights;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "가로 = " + widths +
                ", 세로 = " + heights +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return widths == rectangle.widths && heights == rectangle.heights;
    }

}
