public class Main {
    public static void main(String[] args) {
//       Animal cat = new Cat();
//       cat.Cat();
//       Animal dog = new Dog();
//       dog.dog();

//        Bank bank = new A();
//        bank.GetBalance();
//        Bank bank1 = new B();
//        bank1.GetBalance();
//        Bank bank2 = new C();
//        bank2.GetBalance();



        Circle circle = new Circle(3);

        circle.calculatePerimeter();
        System.out.println();

        circle.calculateArea();
        System.out.println();


        Triangle triangle = new Triangle( 2,3,3);

        triangle.calculateArea();
        System.out.println();
        triangle.calculatePerimeter();



    }
}

