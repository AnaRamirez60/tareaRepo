public class Estudiante {

    private String expediente;
    String carrera;
    int semestre;
    private String nombre;

    public Estudiante(){
        System.out.println("constructor vacio");
    }

    public Estudiante(String nombre, String exp){
        this.nombre = nombre;
        this.expediente= exp;
    }

    public String getExpediente() {
        return expediente;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
