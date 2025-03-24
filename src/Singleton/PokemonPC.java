package Singleton;

public class PokemonPC {
    private static PokemonPC instance = new PokemonPC();

    private int population;

    private PokemonPC() {
        population = 0;
    }

    public static PokemonPC getInstance() {
        if(instance == null) {
            instance = new PokemonPC();
        }
        return instance;
    }

    public int getPopulation() {
        return population;
    }

    public void sendToBox(int number) {
        population += number;
    }
}
