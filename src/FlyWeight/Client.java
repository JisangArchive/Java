package FlyWeight;

public class Client {
    public static void main(String[] args) {
        TallGrass tallgrass = new TallGrass();

        for (int i = 0; i < 5; i++) {
            tallgrass.render(
                    "001",
                    (int) Math.round(Math.random() * TallGrass.Field_Size),
                    (int) Math.round(Math.random() * TallGrass.Field_Size)
            );
        }

        for (int i = 0; i < 5; i++) {
            tallgrass.render(
                    "002",
                    (int) Math.round(Math.random() * TallGrass.Field_Size),
                    (int) Math.round(Math.random() * TallGrass.Field_Size)
            );
        }

        for (int i = 0; i < 5; i++) {
            tallgrass.render(
                    "003",
                    (int) Math.round(Math.random() * TallGrass.Field_Size),
                    (int) Math.round(Math.random() * TallGrass.Field_Size)
            );
        }

        Memory.print();
    }
}
