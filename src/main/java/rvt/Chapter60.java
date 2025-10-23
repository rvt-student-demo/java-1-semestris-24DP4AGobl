package rvt;

public class Chapter60 {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        ex5();
    }
    public static void ex1(){
        int[] val = {0, 1, 2, 3};

        int sum = val[0] + val[1] + val[2] + val[3];

        System.out.println("Sum of all the numbers = ");

    }
    public static void ex2() {
        int[] val = {13, -4, 82, 17};
        int[] twice = new int[4];
        
        System.out.println( "Og array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

        for (int i = 0; i < val.length; i++ ) {
            twice[i] = val[i] * 2;
        }

        System.out.println( "New Array: " + twice[0] + "" + twice[1] + " " + twice[2] + " " + twice[3] );
    }
    public static void ex3() {
        int[] valA = {13, -22, 82, 17};
        int[] valB = {-12, 24, -79, -13};
        int[] sum = {0, 0, 0, 0};

        for (int i = 0; i < sum.length; i++) {
            sum[i] = valA[i] + valB[i];
        }

        System.out.println("sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]);
    }
    public static void ex4() {
        int[] valA = {13, -22, 82, 17};
        int[] valB = {0, 0, 0, 0};

        for ( int i = 0; i < valA.length; i++) {
            valB[i] = 25 - valA[i];
        }

        System.out.println("valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3]);

        System.out.println("valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);
    
        System.out.println("sum: "
        + (valA[0] + valB[0]) + " " + (valA[1] + valB[1]) + " "
        + (valA[2] + valB[2]) + " " + (valA[3] + valB[3])
        );
    }
    public static void ex5() {
        int[] val = {0, 1, 2, 3};
        //int temp;
        //int[] reversed = val.clone();
        int[] temp = val.clone();

        System.out.println("Og array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);

        //Previous attempts, just to remember

        //for (int i = 0; i < val.length; i++) {
        //    temp = val.length - 1 - i; //works only in this case, only if the numbers in the list are one after another(1, 2, 3, 4, 5 etc.) because it uses the numbers from the for loop to add into the val array, otherwise it would replace the numbers from the array using the new ones and the list would look like 3 2 2 3
        //    val[i] = temp;             // Right unders this for loop I wrote code which works with any array using another temporary array
        //}

        //for (int i = 0; i < val.length; i++) {
        //    temp = val[val.length - 1 - i];
        //    reversed[i] = temp;
        //    System.out.println(temp);
        //}

        for (int i = 0; i < val.length; i++) {
            val[i] = temp[val.length - 1 - i];
        }

        System.out.println("Reversed Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
    }
}
