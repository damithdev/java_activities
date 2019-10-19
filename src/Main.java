import java.util.ArrayList;
import java.util.List;

class TestClass{


    TestClass(){
        System.out.println("Im Here ");

    };

    TestClass(String str){
        System.out.println("Im Here " + str);
    };



    static String staticString ;
    String nonStaticString ;
    final String thefinalString = "FinalValue";
}


public class Main {

    public static void main(String[] args) {

        TestClass test = new TestClass();
        TestClass.staticString = "hello";
        test.nonStaticString = "Hello2";


        TestClass test2 = new TestClass("son");



    }

    private static void ArraysFunction(){
        System.out.println("Non-Primitive Data type Based!");

        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);

        myList.addAll(myList);


        for (int x: myList) {
            System.out.println("Value :" + x);
        }

        System.out.println("Primitive Data type Based!");
        System.out.println("Single Dimentional Array!");

        int[] numberArray = {10,20,30};

        for (int x: numberArray) {
            System.out.println("Value :" + x);
        }


        System.out.println("Multi Dimentional Array!");

        int[][]  multiDimentionalArray =
                {{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        for (int[] singleArray: multiDimentionalArray) {
            for (int x: singleArray) {
                System.out.println("Value :" + x);
            }
        }
    }




    private static void testFunction(){
//

    }


    private static void StringsFunction(){
        String firstText = "The First String";
        String firstText2 = "The first String";
        String firstText3 = "the first string";
        String secondText = "The Second String";


        TestClass.staticString = "";



        TestClass test = new TestClass();
        test.nonStaticString = "";

        TestClass test2 = new TestClass();
        test2.nonStaticString = "";


        StringsFunction();
        // ==
//        if(firstText == firstText2) System.out.println("== true");
//
//        if(firstText.equals(firstText2)) System.out.println("Equals true");
//        if(firstText.equalsIgnoreCase(firstText2)) System.out.println("Equals Case In Sensitive");


        String testString = new String("The First String");

        if(firstText == testString){
            System.out.println("Success");
        }else{
            System.out.println("Failed");

        }

        if(firstText.equals(testString)){
            System.out.println("Success");
        }else{
            System.out.println("Failed");

        }

        String firstTextCopy = "The First String";


        if(firstText == firstTextCopy){
            System.out.println("Success");
        }else{
            System.out.println("Failed");

        }

        if(firstText.equals(firstTextCopy)){
            System.out.println("Success");
        }else{
            System.out.println("Failed");

        }
    }
}
