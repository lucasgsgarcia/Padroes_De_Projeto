public class Carro {
    private String modelo;
    private String chassi;
    private int ano;
    private String placa;
    private String cor;
    private double preco;
    private float peso;

    public Carro(Builder builder) {
        super();
        this.modelo = builder.modelo;
        this.chassi = builder.chassi;
        this.ano = builder.ano;
        this.placa = builder.placa;
        this.cor = builder.cor;
        this.preco = builder.preco;
        this.peso = builder.peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Carro " +
                "modelo='" + modelo + '\'' +
                ", chassi='" + chassi + '\'' +
                ", ano=" + ano +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                ", peso=" + peso +
                '}';
    }

    public static class Builder{
        private String modelo;
        private String chassi;
        private int ano;
        private String placa;
        private String cor;
        private double preco;
        private float peso;

        public Builder(String modelo, String placa) {
            this.modelo = modelo;
            this.placa = placa;
        }

        public Builder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder chassi(String chassi) {
            this.chassi = chassi;
            return this;
        }

        public Builder ano(int ano) {
            this.ano = ano;
            return this;
        }

        public Builder placa(String placa) {
            this.placa = placa;
            return this;
        }

        public Builder cor(String cor) {
            this.cor = cor;
            return this;
        }

        public Builder preco(double preco) {
            this.preco = preco;
            return this;
        }

        public Builder peso(float peso) {
            this.peso = peso;
            return this;
        }

        public Carro build(){
            return new Carro(this);
        }
    }
}


