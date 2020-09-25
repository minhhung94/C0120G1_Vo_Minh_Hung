package B6.CauTrucDuLieuVaGiaiThuat.BaiTap.TrienKhaiArrayList;

public class TestMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Student a= new Student(1,"Quốc");
        Student b= new Student(2,"Thông");
        Student c= new Student(3,"Cường");
        Student d= new Student(4,"Hoà");
        Student e= new Student(5,"Long");
        Student f= new Student(6,"Long2");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();

        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
//        studentMyArrayList.add(f,2);
//        System.out.println("Số lượng học sinh là: "+ studentMyArrayList.size());
//        System.out.println("STT"+"\t"+"Tên");
//        for (int i = 0; i< studentMyArrayList.size(); i++){
//            Student student= (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getId() +"\t"+student.getName());
//
//        }
//        System.out.println(studentMyArrayList.contains(f));
        newMyArrayList=studentMyArrayList.clone();
        Student student=newMyArrayList.remove(1);
        System.out.println(student.getName());
//        for (int i = 0; i< newMyArrayList.size(); i++){
//            System.out.println(newMyArrayList.get(i).getName());
//
//        }
    }
}
