package Homework18_2;

    public class Laptop extends ComputingDevice {
        private String screenSize;

        public Laptop(String brand, int memoryCapacity, String screenSize) {
            super(brand, memoryCapacity);
            this.screenSize = screenSize;
        }

        public String getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(String screenSize) {
            this.screenSize = screenSize;
        }

        @Override
        public void displayInformation() {
            System.out.println("Type: Laptop");
            System.out.println("Brand: " + getBrand());
            System.out.println("Memory capacity: " + getMemoryCapacity() + " GB");
            System.out.println("Screen size: " + getScreenSize());
        }
    }


