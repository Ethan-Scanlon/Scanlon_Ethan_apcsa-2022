import java.util.Arrays;

public class Perceptron {
	
	private double[] weights;
	private double threshold;
	private double bias;
	private double learningRate;
	
	public Perceptron(int n, double t, double r ) {
		threshold = t;
		learningRate = r;
		weights = new double[n];
		bias = 0;
	}
	
	public int predict(double[] inputs) {
		System.out.println(dotProduct(inputs, weights));
		return dotProduct(inputs, weights);
	}
	
	public int dotProduct(double[] inputs, double[] weights) {
		int sum = 0;
		if(inputs.length == weights.length) {
			for(int i = 0; i<inputs.length; i++) {
				sum += inputs[i]*weights[i];
			}
		}
		
		sum += bias;
		if( sum >0) {
			return 1;
		}
		return 0;
	}

	public void train(double[][] trainingInputs, int[] labels) {
		int yhat = 0;
		int error = 0;
		for(int i = 0; i<threshold; i++) {
			System.out.println("----- Training Iteration: " + i + " -----");
			for(int j = 0; j<labels.length; j++) {
				
				yhat = predict(trainingInputs[j]);
				error = labels[j]-yhat;
				for(int k =0; k< weights.length; k++ ) {
					weights[k] += learningRate*error*trainingInputs[j][k];
				}
			
				bias += learningRate*error;
			}
		}
	}

public static void main(String[] args) {
	Perceptron thing = new Perceptron(2, 10, 1);
	double[][] inputMatrix = {{1,1}, {1,0}, {0,1}, {0,0}};
	int[] labels = {0, 1, 1, 1};
	thing.train(inputMatrix, labels);
	int a =0;
	int b =0;
	double[] inputs = {a, b};
	System.out.println("----- Input ----- " + Arrays.toString(inputs));
	
	double output = thing.predict(inputs);
	System.out.println("----- Output -----" + output);
	
}

}