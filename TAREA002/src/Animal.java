public class Animal {

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void hacerSonido();
    public void dormir(){
        System.out.println("El animal esta durmiendo");
    }

    public interface Alimentable{

        public void comer(){

            System.out.println("El animal esta comiendo");
        };

        public void beber(){
            System.out.println("El animal esta bebiendo");
        }
    }
}
