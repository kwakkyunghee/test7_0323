package kr.hs.study;

public class TestBean {
    private int a;
    private int b;
    private int c;

    public TestBean(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void prData(){
        if(a+b>c){
            System.out.println("삼각형입니다");
        }
        else System.out.println("삼각형이 아닙니다");
    }
}
