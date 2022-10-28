package p2lab3_rigobertobarahona;

public class Picaro extends Personaje{
    private String instrumento;
    int heists;

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getHeists() {
        return heists;
    }

    public void setHeists(int heists) {
        this.heists = heists;
    }

    public Picaro(int edad, String nombre, String raza, String nacionalidad, double height, double peso, String description, int AC, int CS, int HP, String Pclass, String instrumento, int heists) {
        super(edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass);
        this.instrumento = instrumento;
        this.heists= heists;
    }
    
}
