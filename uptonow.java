// method overloading

//int gg(){
//return 1;
//}
//int gg(int roll){
//class Ok{
//roll = roll +1;
//return roll;
//}
//int gg(int roll, int id){
//int p;
//p = roll + id;
//return p;
//}
//}
//public class Work {
//public static void main(String[] args){
//Ok k = new Ok();
//System.out.println(k.gg());
//System.out.println(k.gg(12));
//System.out.println(k.gg(12, 2));
//}
//}

 

 //Constructer overloading

 //class nice{
 //nice(){
 //System.out.println("you are first one");
 
 //nice(int roll, int base){
 //System.out.println(roll + base);
 //public class Work {
 //public static void main(String[] args){
 //nice op = new nice();
 //System.out.println(op);
 //nice kk = new nice(12,34);
 //}
 //}
 //}
 //}
 //}



 //This keyword use

 //class blue {
 //blue(){
 //this(10);
 //System.out.println("default");
 //}
 //blue(int net){
 //System.out.println("nice :" + net);
 //}
 //int color(){
 //return this.color(30)
 //}
 //int color(int net){
 //return net;
 //
 //}
 //public class Work{ 
 //public static void main(String[] args){
 //red ulti = new red();
 //System.out.println(ulti.color());
 

 //Access modifier

 //class me{
 //   private int id;
 //   private int age;

 //   public void setid(int i){
 //       id = i;
 //   }

 //   public int getid(){
 //       return id;

 //   }

 //}
 //public class uptonow{
//public static void main(String[]args) {
 //   me p = new me();
 //   p.setid(5);
 //   System.out.println(p.getid());
 //}
 //}
 //}
 //}
 //}


 // Inheritence

//class Vehicle{
//    public int seats;
//    public String color;
//}
//
//class car extends Vehicle{
//    public void setSeats(int w){
//        seats = w;
//    }
//
//    public void setColor(String c){
//        color = c;
//    }
//} 
//
//public class uptonow {
//    public static void main(String []args){
//        car myCar = new car();
//        c.setSeats(4);
//        c.setColor("Red");
//        System.out.println("Seats:  "+ c.seats);
//        System.out.println("Color:" + c.color);
//    }
//}
//


//Super  keyword
//class Parent extends Object{
//  int rollNo;
//Parent (){
//
//   System.out.println("Parent constructor");
// }
//
//Parent(int newRollNo){
//
//   System.out.println("Parent Roll No: " + newRollNo);
//   }
//
// public void hello(){
//    System.out.println("Parent Method");
// }
//
//}
//
//class  Child extends Parent{
//
//    int rollNo;
//    Child(){
//         super(); Output: Parent Constructor
//        super(10); // Output: Parent Roll No: 10
//        super.hello();
//    }
//
//    Child (int newRollNo){
//         super();
//        System.out.println("Child Roll No: " + newRollNo);
//    }
//
//    
//}
//
//public class Super {
//    public static void main(String[] args) {
//        Child c = new Child();
//        Child c2 = new Child(10);
//    }
//}


//Protected !!

//public class Mymath {
// public int factorial (int n) {
//    int fact = 1;
//
//    for (int i = 1; i <= n; i++) {
//        fact *= i;
//    }
//    return fact;
// }
//
// protected int sum(int a, int b) {
// return a + b;
// }
//}
//
//Protected !!
//
//public class Mymath {
// public int factorial (int n) {
//    int fact = 1;
//
//    for (int i = 1; i <= n; i++) {
//        fact *= i;
//    }
//    return fact;
// }
//
// protected int sum(int a, int b) {
// return a + b;
// }
//}
//

// Package !!

//import pack.Mymath {
// class Package extends Mymath{
//    public static void main(String[] args) {
//        Mymath m = new Mymath();
//
//        Package a = new Package();
//
//         System.out.println( "Protected Sum: " +a.sum(12, 13));
//    
//        System.out.println("Public Factorial: " + m.factorial(5))
//    }
// }
//}