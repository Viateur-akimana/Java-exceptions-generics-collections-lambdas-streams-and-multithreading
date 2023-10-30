package rw.ac.rca.exc;

class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int  a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            System.out.println("Generic Exception catch.");
        }
        /*
         * This catch is never reached because ArithmeticException is a subclass of
         * Exception.
         */
        catch (Exception e) { // ERROR-Unreachable
            System.out.println("This is never reached.");
        }
    }
}


