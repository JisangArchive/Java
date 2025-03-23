package Builder;

public class Pokemon {
    private String dictNo;
    private String name;
    private String type;
    private String evolution;

    private Pokemon(Builder builder) {
        this.dictNo = builder.dictNo;
        this.name = builder.name;
        this.type = builder.type;
        this.evolution = builder.evolution;
    }

    public static class Builder {
        private String dictNo;
        private String name;
        private String type;
        private String evolution;

        // 필수 정보를 위한 기본 생성자
        public Builder(String dictNo, String name) {
            this.dictNo = dictNo;
            this.name = name;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder evolution(String evolution) {
            this.evolution = evolution;
            return this;
        }

        public Pokemon build() {
            return new Pokemon(this);
        }
    }

    public void showPokemonInfo() {
        System.out.println("도감 번호: " + dictNo);
        System.out.println("이름: " + name);
        System.out.println("타입: " + type);
        System.out.println("진화 단계: " + evolution);
    }
}
