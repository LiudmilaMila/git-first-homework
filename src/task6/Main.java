package task6;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {

        Human human1 = new Human("Воеводов", 29, Eyecolor.BLUE, 1.70, 78.3);
        Human human2 = new Human("Дорохова", 17, Eyecolor.GREEN, 1.57, 47.00);
        Human human3 = new Human("Яковенко", 27, Eyecolor.BROWN, 1.75, 80.25);
        Human human4 =new Human("Воеводов", 29, Eyecolor.BLUE, 1.70, 78.3);

        System.out.println("Human1 equals Human2 ? " + human1.equals(human2));
        System.out.println("Human2 equals Human3 ? " + human2.equals(human3));
        System.out.println("Human3 equals Human4 ? " + human3.equals(human4));
        System.out.println("Human4 equals Human1 ? " + human4.equals(human1));

        System.out.println("Human1 equals Human1 ? " + human1.equals(human1));

        System.out.println("------------------------------------------------------------------");

        System.out.println("Human 1 = " + human1.hashCode());
        System.out.println("Human 2 = " + human2.hashCode());
        System.out.println("Human 3 = " + human3.hashCode());
        System.out.println("Human 4 = " + human4.hashCode());

        System.out.println("Human1 == Human2 ? " + (human1.hashCode() == human2.hashCode()));
        System.out.println("Human2 == Human3 ? " + (human2.hashCode() == human3.hashCode()));
        System.out.println("Human3 == Human4 ? " + (human3.hashCode() == human4.hashCode()));
        System.out.println("Human4 == Human1 ? " + (human4.hashCode() == human1.hashCode()));

        System.out.println("Human1 == Human1 ? " + (human1.hashCode() == human1.hashCode()));

        System.out.println("------------------------------------------------------------------");

        System.out.println("human1.toString():" + human1);
        System.out.println("human2.toString():" + human2);
        System.out.println("human3.toString():" + human3);
        System.out.println("human4.toString():" + human4);
    }
}
