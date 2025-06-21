public class StaticEx {
    //instance
    static int num;
    //static variable
    static int val;

    public static void main(String[] args) {

        val=10;
        System.out.println(val);
        StaticEx ex = new StaticEx();
        StaticEx.num=20;
        System.out.println(StaticEx.num);
        StaticEx.val=30;
        System.out.println(StaticEx.val);
        StaticEx staticEx1 = new StaticEx();
        System.out.println(staticEx1.val);
    }
}
