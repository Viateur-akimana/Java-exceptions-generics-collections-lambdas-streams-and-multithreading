package equality;

public class Equality {
    public static void main(String[] args){
//        Integer a=new Integer(123);
//        Integer b = new Integer(123);
//        Integer c=a;
        String a= new String("hello");
        String b = new String("hello");
        String c = a;
        if(a == b){
            System.out.println("a and b references the same object in the memory");
        }
        else {
            System.out.println("A and B are diffrent");
        }
        if(a == c){
            System.out.println("a and c refennces the same object in the meomry");
            System.out.println("a Hashcode" + a.hashCode() + " c Hashccode" + c.hashCode());
        }
        else{
            System.out.println("They are different");
        }
//        if(a.equals(c)){
//            System.out.println("a and c refennces the same object in the meomry");
//            System.out.println("a Hashcode" + a.hashCode() + " c Hashccode" + c.hashCode());
//        }
//        else{
//            System.out.println("They are different");
//        }
       if(a.equals(b)){
            System.out.println("a and b have the sane content");
        }else{
            System.out.println("THey have different content");
        }
    }
}
