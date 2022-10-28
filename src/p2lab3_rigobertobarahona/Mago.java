package p2lab3_rigobertobarahona;


public class Mago extends Personaje{
    private String magia;

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public Mago(int edad, String nombre, String raza, String nacionalidad, double height, double peso, String description, int AC, int CS, int HP, String Pclass, String magia) {
        super(edad, nombre, raza, nacionalidad, height, peso, description, AC, CS, HP, Pclass);
        this.magia = magia;
    }
    
}
