package Homework18_2;

    public class DesktopComputer extends ComputingDevice {
        private String cpuModel;
        private String gpuModel;

        public DesktopComputer(String brand, int memoryCapacity, String cpuModel, String gpuModel) {
            super(brand, memoryCapacity);
            this.cpuModel = cpuModel;
            this.gpuModel = gpuModel;
        }

        public String getCpuModel() {

            return cpuModel;
        }

        public void setCpuModel(String cpuModel) {
            this.cpuModel = cpuModel;
        }

        public String getGpuModel() {
            return gpuModel;
        }

        public void setGpuModel(String gpuModel) {
            this.gpuModel = gpuModel;
        }


        @Override
        public void displayInformation() {
            System.out.println("Type: Desktop computer");
            System.out.println("Brand: " + getBrand());
            System.out.println("Memory capacity: " + getMemoryCapacity() + " GB");
            System.out.println("CPU model: " + getCpuModel());
            System.out.println("GPU model: " + getGpuModel());
        }

    }


