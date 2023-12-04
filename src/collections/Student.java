package collections;
import java.util.*;
public class Student implements Comparable{
        private Integer code;
        private String firstName;
        private String email;

        public Student() {
            super();
        }
        public Student(Integer code, String firstName, String email) {
            super();
            this.code = code;
            this.firstName = firstName;
            this.email = email;
        }
        public Integer getCode() {return code;}

        public void setCode(Integer code) {this.code = code;}

        public String getFirstName() {	return firstName;}

        public void setFirstName(String firstName) {this.firstName = firstName;}
        public String getEmail() {return email;}
        public void setEmail(String email) {
            this.email = email;	}


        @Override
        public boolean equals(Object obj) {
            Student st=(Student)obj;
            return this.code.equals(st.code)  &&  this.firstName.equals(st.firstName)&&
                    this.email.equals(st.email);
        }
        @Override
        public int hashCode() {
            return this.code.hashCode()+this.firstName.hashCode()+this.email.hashCode();
        }
        @Override
        public int compareTo(Object o) {
            Student st=(Student)o;
            // TODO Auto-generated method stub
            if( this.code.compareTo(st.code)!=0)
                return this.code.compareTo(st.code);
            if( this.firstName.compareTo(st.firstName)!=0)
                return this.firstName.compareTo(st.firstName);

            return this.email.compareTo(st.email);
        }

public static void main(String[] args){
        Student a=new Student(123,"Angella","angella2023@gmail.com");
        Student b=new Student(123,"Angella","angella2023@gmail.com");
        Student c=a;
        Student d=new Student(121,"Aimable","aimableb@gmail.com");
        Student e=new Student(125,"Claude","amaclau@gmail.com");
        Student f=new Student(122,"Manzi","manzi@gmail.com");
        Student g=new Student(121,"Aimable","baimable@gmail.com");
        ArrayList<Student> students=new ArrayList<Student>();
        students.add(a);
        students.add(b);
        students.add(d);
        students.add(e);
        students.add(f);
        students.add(g);
        Collections.sort(students);
        System.out.println(students.size());
        for(Student st:students){
        System.out.println(st.getCode()+" "+st.getFirstName()+" "+st.getEmail());
        }
        }
}
