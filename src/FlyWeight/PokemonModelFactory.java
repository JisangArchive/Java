package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class PokemonModelFactory {
    // Flyweight Pool - PokemonModel 객체들을 Map 으로 등록하여 캐싱
    private static final Map<String, PokemonModel> cache = new HashMap<>();

    public static PokemonModel getInstance(String key) {
        if(cache.containsKey(key)) {
            return cache.get(key);
        } else {
            PokemonModel model = new PokemonModel(
                    key,
                    new Object(),
                    new Object()
            );

            cache.put(key, model);

            System.out.println(key + " 캐싱 완료");

            return model;
        }
    }
}
