package First;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Павел", "Вакулич", 28);
        man.showInfo();
        System.out.println(man.getClass().getClassLoader());
        System.out.println(man.getClass());
    }
}