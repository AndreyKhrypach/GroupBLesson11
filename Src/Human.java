public class Human {
    private int id;
    static int counter;

    //public static final double PI = 3.14;
    //final static public double PI = 3.14;
    //final public static double PI = 3.14;
   // public static double final PI = 3.14; // error after type
    public static final int NUM;

     static {
        NUM = 20;
        counter = 1;
        System.out.println("static load");
    }
    Human(){
        id = counter++;
        System.out.println("constructor load");
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}
