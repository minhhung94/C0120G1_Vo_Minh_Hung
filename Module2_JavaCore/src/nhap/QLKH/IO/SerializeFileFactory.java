package nhap.QLKH.IO;

import nhap.QLKH.Model.KhachHang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializeFileFactory {
    public static boolean luuFile(ArrayList<KhachHang> dsKH, String path)
    {
        try
        {
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(dsKH);
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
    public static ArrayList<KhachHang>docfile(String path)
    {
        ArrayList<KhachHang>dsKH=new ArrayList<KhachHang>();
        try
        {
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Object data=ois.readObject();
            dsKH=(ArrayList<KhachHang>) data;
            ois.close();
            fis.close();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return dsKH;
    }
}
