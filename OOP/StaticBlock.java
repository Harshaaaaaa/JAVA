public class StaticBlock {
    public static void main(String[] args){
        System.out.println("Hello from main!");
        StaticBlock obj = new StaticBlock();
        run obj1 = new run();
        obj1.outside();
        obj1.outside();
    }
}
class run{
    static{
        System.out.println("Hello from static block!");
    }
    void outside(){
        System.out.println("Hello from ouside the main!");
    }
}