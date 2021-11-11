//package HomeWork13;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//public class Father implements IHumanObserver {
//    private final String whoAmI = "Папа";
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
//
//    }
//
//    @Override
//    public void enterToGarden(LocalDate date, int age, float weight, int height, String place) {
//        System.out.println(whoAmI + ": Очень трогательно, надо сфотографироваться на память.");
//
//    }
//
//    @Override
//    public void enterToSchool(LocalDate date, int age, boolean reading,
//                              boolean writing, int height, float weight, String place) {
//        if (reading && writing){
//            System.out.println(whoAmI + ": Будущий медалист!!!");
//        }else if (reading){
//            System.out.println(whoAmI + ": Читать умеет, сказали, что писать можно и не уметь.");
//        }else {
//            System.out.println(whoAmI + ": Что-то я переживаю, рано в школу , наверно, пошли.");
//        }
//
//    }
//
//    @Override
//    public void buyDog(int ageOfChild, Breed breed, int ageOfDog,
//                       String colorOfDog, boolean character) {
//        if (character){
//            System.out.println(whoAmI + ": Хорошо, что мы ребёнку собаку купили, " +
//                    "они станут отличными друзьями.");
//        }else {
//            System.out.println(whoAmI + ": этого злобного пса надо куда-то деть," +
//                    " он же пугает ребёнка!");
//        }
//
//    }
//
//    @Override
//    public void enterToUniversity(LocalDate date, int age, String place,
//                                  String nameOfUniversity, String nameOfFaculty, boolean examGrade) {
//        if (examGrade) {
//            System.out.println(whoAmI + ": Так держать!Молодец!");
//
//        } else {
//
//        }System.out.println(whoAmI + ": Может, ВУЗ попроще выбрать или факультет другой?");
//    }
//
//    @Override
//    public void getJob(int age, boolean work, String place, boolean salary) {
//        if (work && salary){
//            System.out.println(whoAmI + ": Ну, какая должность такая и зарплата, молодец!!!");
//        }else if (work){
//            System.out.println(whoAmI + ": Опыта наберёшься, а там и зарплату повысят.");
//        }else {
//            System.out.println(whoAmI + ": Ну, какая должность такая и зарплата.");
//        }
//    }
//
//    @Override
//    public void makeWedding(LocalDate date, int age, String place, double cost) {
//        System.out.println( whoAmI + ": С детьми не торопитесь, для себя поживите.");
//
//    }
//
//    @Override
//    public void getFirstChild(LocalDateTime time, String place, float weight, int height) {
//        System.out.println(whoAmI +": Рановато вы, ну что ж, поздравляю!!");
//    }
//
//    @Override
//    public void getSecondChild(LocalDateTime time, boolean gender, String place, float weight, int height) {
//        System.out.println(whoAmI + ": Ну вы даёте!");
//    }
//
//
//    @Override
//    public void onDeath(LocalDateTime deathTime, String causeOfDeath) {
//
//    }
//
//}
