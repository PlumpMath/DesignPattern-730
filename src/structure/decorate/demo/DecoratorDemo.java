/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.decorate.demo;

/**
 *
 * @author dengxt
 */
// Purpose.  Decorator design pattern
// 1. Create a "lowest common denominator" that makes classes interchangeable
// 2. Create a second level base class for optional functionality
// 3. "Core" class and "Decorator" class declare an "is a" relationship
// 4. Decorator class "has a" instance of the "lowest common denominator"
// 5. Decorator class delegates to the "has a" object
// 6. Create a Decorator derived class for each optional embellishment
// 7. Decorator derived classes delegate to base class AND add extra stuf
// 8. Client has the responsibility to compose desired configurations
interface Widget {                              // 1. "lowest common denominator"

    void draw();
}               

class TextField implements Widget {            // 3. "Core" class with "is a" rel

    private int width, height;

    public TextField(int w, int h) {
        width = w;
        height = h;
    }

    public void draw() {
        System.out.println("TextField: " + width + ", " + height);
    }
}

abstract class Decorator implements Widget {        // 2. Second level base class with "is a" relationship  

    private Widget wid;                              // 4. "has a" relationship

    public Decorator(Widget w) {
        wid = w;
    }

    public void draw() {
        wid.draw();
    } // 5. Delegation
}

class BorderDecorator extends Decorator {          // 6. Optional embellishment

    public BorderDecorator(Widget w) {
        super(w);
    }

    public void draw() {
        super.draw();                                // 7. Delegate to base class
        System.out.println("   BorderDecorator");  //    and add extra stuff
    }
}

class ScrollDecorator extends Decorator {          // 6. Optional embellishment

    public ScrollDecorator(Widget w) {
        super(w);
    }

    public void draw() {
        super.draw();                                // 7. Delegate to base class
        System.out.println("   ScrollDecorator");  //    and add extra stuff
    }
}

public class DecoratorDemo {

    public static void main(String[] args) {
        // 8. Client has the responsibility to compose desired configurations
        Widget aWidget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
        aWidget.draw();
    }
}
//    TextField: 80, 24
//    ScrollDecorator
//    BorderDecorator
//    BorderDecorator
