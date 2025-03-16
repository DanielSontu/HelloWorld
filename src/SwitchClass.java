public class SwitchClass {
    public static void main(String[] args) {

        char phoneticAlpha = 'B';

        switch (phoneticAlpha) {
            case 'A':
                System.out.print("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.print("Letter " + phoneticAlpha + " was not Found ");
        }
    }
}
