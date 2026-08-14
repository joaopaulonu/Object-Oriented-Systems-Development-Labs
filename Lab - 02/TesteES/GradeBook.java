package TesteES;

public class GradeBook {

    // Atributo privado da classe (faltava esta declaração)
    private String courseName;

    // Construtor 1: Sem parâmetros
    public GradeBook() {
        this.courseName = "Sem nome definido";
    }

    // Construtor 2: Recebe o nome por parâmetro
    public GradeBook(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.println("Bem-vindo ao GradeBook do curso: " + getCourseName() + "!");
    }
}