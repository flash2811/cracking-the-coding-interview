public class JavaConcepts {
    // Overloading
    public void computerArea(int c) {  }
    public void computerArea(String c) { }

    // Overriding
    public abstract class Shape {
        public void printMe() {
            System.out.println("Shapes.. Shapes Everywhere");
        }
        public abstract double  computeArea();
    }
    public abstract class Circle extends Shape {
        private double rad = 5;
        public void printMe() {
            System.out.println("Circles.. Circles Everywhere");
        }

        public double computeArea() {
            return rad * rad * 3.15;
        }


    public abstract class Ambiguous extends Shape {
            private double area = 10;
            public double computeArea() {
                return area;

            }
        }
    }
}

// ArrayList
// Vector --> Synchronized (one thread can access it at a time)
// LinkedList
// HasMap
