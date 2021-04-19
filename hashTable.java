import java.util.ArrayList;

public class hashTable {
    private ArrayList keys = new ArrayList();
    private ArrayList values = new ArrayList();
    public hashTable(){

    }
    public hashTable(ArrayList keys, ArrayList values){
        for(int i = 0; i<keys.size();i++){
            this.keys.add(keys.get(i));
        }
        for(int i = 0; i<values.size();i++){
            this.values.add(values.get(i));
        }
    }
    public void push(String key, double value){
        keys.add(key);
        values.add(value);
    }
    public String getKeyAtIndex(int index){
        return keys.get(index).toString();
    }
    public Double getValueAtIndex(int index){
        return (Double) values.get(index);
    }
    public int findKey(String key){
        int returnable = -1;
        for(int i = 0;i<keys.size();i++){
            if(keys.get(i).equals(key)){
                returnable = i;
            }
            else {
                returnable =  -1;
            }
        }
        return returnable;
    }
    public ArrayList removeDoubles(String key){
        ArrayList doubles = new ArrayList();
        while(values.contains(key)){
            int index = keys.indexOf(key);
            doubles.add(values.remove(index));
            keys.remove(index);
        }
        return doubles;
    }
    public int size(){
        return keys.size();
    }
}
