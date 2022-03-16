package com.company.memia.screen.project;

import io.jmix.ui.screen.*;
import com.company.memia.entity.Project;

@UiController("Project.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
public class ProjectEdit extends StandardEditor<Project> {
}