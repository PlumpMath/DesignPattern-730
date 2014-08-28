/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.facade.uniface;

/**
 *
 * @author dengxt
 */
// Purpose.  Facade design pattern
// 1. Identify the desired unified interface for a set of subsystems
// 2. Design a "wrapper" class that can encapsulate the use of the subsystems
// 3. The client uses (is coupled to) the Facade
// 4. The facade/wrapper "maps" to the APIs of the subsystems

class PointCarte {                           // 1. Subsystem

    private double x, y;

    public PointCarte(double xx, double yy) {
        x = xx;
        y = yy;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}


class PointPolar {                           // 1. Subsystem

    private double radius, angle;

    public PointPolar(double r, double a) {
        radius = r;
        angle = a;
    }

    public void rotate(int ang) {
        angle += ang % 360;
    }

    public String toString() {
        return "[" + radius + "@" + angle + "]";
    }
}

class Point {                                // 1. Desired i/f: move(), rotate()

    private PointCarte pc;                    // 2. Design a "wrapper" class

    public Point(double xx, double yy) {
        pc = new PointCarte(xx, yy);
    }

    public String toString() {
        return pc.toString();
    }

    public void move(int dx, int dy) {
        pc.move(dx, dy);
    } // 4. Wrapper maps

    public void rotate(int angle, Point o) {
        double x = pc.getX() - o.pc.getX(), y = pc.getY() - o.pc.getY();
        PointPolar pp = new PointPolar(Math.sqrt(x * x + y * y), Math.atan2(y, x) * 180 / Math.PI);
        pp.rotate(angle);                                     // 4. Wrapper maps
        System.out.println("   PointPolar is " + pp);
        String str = pp.toString();
        int i = str.indexOf('@');
        double r = Double.parseDouble(str.substring(1, i));
        double a = Double.parseDouble(str.substring(i + 1, str.length() - 1));
        pc = new PointCarte(r * Math.cos(a * Math.PI / 180) + o.pc.getX(),  r * Math.sin(a * Math.PI / 180) + o.pc.getY());
    }
}

class Line {

    private Point o, e;

    public Line(Point ori, Point end) {
        o = ori;
        e = end;
    }

    public void move(int dx, int dy) {
        o.move(dx, dy);
        e.move(dx, dy);
    }

    public void rotate(int angle) {
        e.rotate(angle, o);
    }

    public String toString() {
        return "origin is " + o + ", end is " + e;
    }
}

public class FacadeDemo {

    public static void main(String[] args) {
        Line line1 = new Line(new Point(2, 4), new Point(5, 7));  // 3. Client
        line1.move(-2, -4);                                        //    uses the
        System.out.println("after move:   " + line1);           //    Facade
        line1.rotate(45);
        System.out.println("after rotate: " + line1);
        Line line2 = new Line(new Point(2, 1), new Point(2.866, 1.5));
        line2.rotate(30);
        System.out.println("30 degrees to 60 degrees: " + line2);
    }
}
// after move:   origin is (0.0,0.0), end is (3.0,3.0)
//    PointPolar is [4.242@90.0]
// after rotate: origin is (0.0,0.0), end is (0.000,4.242)
//    PointPolar is [0.999@60.0]
// 30 degrees to 60 degrees: origin is (2.0,1.0), end is (2.499,1.866)

