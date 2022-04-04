package BuilderPattern;

public class BuilderDriver {
    public static void main(String[] args) {
        PC pc1= new PC(
                new PCBuilder("Intel Core i3 gen 7", "Gigabyte Z390 gaming", "8 GB")
                        .addSM("SSD1-250GB")
                        .addSM("HDD1-1TB")
                        .addSM("HDD2-1TB")
                        .addFan("Fan 1 with RGB")
                        .addFan("Fan 2")
                        .addFan("Fan 3 with RGB")
                        .addOS("Windows 10")
        );
        System.out.println(pc1);

        PC pc2 = new PC(
                new PCBuilder("Intel Core i7 9th gen","Gigabyte Z395 Gaming","16 GB")
                        .addSM("SSD1-512GB")
                        .addSM("HDD1-1TB")
                        .addSM("HDD1-1TB")
                        .addFan("RGB fan-1")
                        .addFan("RGB fan-2")
                        .addFan("RGB fan-3")
                        .addFan("RGB fan-4")
                        .addGPU("GeForce RTX 3090")
                        .addOS("Linux")
        );
        System.out.println(pc2);
    }
}
