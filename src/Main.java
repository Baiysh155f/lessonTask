public class Main {
    public static void main(String[] args) {
        Student student = new Student("Baiysh Orozaliev", 22);
        System.out.printf(student.getFullName()+"\n"+student.getAge());
        System.out.println("\n=============================");
        Inctructor inctructor = new Inctructor("Ayjamal Asangazieva", 18);
        System.out.printf(inctructor.getFullName()+"\n"+inctructor.getAge());

    }
}