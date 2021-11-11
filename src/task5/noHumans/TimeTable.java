package task5.noHumans;

import task5.humans.Teacher;
import task5.noHumans.Audience;
import task5.noHumans.DayOfWeek;
import task5.noHumans.Group;
import task5.noHumans.TimeOfLesson;

public class TimeTable {
    private DayOfWeek dayOfWeek;
    private Group group;
    private TimeOfLesson timeOfLesson;
    private Audience audience;
    private Teacher teacher;

    public TimeTable(DayOfWeek dayOfWeek, Group group, TimeOfLesson timeOfLesson,
                     Audience audience, Teacher teacher) {
        this.dayOfWeek = dayOfWeek;
        this.group = group;
        this.timeOfLesson = timeOfLesson;
        this.audience = audience;
        this.teacher = teacher;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public Group getGroup() {
        return group;
    }

    public TimeOfLesson getTimeOfLesson() {
        return timeOfLesson;
    }

    public Audience getAudience() {
        return audience;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}