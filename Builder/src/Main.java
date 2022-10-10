public class Main {

    public static void main(String[] args) {
        Carro carroComBuilder = new Carro.Builder("HB20", "AAA-1234")
                .peso(200)
                .ano(2017)
                .cor("Branco")
                .chassi("AC1B2M9K7L6G4OP5XQ")
                .preco(40_000)
                .build();

        System.out.println(carroComBuilder.toString());
    }
}
