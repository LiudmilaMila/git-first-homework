package HomeWork13;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        IHumanObserver observer;
        observer = new IHumanObserver() {
            @Override
            public void onBirth(BirthParams params) {
                System.out.println("onBirth");
            }

            @Override
            public void enterToGarden(GardenParams params) {
                System.out.println("enterToGarden");
            }

            @Override
            public void enterToSchool(SchoolParams params) {
                System.out.println("enterToSchool");
            }

            @Override
            public void buyDog(DogParams params) {
                System.out.println("buyDog");
            }

            @Override
            public void enterToUniversity(UniversityParams params) {
                System.out.println("enterToUniversity");
            }

            @Override
            public void getJob(JobParams params) {
                System.out.println("getJob");
            }

            @Override
            public void makeWedding(WeddingParams params) {
                System.out.println("makeWedding");
            }

            @Override
            public void getFirstChild(FirstChildParams params) {
                System.out.println("getFirstChild");
            }

            @Override
            public void getSecondChild(SecondChildParams params) {
                System.out.println("getSecondChild");
            }

            @Override
            public void onDeath(DeathParams params) {
                System.out.println("onDeath");
            }
        };
        Human human = new Human();
        human.setObservers(new IHumanObserver[]{
                observer,
//                new Mather(),
//                new Father(),
//                new GrandMother(),
//                new Partner(),
//                new FirstChild(),
//                new SecondChild()
        });
        human.runLife();
    }
}
