public class pack{
     
    public static void main(String[] args){
        //static is used for properties that does not change depending on the object. Can be accessed and called without an object
        //static methods belong to the class and not to the object.
        //static method cannot use this or super keyword.
        //inside a static method, non-static methods cannot be used. why? because static methods do not depend on an object but non-static methods does.(vise-versa not true)
        //for eg: the population remains constant for all humans regardless of who checks the populations.
        //these properties should be static.
        //to access static variable use class name.
        //for eg: instead of this. use Human. (Remember class name starts with a capital letter).
        //greeting(); --> error
        pack obj = new pack();
        obj.greeting();
        reply();
    }
    static void reply(){
        //greeting(); --> error
        System.out.println("HELLO!!!");
        pack obj = new pack();
        obj.greeting();
    }
    void greeting(){
        System.out.println("Heyyyy!");
    }
}

