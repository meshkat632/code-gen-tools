package org.codgen.tools;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GeneratorPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getExtensions().create("codgenSetting", DemoPluginExtension.class);
        project.getTasks().create("gen", DemoTask.class);
        project.getTasks().create("gen-java-jaxb", DemoTask.class);
        project.getTasks().create("gen-java-jackson", DemoTask.class);
    }
}
