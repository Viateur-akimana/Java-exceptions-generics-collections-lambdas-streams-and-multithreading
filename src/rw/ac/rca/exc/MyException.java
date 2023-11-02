package rw.ac.rca.exc;

class MyException extends Exception {
    private int detail;
    MyException(int a) {
        detail = a;
    }
    public String toString() {
        return "MyException [" + detail + "]";
    }}
class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Called compute(" + a + ")");
        if (a > 20)
            throw new MyException(a);
        System.out.println("You are Rwandan");
    }
    public static void main(String[] args) {
        try {
            compute(3);
            compute(90);
        } catch (MyException e) {
            System.out.println("Caught " + e);
        }}}
