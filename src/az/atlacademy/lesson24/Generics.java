package az.atlacademy.lesson24;

public class Generics<T> {

    private T data;

    private String className;

    public Generics(T data, String className) {
        this.data = data;
        this.className = className;
    }

    public Generics(){

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Generics{" +
                "data=" + data +
                ", className='" + className + '\'' +
                '}';
    }
}
