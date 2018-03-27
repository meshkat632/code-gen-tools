package org.codgen.tools;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.codgen.tools.HelloWorld;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import static org.junit.Assert.*;

import org.codgen.tools.DemoTask;


public class HelloWorldTest {
    @Test
    public void greet_the_user() {
        String greeting = "Hello World!";
        HelloWorld helloWorld = new HelloWorld(greeting);

        String actualGreeting = helloWorld.greet();

        assertThat(actualGreeting, is(greeting));
    }
    
    
    @Test
    public void demo_plugin_should_add_task_to_project() {
        Project project = ProjectBuilder.builder().build();        
        project.getPlugins().apply("GeneratorPlugin");        
        assertTrue(project.getTasks().getByName("gen") instanceof DemoTask);
    }   
    
}
