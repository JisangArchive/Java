package Builder;

public class PokemonTest {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon.Builder("0025", "피카츄")
                .type("전기")
                .evolution("피츄 > [피카츄] > 라이츄")
                .build();
        pikachu.showPokemonInfo();
    }
}
