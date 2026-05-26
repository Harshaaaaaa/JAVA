//Create own datatype
//begin with capital letter 
//logical construct or template 

class Me{
    String name = "Harsha" ;
    String friend;
    int rating;

    public Me(String friend, int rating){
        this.friend = friend;
        this.rating = rating;
    }
    void changeName(String name){
        this.name = name;
    }
}

//object is an instance of a class
//the working of the class
//properties:State, Identity, Behaviour
//to create ojects use new keyword

public class Class{
    public static void main(String[] args){
        Me detail = new Me("Teena",100);  
        System.out.println(detail.rating);
        detail.changeName("Hello");
        System.out.println(detail.name);
    }
}

//Constructor what happens when object is being created
