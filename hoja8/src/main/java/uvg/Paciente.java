package uvg;

public class Paciente implements Comparable<Paciente> {

     public Paciente(String nombre, String sintoma, char categoriaPrioridad) {
          this.nombre = nombre;
          this.sintoma = sintoma;
          this.categoriaPrioridad = categoriaPrioridad;
     }
     
     String nombre;
     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     String sintoma;
     public String getSintoma() {
          return sintoma;
     }

     public void setSintoma(String sintoma) {
          this.sintoma = sintoma;
     }

     char categoriaPrioridad;

     public char getCategoriaPrioridad() {
          return categoriaPrioridad;
     }

     public void setCategoriaPrioridad(char categoriaPrioridad) {
          this.categoriaPrioridad = categoriaPrioridad;
     }

     public int compareTo(Paciente otro) {
          return Character.compare(this.categoriaPrioridad, otro.categoriaPrioridad);
     }

     public String toString() {
          return nombre + ", " + sintoma + ", " + categoriaPrioridad;
     }

}
