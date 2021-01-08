import NuralNetSimple.Matrix;
import NuralNetSimple.NeuralNetwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class TheMain {

    public static void main(String[] arr){
        double[] inputs1={1,0};
        double[] target1={1};
        double[] inputs2={0,1};
        double[] target2={1};
        double[] inputs3={1,1};
        double[] target3={0};
        double[] inputs4={0,0};
        double[] target4={0};

        ArrayList<double[]> inputs=new ArrayList<>();

        inputs.add(inputs1);
        inputs.add(inputs2);
        inputs.add(inputs3);
        inputs.add(inputs4);

        HashMap<double[],double[]> hashMap=new HashMap<>();

        hashMap.put(inputs1,target1);
        hashMap.put(inputs2,target2);
        hashMap.put(inputs3,target3);
        hashMap.put(inputs4,target4);

        NeuralNetwork nn=new NeuralNetwork(2,2,1);

        for(int i=0;i<50000;i++){
            int a= new Random().nextInt(4);
            nn.training(inputs.get(a),hashMap.get(inputs.get(a)));
          // System.out.println(hashMap.get(inputs.get(a))[0]);
        }


        System.out.println(nn.getPredection(inputs1).get(0));
        System.out.println(nn.getPredection(inputs2).get(0));
        System.out.println(nn.getPredection(inputs3).get(0));
        System.out.println(nn.getPredection(inputs4).get(0));




    }
}
