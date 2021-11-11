package HomeWork13;

import java.time.LocalDate;
import java.time.LocalDateTime;

//public class Mather implements IHumanObserver {
//    private final String whoAmI = "Мама";
//
//
//    @Override
//    public void onBirth(LocalDateTime aBirthTime,
//                        boolean genderMale,
//                        float weight,
//                        int height,
//                        String location) {
//
//        if (genderMale) {
//            System.out.println(whoAmI + ": Ураааа!!! У меня мальчик");
//        } else {
//            System.out.println(whoAmI + ": Ураааа!!! У меня девочка");
//        }
//    }
//
//    @Override
//    public void enterToGarden(LocalDate date, int age, float weight, int height, String place) {
//        System.out.println(whoAmI + ": Надеюсь,нашего ребёнка там не будут обижать.");
//
//    }
//
//    @Override
//    public void enterToSchool(LocalDate date, int age, boolean reading,
//                              boolean writing, int height, float weight, String place) {
//        if (reading && writing) {
//            System.out.println(whoAmI + ": Не ребёнок, а вундеркинд. Его вообще можно было сразу в 5 класс.");
//        } else if (reading) {
//            System.out.println(whoAmI + ": Читать умеет, а писать его быстро научат.");
//        } else {
//            System.out.println(whoAmI + ": Ни читать ни писать еще не может, надо было еще год ждать.");
//        }
//
//    }
//
//    @Override
//    public void buyDog(int ageOfChild, Breed breed, int ageOfDog,
//                       String colorOfDog, boolean character) {
//        if (character) {
//            System.out.println(whoAmI + ": Отличная собака, будет верным другом семьи");
//
//        } else {
//
//        }System.out.println(whoAmI + ": Это не собака, это какой-то монстр!");
//    }
//
//    @Override
//    public void enterToUniversity(LocalDate date, int age, String place, String nameOfUniversity,
//                                  String nameOfFaculty, boolean examGrade) {
//        if (examGrade) {
//            System.out.println(whoAmI + ": Одна из лучших оценок за экзамен, горжусь.");
//
//        } else{
//
//        } System.out.println(whoAmI + ": Удивительно, что с такой оценкой вообще приняли.");
//    }
//
//    @Override
//    public void getJob(int age, boolean work, String place, boolean salary) {
//        if (work && salary){
//            System.out.println(whoAmI + ": Это же работа твоей мечты!Да еще и зарплата какая!");
//        }else if (work){
//            System.out.println(whoAmI + ": Зарплата, конечно, не очень, но зато это работа твоей мечты!");
//        }else {
//            System.out.println(whoAmI + ": Да уж, ну ничего, наберешься опыта и повысят.");
//        }
//    }
//
//    @Override
//    public void makeWedding(LocalDate date, int age, String place, double cost) {
//        System.out.println(whoAmI + ": С внуками не затягивай");
//    }
//
//    @Override
//    public void getFirstChild(LocalDateTime time, String place, float weight, int height) {
//        System.out.println(whoAmI + ": Поздравляю, уррааааа!!!");
//    }
//
//    @Override
//    public void getSecondChild(LocalDateTime time, boolean gender, String place, float weight, int height) {
//        System.out.println(whoAmI + ": Почти полноценная семья, давайте еще третьего.");
//    }
//
//
//    @Override
//    public void onDeath(LocalDateTime deathTime, String causeOfDeath) {
//
//    }
//}