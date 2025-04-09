package FlyWeight;

final class PokemonModel {
    long objSize = 90;

    String dex_id;
    Object sprite;
    Object cry;

    public PokemonModel(String dex_id, Object sprite, Object cry) {
        this.dex_id = dex_id;
        this.sprite = sprite;
        this.cry = cry;

        Memory.size += this.objSize;
    }
}