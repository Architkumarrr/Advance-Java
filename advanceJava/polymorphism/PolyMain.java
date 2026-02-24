package polymorphism;

public class PolyMain {
    public static void main(String[] args) {
        Animal dog=new Animal("Dog","Woof");
        dog.getInfo();
        dog.getInfo("Dog","Woof","4");
    }
}
class Animal{
    String name;
    String sound;
    Animal(String name,String sound){
        this.name=name;
        this.sound=sound;

    }
    void getInfo(){
        System.out.println("Name ="+name);
        System.out.println("Sound ="+sound);
    }
    void getInfo(String name,String sound,String Legs){
        System.out.println("Name ="+name);
        System.out.println("Sound ="+sound);
        System.out.println("Legs ="+Legs);
    }
}

