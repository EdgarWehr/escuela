class Subject
{
    private String nombre;
    private int creditos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}

class Calification
{
    int valor;
}

class Professor
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student
{
    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

class Group
{
    private Professor professor;
    private int availability;
    private Student[] students;


    Group(int availability) {

        this.cupo = availability;
        students = new Student[availability];
    }
}


public class Application {
    public static void main(String[] args)
    {

    }
}
