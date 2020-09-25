package CaseStudy.Common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileFactory {
    public static <T>boolean luuFile(ArrayList<T> listT, String path){
        try
        {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listT);
            oos.close();
            fos.close();
            return true;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    public static <T> ArrayList<T> docFile(String path){
        ArrayList<T> listT=new ArrayList<>();
        try
        {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream (fis);
            Object data = ois.readObject();
            listT= (ArrayList<T>) data;
            ois.close();
            fis.close();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return listT;
    }

}
