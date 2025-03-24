package Singleton;

public class Test {
    public static void main(String[] args) {
        PokemonPC pc = PokemonPC.getInstance();
        pc.sendToBox(6);
        System.out.println("PC: " + pc.getPopulation() + "마리");

        pc.sendToBox(1);
        System.out.println("PC: " + pc.getPopulation() + "마리");

        PokemonPC pc2 = PokemonPC.getInstance();
        pc2.sendToBox(2);
        System.out.println("PC: " + pc2.getPopulation() + "마리");
    }
}
