/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structure.decorate.explain;

/**
 *
 * @author dengxt
 */
public class DecoratorAfter {

    interface I {

        void doIt();
    }

    static class A implements I {

        public void doIt() {
            System.out.print('A');
        }
    }

    static abstract class Decorator implements I {

        private I core;

        public Decorator(I inner) {
            core = inner;
        }

        public void doIt() {
            core.doIt();
        }
    }

    static class X extends Decorator {

        public X(I inner) {
            super(inner);
        }

        public void doIt() {
            super.doIt();
            doX();
        }

        private void doX() {
            System.out.print('X');
        }
    }

    static class Y extends Decorator {

        public Y(I inner) {
            super(inner);
        }

        public void doIt() {
            super.doIt();
            doY();
        }

        private void doY() {
            System.out.print('Y');
        }
    }

    static class Z extends Decorator {

        public Z(I inner) {
            super(inner);
        }

        public void doIt() {
            super.doIt();
            doZ();
        }

        private void doZ() {
            System.out.print('Z');
        }
    }

    public static void main(String[] args) {
        I[] array = {new X(new A()), new Y(new X(new A())), new Z(new Y(new X(new A())))};
        for (int i = 0; i < array.length; i++) {
            array[i].doIt();
            System.out.print("  ");
        }
    }
}
// AX  AXY  AXYZ

