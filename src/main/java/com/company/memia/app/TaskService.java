package com.company.memia.app;

import com.company.memia.entity.User;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private DataManager dataManager;

    public User findLeastBusyUser() {
        String queryString = "select u, count(t.id)  from User u left outer join Task_ t  on u = t.assignee  group by u order by count(t.id)";
        User user = dataManager.loadValues(queryString).properties("user", "tasks").list().stream().map(e -> e.<User>getValue("user")).findFirst().orElseThrow(IllegalStateException::new);
        return user;
    }
}