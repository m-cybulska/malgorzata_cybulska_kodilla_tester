package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "To do";
    private static final String DESCRIPTION = "Things to do";

    @Test
    void testTaskListRepositoryFindByName() {


        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);


        List<TaskList> readTaskLists = taskListRepository.findByListName(LISTNAME);


        Assertions.assertFalse(readTaskLists.isEmpty());
        Assertions.assertEquals(1, readTaskLists.size());
        Assertions.assertEquals(LISTNAME, readTaskLists.get(0).getListName());
        Assertions.assertEquals(DESCRIPTION, readTaskLists.get(0).getDescription());


        int id = readTaskLists.get(0).getId();
        taskListRepository.deleteById(id);
    }
}