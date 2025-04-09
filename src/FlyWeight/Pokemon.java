package FlyWeight;

class Pokemon {
    long objSize = 10;

    int position_x;
    int position_y;

    PokemonModel model;

    public Pokemon(PokemonModel model, int position_x, int position_y) {
        this.model = model;
        this.position_x = position_x;
        this.position_y = position_y;

        Memory.size += this.objSize;
    }
}
