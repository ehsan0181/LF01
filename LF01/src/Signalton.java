
public class Signalton {

	public static void main(String[] args) {
		
		int[] signal= {1,3,5,4,4,8,2,3,1};
		int[] ergebnis = new int[signal.length];
		
		ergebnis[0]=(signal[0]+signal[1])/2;
		ergebnis [signal.length-1]= (signal[signal.length-1]+signal[signal.length-2])/2;
		System.out.println("geglätete Signal");
		
		for (int i=1;i<signal.length-1;i++) {
			ergebnis [signal.length]=(signal[signal.length-1] +signal [signal.length]+signal[signal.length+1])/3;
		System.out.println(ergebnis [signal.length]);	
		}
		
	}

}
