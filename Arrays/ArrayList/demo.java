package Arrays.ArrayList;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        // in ArrayList we store objects /wrapper class
        // (String,Integer,Boolean,Double,Character...) and
        // not the primitive type(int,boolean,char,double....)
        // these wrapper classes are part of java.lang
        // like java.lang.Integer
        // but we dont need to import java.lang because it is a by default package
        ArrayList<Integer> num = new ArrayList<>();

        // to add
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(0, 5); // add element at specific index and all the other elements will shift
                       // automatically

        // in ArrayList we don't need to change it string or make a loop to access it's
        // elements like in normal Array
        System.out.println(num); // [5,1,2,3,4]

        // to create copy of original ArrayList without affecting the original (Shallow
        // Copy)
        ArrayList<Integer> newList = new ArrayList<>(num);
        // update an element in a specific index
        newList.set(0, 67);
        System.out.println("new: " + newList);

        // loop through ArrayList
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " ");
        }
    }
}
