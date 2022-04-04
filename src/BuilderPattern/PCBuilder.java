package BuilderPattern;

import java.util.ArrayList;

public class PCBuilder {
    private String processor;
    private String motherboard;
    private String ram;
    private ArrayList<String> secondaryMemory;
    private String gpu;
    private ArrayList<String> coolingFans;
    private String OS;

    public PCBuilder(String processor, String motherboard, String ram) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.ram = ram;
        this.secondaryMemory = new ArrayList<>();
        this.coolingFans = new ArrayList<>();
    }

    public String getProcessor() {
        return processor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getRam() {
        return ram;
    }

    public ArrayList<String> getSecondaryMemory() {
        return secondaryMemory;
    }

    public String getGpu() {
        return gpu;
    }

    public ArrayList<String> getCoolingFans() {
        return coolingFans;
    }

    public String getOS() {
        return OS;
    }

    public PCBuilder addSM(String sm){
        secondaryMemory.add(sm);
        return this;
    }

    public PCBuilder addGPU(String gpu){
        this.gpu = gpu;
        return this;
    }

    public PCBuilder addFan(String fan){
        coolingFans.add(fan);
        return this;
    }

    public PCBuilder addOS(String os){
        this.OS = os;
        return this;
    }

}
