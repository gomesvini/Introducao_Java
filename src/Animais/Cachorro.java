package Animais;

public class Cachorro {

    static int numeroDeCachorros;
    // Atributos
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoRabo;

    // Construtores


    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoRabo, String estadoEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoRabo = tamanhoRabo;
        this.estadoEspirito = estadoEspirito;

        numeroDeCachorros ++;
    }



    // Métodos


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoRabo() {
        return tamanhoRabo;
    }

    public void setTamanhoRabo(int tamanhoRabo) {
        this.tamanhoRabo = tamanhoRabo;
    }

    public String getEstadoEspirito() {
        return estadoEspirito;
    }


    private String estadoEspirito;


    public String interagir(String acao){
        switch (acao){
            case "carinho" : this.estadoEspirito = "Feliz";
                break;
            case "petisco" : this.estadoEspirito = "Feliz e balançando o rabo";
                break;
            case "beliscar" : this.estadoEspirito = "Bravo";
                break;
            default: this.estadoEspirito = "Neutro";
                break;
        }
        return estadoEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
