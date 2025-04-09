package FlyWeight;

public class TallGrass {
    static final int Field_Size = 1000;

    public void render(String dex_id, int position_x, int position_y) {
        PokemonModel model = PokemonModelFactory.getInstance(dex_id);

        Pokemon pokemon = new Pokemon(model, position_x, position_y);

        System.out.println("(" + position_x + ", " + position_y + "): " + model.dex_id + " 출현");
    }
}
