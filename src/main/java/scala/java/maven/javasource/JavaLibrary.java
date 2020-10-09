package scala.java.maven.javasource;

public class JavaLibrary {
    private String name;
    public JavaLibrary(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JavaLibrary{" +
                "name='" + name + '\'' +
                '}';
    }
}
