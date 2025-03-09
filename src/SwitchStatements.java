public class SwitchStatements {
    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.print("Value was 7");
                break;
            case 2:
                System.out.print("Value was 2");
               break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, a 4, or a 5 ");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.print("Was not 1, 2, 3, 4 or 5");
                break;
        }
    }
}


  /* int value = 1;
            if (value == 1){
            System.out.print("Value was 1");
        } else if (value ==2) {
            System.out.print("Value was 2");
            }else {
            System.out.print("Value was not 1 or 2");

        }
    }
}
*/