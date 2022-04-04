package BuilderPattern;

import java.util.ArrayList;

public class PC {
    private String processor;
    private String motherboard;
    private String ram;
    private ArrayList<String> secondaryMemory;
    private String gpu;
    private ArrayList<String> coolingFans;
    private String OS;

    public PC(PCBuilder pcBuilder){
        processor = pcBuilder.getProcessor();
        motherboard = pcBuilder.getMotherboard();
        ram = pcBuilder.getRam();
        secondaryMemory = pcBuilder.getSecondaryMemory();
        gpu = pcBuilder.getGpu();
        coolingFans = pcBuilder.getCoolingFans();
        OS = pcBuilder.getOS();
    }

    @Override
    public String toString() {
        String ret = "PC with\n" +
                "Processor: " + processor +"\n"+
                "Motherboard: " + motherboard + '\n' +
                "Ram: " + ram + '\n';
        if(secondaryMemory.size() !=0){
            ret+="Secondary Memory: "+secondaryMemory.get(0);
            for (int i=1; i<secondaryMemory.size(); i++){
                ret+=", "+secondaryMemory.get(i);
            }
            ret+="\n";
        }
        if(gpu != null) ret+="Gpu: " + gpu + '\n';
        if(coolingFans.size() !=0){
            ret+="Cooling Fans: "+coolingFans.get(0);
            for (int i=1; i<coolingFans.size(); i++){
                ret+=", "+coolingFans.get(i);
            }
            ret+="\n";
        }
        if(OS != null)ret+= "OS: " + OS + '\n';

        return ret;
    }
}
