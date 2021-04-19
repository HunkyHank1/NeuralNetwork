import java.util.ArrayList;

public class network <T> {
    private hashTable dataEntry;
    private ArrayList neuronReturns = new ArrayList();
    private neuron n;
    private Trainer t = new Trainer();
    private dataInsert d;
    public network() {
        dataEntry = new hashTable();
        d = new dataInsert();
        d.fileRead();
        dataEntry = d.makeHashtable();
    }
    public network(ArrayList values, ArrayList keys){
        dataEntry = new hashTable(values, keys);
    }

    public double passValues(String key, int[] weightings){
        double[] values = new double[0];
        ArrayList doubleValues = dataEntry.removeDoubles(key);
        n = new neuron(weightings, doubleValues);
        return n.returnAverage();
    }
    public int doTheThing(){
        ArrayList<Double> doubles = new ArrayList<>();
        int finalDouble;
        //search for keys
        String wantedKey = "";
        //repeat for each neuron
        //wieghtings to be decided
        double nextvalue;
        nextvalue = passValues(wantedKey, t.weightings());
        doubles.add(nextvalue);


        //finds the larges double to return
        double highestDouble = doubles.get(0);
        int indexOfHighestDouble = 0;
        for(int i = 1;i<doubles.size();i++){
            if(doubles.get(i)>highestDouble){
                highestDouble = doubles.get(i);
                indexOfHighestDouble = i;
            }
        }
        return indexOfHighestDouble;
    }
}
