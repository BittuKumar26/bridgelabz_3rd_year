package Inheritance;

class BaseFragile {
    void calculate() { System.out.println("Base calculation"); }
}

class SubFragile extends BaseFragile {
    @Override void calculate() { System.out.println("Sub calculation"); }
}

public class FragilDemo {
    public static void main(String[] args) {
        BaseFragile b = new SubFragile();
        b.calculate();
    }
}
