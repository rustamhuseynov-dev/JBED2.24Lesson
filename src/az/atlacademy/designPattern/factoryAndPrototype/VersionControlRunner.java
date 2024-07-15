package az.atlacademy.designPattern.factoryAndPrototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        var project = new Project(1,"first commit to github","uber yango");
        var projectFactory = new ProjectFactory(project);
        var projectClone = projectFactory.cloneProject();
        System.out.println(projectClone);
        System.out.println(project);
    }
}
