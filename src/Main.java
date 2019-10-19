import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringsFunction();
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


    private static void StringsFunction(){
        String firstText = "The First String";
        String firstText2 = "The First String";
        String firstText3 = "the first string";
        String secondText = "The Second String";

        // ==
        if(firstText == firstText2) System.out.println("== true");

        if(firstText.equals(firstText2)) System.out.println("Equals true");
        if(firstText.equalsIgnoreCase(firstText2)) System.out.println("Equals Case In Sensitive");
    }
}
