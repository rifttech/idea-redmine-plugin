package com.github.rifttech.idearedmineplugin.services

import com.github.rifttech.idearedmineplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
