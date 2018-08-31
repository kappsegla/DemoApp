package se.iths.martin;


public class Arrays {

    public static int[] createArray(int x) {
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(  java.util.Arrays.toString(array) );

//        System.out.print("[");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//            if( i < array.length - 1 )
//                System.out.print(",");
//        }
//        System.out.println("]");
    }

    public static int[] doubleUpArray(int[] array){
        int[] doubleArray = new int[array.length * 2];
        


    }


    public static void main(String[] args) {

        int[] arr = createArray(10);
        printArray(arr);


//
//
//        int[] intArray = new int[7];
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = 0;
//        }
//
//        intArray[3] = 10;
//        for (int value : intArray) {
//            System.out.println(value);
//        }
//
//        String[] names2 = {"Meny alterntiv", "Svars alternativ", "Mata in ett tal"};
//
//        for (String text : names2) {
//            System.out.println(text);
//        }


//        System.out.println(intArray);
//        System.out.println( intArray[3] );
//        intArray = new int[10];
//        System.out.println(intArray);
//
//        int[] array2 = intArray;
//        System.out.println(array2);

//        System.out.println( intArray[3] );
//
//        int antal = 3;
//
//        String[] names = new String[antal];
//        names[0] = "Kalle";
//        names[1] = "Pelle";
//        names[2] = "Stina";
//
//        //Short version of Array creation and initialization
//        String[] names2 = {"Meny alterntiv", "Svars alternativ", "Mata in ett tal"};
//
//        System.out.println( names2[0] );


    }
}
