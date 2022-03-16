package com.company.memia.screen.task;

import io.jmix.ui.screen.*;
import com.company.memia.entity.Task;

@UiController("Task_.browse")
@UiDescriptor("task-browse.xml")
@LookupComponent("tasksTable")
public class TaskBrowse extends StandardLookup<Task> {
}