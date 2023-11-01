package HomeWork17_1;

public class Cube {

        private double a;

        public Cube(double a) {

            this.a = a;
        }

        public double getArea() {
            return 6 * a * a;
        }

        public double getVolume() {
            return a * a * a;
        }
}
