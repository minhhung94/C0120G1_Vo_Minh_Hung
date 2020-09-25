package TestCaseStudy.Test.Common;

import TestCaseStudy.Test.Model.House;
import TestCaseStudy.Test.Model.Villa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileFactory {
    public static boolean luuFileVilla(ArrayList<Villa> listVilla, String path){
        try
        {
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(listVilla);
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
    public static ArrayList<Villa>docFileVilla(String path){
        ArrayList<Villa> listVilla=new ArrayList<Villa>();
        try
        {
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Object data=ois.readObject();
            listVilla=(ArrayList<Villa>) data;
            ois.close();
            fis.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return listVilla;
    }

    public static boolean luuFileHouse(ArrayList<House> listHouse, String path){
        try
        {
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(listHouse);
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
    public static ArrayList<House>docFileHouse(String path){
        ArrayList<House> listHouse = new ArrayList<>();
        try
        {
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Object data=ois.readObject();
            listHouse=(ArrayList<House>) data;
            ois.close();
            fis.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return listHouse;
    }
}
