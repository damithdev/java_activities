package Kingdom;

public class Dog  extends  Animal {



    Dog(int animalage){
        this.age = animalage;
    }

    private int age ;

    public int getAge() {
        return age;
    }




    public void sound(){
        System.out.println("Bark..");
    }
}


class test{
    public static void main(String[] args) {
        Dog d = new Dog(10);


    }
}

