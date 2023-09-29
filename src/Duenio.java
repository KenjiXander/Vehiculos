public class Duenio {
    int ojos = 0;
    String cabello = "";
    String colorPiel = "";
    double altura = 0;
    char genero = "";
    int edad = 0;
    int cedula = 0;
    String nacionalidad = "";
    String nombre = "";
    double peso = 0;
    String tipoSangre = "";

    public String esMayorEdad(){
        String my = "";
        if(edad >= 18){
            my = "Es mayor de edad";
            System.out.printf(my);
        }else{
            my = "Es menor de edad";
            System.out.printf(my);
        }
        return my;
    }
}
