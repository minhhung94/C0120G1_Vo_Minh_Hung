package nhap.Hoc;

public class HocXuLyStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<100;i++){
            builder.append("Phần tử thứ "+i);
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }
}
