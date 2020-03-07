package TestCaseStudy.Task1.common;

import TestCaseStudy.Task1.model.Service;

import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER=",";
    private static final String NEW_LINE_SEPARATOR="\n";
    private static final String fileNameService = "d:\\Codegym\\Service.csv";
    //header file CSV
    private static final String FILE_HEADER = "name,grade,address";
    public static void witeStudentToFilaCSV(ArrayList<Service> listService){
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter(fileNameService);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Service service:listService){
                fileWriter.append(service.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(service.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(service.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((char) service.getRentalCosts());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((char) service.getMaxNumberOfPeople());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(service.getTypeRent());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception e){
            System.out.println("Error in CsvFileWriter !!!");
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                System.out.println("Error when flush or close");
            }
        }
    }
}
