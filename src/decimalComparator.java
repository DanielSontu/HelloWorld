public class decimalComparator {

        public static boolean areEqualByThreeDecimalPlaces(double a,double b){

            int inta = (int) (a * 1000);
            int intb = (int) (b * 1000);

            return inta==intb;


        }

    public static void main(String[] args) {
       System.out.print( areEqualByThreeDecimalPlaces(421,421));
    }
}
