package Homework18_2;

    abstract class ComputingDevice {
        private String brand;
        private int memoryCapacity;

        public ComputingDevice(String brand, int memoryCapacity) {
            this.brand = brand;
            this.memoryCapacity = memoryCapacity;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getMemoryCapacity() {
            return memoryCapacity;
        }

        public void setMemoryCapacity(int memoryCapacity) {
            this.memoryCapacity = memoryCapacity;
        }

        public abstract void displayInformation();
    }






