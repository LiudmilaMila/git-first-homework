package HomeWork13;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Human {
    private IHumanObserver[] observers;


    public void setObservers(IHumanObserver[] observers) {
        this.observers = observers;
    }

    public void runLife() {
        doBirth();
        System.out.println("-----------------------------------------------------");
        doEnterToGarden();
        System.out.println("-----------------------------------------------------");
        doEnterToSchool();
        System.out.println("-----------------------------------------------------");
        doBuyDog();
        System.out.println("-----------------------------------------------------");
        doEnterToUniversity();
        System.out.println("-----------------------------------------------------");
        doGetJob();
        System.out.println("-----------------------------------------------------");
        doMakeWedding();
        System.out.println("-----------------------------------------------------");
        doGetFirstChild();
        System.out.println("-----------------------------------------------------");
        doGetSecondChild();
        System.out.println("-----------------------------------------------------");
        doDeath();
    }

    private void doBirth() {
        final boolean genderMale = Math.random() > 0.5;
        final LocalDateTime birthTime = LocalDateTime.of(2011, 10,
                2, 16, 33);
        for (IHumanObserver observer : observers) {
            observer.onBirth(new IHumanObserver.BirthParams(birthTime,
                    genderMale,
                    3.56f,
                    54,
                    "Харьков, роддом № 7 "));
        }
    }

    private void doEnterToGarden() {
        final LocalDate date = LocalDate.of(2014, 9, 1);
        for (IHumanObserver observer : observers) {
            observer.enterToGarden(new IHumanObserver.GardenParams(
                    date, 3, 9.3f, 98, "Харьков, садик № 27"));
        }
    }

    private void doEnterToSchool() {
        final LocalDate date = LocalDate.of(2017, 9, 1);
        final boolean reading = Math.random() > 0.5;
        final boolean writing = Math.random() > 0.5;

        for (IHumanObserver observer : observers) {
            observer.enterToSchool(new IHumanObserver.SchoolParams(
                    date,
                    6,
                    reading,
                    writing,
                    102,
                    18,
                    "Харьков, школа №112"));
        }
    }

    private void doBuyDog() {
        final boolean character = Math.random() > 0.5;
        for (IHumanObserver observer : observers) {
            observer.buyDog(new IHumanObserver.DogParams(9,
                    Breed.ПУДЕЛЬ,
                    1,
                    "чёрный",
                    character));
        }
    }

    private void doEnterToUniversity() {
        final boolean examGrate = Math.random() > 0.5;
        final LocalDate date = LocalDate.of(2027, 9, 1);
        for (IHumanObserver observer : observers) {
            observer.enterToUniversity(new IHumanObserver.UniversityParams(date,
                    16,
                    "Харьков",
                    "ХПИ",
                    "Механический",
                    examGrate));
        }
    }

    private void doGetJob() {
        final boolean work = Math.random() > 0.5;
        final boolean salary = Math.random() > 0.5;
        for (IHumanObserver observer : observers) {
            observer.getJob(new IHumanObserver.JobParams(21, work,
                    "Лондон", salary));
        }
    }

    private void doMakeWedding() {
        final LocalDate date = LocalDate.of(2037, 7, 12);

        for (IHumanObserver observer : observers) {
            observer.makeWedding(new IHumanObserver.WeddingParams(
                    date, 26, "Харьков", 50000.00));
        }
    }

    private void doGetFirstChild() {
        final LocalDateTime date = LocalDateTime.of(2039, 12,
                9, 5, 14);
        for (IHumanObserver observer : observers) {
            observer.getFirstChild(new IHumanObserver.FirstChildParams(
                    date, "Харьков, роддом №3", 3.56f, 51));
        }
    }

    private void doGetSecondChild() {
        final boolean gender = Math.random() > 0.5;
        final LocalDateTime date = LocalDateTime.of(2041, 7,
                26, 7, 28);
        for (IHumanObserver observer : observers) {
            observer.getSecondChild(new IHumanObserver.SecondChildParams(
                    date, gender, "Харьков, роддом №3",
                    3.41f, 54));
        }
    }

    private void doDeath(){
        final LocalDateTime date = LocalDateTime.of(2080, 9,
                3, 14, 19);
        for (IHumanObserver observer : observers) {
            observer.onDeath(new IHumanObserver.DeathParams(date,"болезнь"));
        }
    }

}
