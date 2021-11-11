package HomeWork13;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IHumanObserver {

    void onBirth(BirthParams params);

    void enterToGarden(GardenParams params);

    void enterToSchool(SchoolParams params);

    void buyDog(DogParams params);

    void enterToUniversity(UniversityParams params);

    void getJob(JobParams params);

    void makeWedding(WeddingParams params);

    void getFirstChild(FirstChildParams params);

    void getSecondChild(SecondChildParams params);

    void onDeath(DeathParams params);

    class BirthParams {
        LocalDateTime aBirthTime;
        boolean genderMale;
        float weight;
        int height;
        String location;

        public BirthParams(LocalDateTime aBirthTime,
                           boolean genderMale, float weight,
                           int height, String location) {
            this.aBirthTime = aBirthTime;
            this.genderMale = genderMale;
            this.weight = weight;
            this.height = height;
            this.location = location;
        }
    }

    class GardenParams {
        LocalDate date;
        int age;
        float weight;
        int height;
        String place;

        public GardenParams(LocalDate date, int age, float weight, int height, String place) {
            this.date = date;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.place = place;
        }
    }

    class SchoolParams {
        LocalDate date;
        int age;
        boolean reading;
        boolean writing;
        int height;
        float weight;
        String place;

        public SchoolParams(LocalDate date,
                            int age, boolean reading,
                            boolean writing, int height,
                            float weight, String place) {
            this.date = date;
            this.age = age;
            this.reading = reading;
            this.writing = writing;
            this.height = height;
            this.weight = weight;
            this.place = place;
        }
    }

    class DogParams {
        int ageOfChild;
        Breed breed;
        int ageOfDog;
        String colorOfDog;
        boolean character;

        public DogParams(int ageOfChild,
                         Breed breed,
                         int ageOfDog,
                         String colorOfDog,
                         boolean character) {
            this.ageOfChild = ageOfChild;
            this.breed = breed;
            this.ageOfDog = ageOfDog;
            this.colorOfDog = colorOfDog;
            this.character = character;
        }
    }

    class UniversityParams {
        LocalDate date;
        int age;
        String place;
        String nameOfUniversity;
        String nameOfFaculty;
        boolean examGrade;

        public UniversityParams(LocalDate date,
                                int age,
                                String place,
                                String nameOfUniversity,
                                String nameOfFaculty,
                                boolean examGrade) {
            this.date = date;
            this.age = age;
            this.place = place;
            this.nameOfUniversity = nameOfUniversity;
            this.nameOfFaculty = nameOfFaculty;
            this.examGrade = examGrade;
        }
    }

    class JobParams {
        int age;
        boolean work;
        String place;
        boolean salary;

        public JobParams(int age, boolean work, String place, boolean salary) {
            this.age = age;
            this.work = work;
            this.place = place;
            this.salary = salary;
        }
    }

    class WeddingParams {
        LocalDate date;
        int age;
        String place;
        double cost;

        public WeddingParams(LocalDate date, int age, String place, double cost) {
            this.date = date;
            this.age = age;
            this.place = place;
            this.cost = cost;
        }
    }

    class FirstChildParams {
        LocalDateTime time;
        String place;
        float weight;
        int height;

        public FirstChildParams(LocalDateTime time, String place, float weight, int height) {
            this.time = time;
            this.place = place;
            this.weight = weight;
            this.height = height;
        }
    }

    class SecondChildParams {
        LocalDateTime time;
        boolean gender;
        String place;
        float weight;
        int height;

        public SecondChildParams(LocalDateTime time,
                                 boolean gender,
                                 String place,
                                 float weight,
                                 int height) {
            this.time = time;
            this.gender = gender;
            this.place = place;
            this.weight = weight;
            this.height = height;
        }
    }

    class DeathParams {
        LocalDateTime deathTime;
        String causeOfDeath;

        public DeathParams(LocalDateTime deathTime, String causeOfDeath) {
            this.deathTime = deathTime;
            this.causeOfDeath = causeOfDeath;
        }
    }
}
