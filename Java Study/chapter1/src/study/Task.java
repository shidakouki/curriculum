package study;

public class Task extends Calculator{
    public void doTask() {
        
        int plus1 = super.plus(10);
        int plus2 = super.plus(10,20);
        int plus3 = super.plus(10,20,30);
        
        System.out.println("plusメソッドの引数が一つの場合：" + plus1);
        System.out.println("plusメソッドの引数が二つの場合：" + plus2);
        System.out.println("plusメソッドの引数が三つの場合：" + plus3);
    }

}
