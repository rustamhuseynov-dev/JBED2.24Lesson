package az.atlacademy.designPattern.factoryAndPrototype;

public class ProjectFactory {

    private final Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Object cloneProject(){
        return project.copy();
    }
}
