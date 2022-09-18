public class Access_modifiers {
    public static class Student
    {
        private int id;
        private String name;
        
        public void setID(int id){
            id=id;
        }
        public void setName(String name){
            name=name;
        }
        public int getID(){
            return id;
        }
        public String getName(){
            return name;
        }
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.setID(12);
        s1.setName("Rahul");
        System.out.printf("Students's Id is: %d\nStudent's Name is: %s\n",s1.getID(), s1.getName());
    }
}
