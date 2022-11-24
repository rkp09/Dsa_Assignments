package _12_opp.NestedInterface;

public class A {
    public interface nested{
        public boolean isOdd(int n);
    }
}


class B implements A.nested{

    @Override
    public boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
