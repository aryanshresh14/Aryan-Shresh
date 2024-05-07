//interface blueprint of class

//class blueprint of object

//object interface of class

/**
 * syntax
 * 
 * interface interfaceName{
 * methods
 * }
 * 
 * interface IAnimal
 * public abstract void speak();
 * public abstract voud walk();
 * 
 * 
 * //rule
 * mysql
 * oracle
 * postgress
 * sybase
 * redis
 * 
 * 
 *
*/

interface IAnimal{
    void speak();
    void walk();
}

class Cat implements IAnimal {
    public void walk(){
        System.out.println("Cat walks with 4 leg");
    }

    public void speak(){
        System.out.println("Meow");
    }
}

class Human implements IAnimal {
    public void walk(){
        System.out.println("Human walks with 2 legs");
    }

    public void speak(){
        System.out.println("Human makes necessary noise");
    }

}
public class Interfaceexample2 {
    public static void main(String[] args) {
        IAnimal c = new Cat();
        c.speak();
        c.walk();

        IAnimal h = new Human();
        h.speak();
        h.walk();

    }
}