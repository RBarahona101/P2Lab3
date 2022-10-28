package p2lab3_rigobertobarahona;

public class Personaje {
    private int edad;
    private String nombre;
    private String raza;
    private String nacionalidad;    
    private double height;
    private double peso;
    private String description;
    private int AC;
    private int CS;
    private int HP;
    private String Pclass;
    
    public Personaje() {
    }
    
    public String getPclass() {
        return Pclass;
    }
    public void setPclass(String Pclass) {
        this.Pclass = Pclass;
    }
        

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public int getCS() {
        return CS;
    }

    public void setCS(int CS) {
        this.CS = CS;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public Personaje(int edad, String nombre, String raza, String nacionalidad, double height, double peso, String description, int AC, int CS, int HP, String Pclass) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
        this.nacionalidad = nacionalidad;
        this.height = height;
        this.peso = peso;
        this.description = description;
        this.AC = AC;
        this.CS = CS;
        this.HP = HP;
        this.Pclass = Pclass;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
        + "Raza: " + raza + "\n"
        + "Sub-Class: " + Pclass + "\n"
        + "Ciudad: " + nacionalidad + "\n"
        + "Altura: " + height + " m" + "\n"  
        + "Peso: " + peso + " kg" + "\n"
        + "AC: " + AC + "\n"
        + "CS: " + CS + "\n"
        + "HP: " + HP ;        
    }
    
}
