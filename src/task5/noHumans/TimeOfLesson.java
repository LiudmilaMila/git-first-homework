package task5.noHumans;

public enum TimeOfLesson {
    FIRST("8:00"),
    SECOND("9:30"),
    THIRD("11:00"),
    FOURTH("12:40");

    private String startOfLesson;

    TimeOfLesson(String startOfLesson) {
        this.startOfLesson = startOfLesson;
    }

    public String getStartOfLesson() {
        return startOfLesson;
    }
}