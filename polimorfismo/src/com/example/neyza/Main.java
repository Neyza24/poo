package com.example.neyza;

public class Main {
    public static void main(String[] args) {
        //Con polimorfismo va ejecutar los métodos sobre escritos en las sub clases
        /*
        Animal animal = new Cat();
        animal.eat();
        animal.sleep();
        animal.attack();
         */
        Animal [] animals = new Animal[4];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        for(Animal a : animals) {
            a.eat();
        }
    }
}

/*Animal is eating
Dog is eating
Cat is eating
Dog is eating
 */