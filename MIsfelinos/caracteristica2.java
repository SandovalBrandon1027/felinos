package MIsfelinos;

public class caracteristica2 extends gato{

    private String color;

    public  caracteristica2(){
        super("");
    }

    public caracteristica2(String razas, String color) {
        super(razas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
