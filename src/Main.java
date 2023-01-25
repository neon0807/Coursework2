import exception.IncorrectArgumentException;
import task.MonthlyTask;
import task.OneTimeTask;
import task.TaskService;
import task.WeeklyTask;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static type.Type.PERSONAL;
import static type.Type.WORK;

public class Main {
    public static void main(String[] args) throws IncorrectArgumentException {
        System.out.println("Hello world!");

        WeeklyTask weeklyTask1 = new WeeklyTask("1 ",WORK,LocalDateTime.of(2023,11,11,11,11),"1");
        WeeklyTask weeklyTask2 = new WeeklyTask("2",WORK,LocalDateTime.of(2023,1,30,11,11),"1");
        OneTimeTask oneTimeTask1 = new OneTimeTask("1",WORK,LocalDateTime.of(2023,2,20,22,22),"3");
        MonthlyTask monthlyTask1 = new MonthlyTask("1",PERSONAL,LocalDateTime.of(2023,11,11,11,11),"2");






        }
}
