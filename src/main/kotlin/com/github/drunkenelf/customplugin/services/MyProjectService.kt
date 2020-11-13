package com.github.drunkenelf.customplugin.services

import com.intellij.openapi.project.Project
import com.github.drunkenelf.customplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
