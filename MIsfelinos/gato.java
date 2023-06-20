package MIsfelinos;

public class gato {
    private String razas;

    public String getRazas() {
        return razas;
    }

    public void setRazas(String razas) {
        this.razas = razas;
    }

    public gato(String razas) {
        this.razas = razas;
    }

    public String mostrar(){
        return "Su raza es: "+ razas;
    }
}

