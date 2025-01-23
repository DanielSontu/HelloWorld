public class CodingExercise2 {
    // write code here
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        } return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0){
            System.out.print("Invalid Value");
            return;
        }
        long MilesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + MilesPerHour + " mi/h");
    }
}
