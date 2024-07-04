package az.atlacademy.lesson19.enumtask;

public enum Size {

    SMALL(22),
    MEDIUM(35),
    LARGE(45),
    DIZEL(100),
    AI92(110),
    AI95(160);

    private int num;

    Size(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
