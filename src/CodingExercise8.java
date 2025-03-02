public class CodingExercise8 {


    public static boolean hasTeen(int param1, int param2, int param3) {
        if (param1 >= 13 && param1 <= 19) {
            return true;
        }
        if (param2 >= 13 && param2 <= 19) {
            return true;
        }
        if (param3 >= 13 && param3 <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int param1) {
        return param1 >= 13 && param1 <= 19;
    }
}

//EXAMPLES OF INPUT/OUTPUT:
//hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
//hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
//hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19