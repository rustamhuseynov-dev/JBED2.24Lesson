package az.atlacademy.lesson24;

public class Box<T>{

    private boolean check;

    private T data;

    public Box(boolean check, T data) {
        this.check = check;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Box{" +
                "check=" + check +
                ", data=" + data +
                '}';
    }
}
