import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class dataInsert {
    private String allData;
    private File f;
    private Scanner s;
    private hashTable d;
    private String filename;

    public dataInsert() {
        s = new Scanner(System.in);
        System.out.println("enter file name:");
        d = new hashTable();
        filename = s.nextLine();
        f = new File(filename);
        allData = "";

    }

    public boolean fileRead() {
        boolean sucess;
        try {
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                allData += " ";
                allData += reader.nextLine();
            }
            sucess = true;
        } catch (FileNotFoundException e) {
            System.out.println("a fille error occured");
            e.printStackTrace();
            sucess = false;
        }
        return sucess;

    }
    public hashTable makeHashtable(){
        String prefix = "";
        String suffix = "";
        double suffixInts = 0;
        for(int i = 0;i<allData.length();i++){
            if(allData.charAt(i)==' '){
                if(suffix.charAt(0)>='0'&&suffix.charAt(0)<='9'){
                    suffixInts = Double.parseDouble(suffix);
                }
                this.d.push(prefix, suffixInts);
                prefix= "";
                suffix = "";
            }
            else if(allData.charAt(i)=='.'||allData.charAt(i)=='!'||allData.charAt(i)=='?'){
                System.out.println(i);
            }
            else{
                suffix+= allData.charAt(i);
                System.out.println(suffix);
            }
        }
        return d;
    }
}