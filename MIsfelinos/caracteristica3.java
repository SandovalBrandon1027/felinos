package MIsfelinos;

public class caracteristica3 extends caracteristica2{
    private double peso;

    public caracteristica3(){
        super();
    }

    public caracteristica3(String razas, String color, double peso) {
        super(razas, color);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
