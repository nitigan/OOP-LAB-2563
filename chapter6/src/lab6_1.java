package chapter6.src;

public class lab6_1 {
    int X[] = new int[10]; // declare and allocate array
    int Y[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    final int Array_Size = 10;
    int Z[]; // declare array
    public static void main(String[] args) {
        lab6_1 obj = new lab6_1();
        obj.Z = new int[obj.Array_Size]; // allocate array
        // Initial value in array
        for(int i = 0 ; i < obj.X.length ; i++) obj.X[i] = i;
        for(int i = 0 ; i < obj.Z.length ; i++)
            obj.Z[i] += obj.X[i] * 5 + obj.Y[i];
        // Display output of array
        System.out.println("\tIndex \tArray X \tArray Y \tArray Z");
        for(int i = 0 ; i < obj.X.length ; i++) {
            System.out.print( "\t" + obj.X[i] + " \t\t" + obj.X[i]);
            System.out.println(" \t\t" + obj.Y[i] + " \t\t" + obj.Z[i] );
        }
    }
}
