package TesteES;

public class GradeBookTest {

    public static void main(String[] args) {
        
        // Objeto 1: Usando construtor padrão
        GradeBook gradeBook1 = new GradeBook();
        System.out.println("Nome inicial do curso 1: " + gradeBook1.getCourseName());
        
        gradeBook1.setCourseName("Estrutura de Dados");
        gradeBook1.displayMessage();

        System.out.println();

        // Objeto 2: Usando construtor com parâmetros
        GradeBook gradeBook2 = new GradeBook("Desenvolvimento de Sistemas Orientados a Objetos");
        gradeBook2.displayMessage();
    }
}