import java.util.ArrayList;

/*
Henry Johnson
the purpose of this program is to take weightings for each data point, and give an average
4/14/21
 */
public class neuron {
    private int[] weighted;
    private ArrayList<Double> dataIn;
    private double dataOut;
    private int dataPoints;
    public neuron(int[] weightings, ArrayList<Double> data){
        dataOut = 0;
        dataPoints = 0;
        if(weightings.length!= data.size()){
            System.out.println("Neuron Data does not match weighting");
        }
        else{
            weighted = weightings;
            dataIn = data;
        }

    }
    public double returnAverage(){
        for(int i = 0; i<=weighted.length; i++){
            dataPoints+=weighted[i];
            dataOut+= (weighted[i]*dataIn.get(i));
        }
        dataOut = dataOut/dataPoints;
        return dataOut;
    }
}
