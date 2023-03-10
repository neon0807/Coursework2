package task;

import task.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskService  {


    private final Map<Integer, Task> taskMap;

    private final Collection<Task> removedTasks;

    public TaskService(){
        this.taskMap = new HashMap<>();
        this.removedTasks = new ArrayList<>();
    }

    public void AddTask(Task task){
        taskMap.put(task.getId(), task);
    }

    public void RemoveTask(int id){
        removedTasks.add(taskMap.get(id));
        taskMap.remove(id);
    }


    public Collection<Task> getAllByDate(LocalDate localDate){
        return taskMap.values().stream().filter(task -> task.appearsln(localDate))
                .collect(Collectors.toList());

    }
}
