import java.io.*;
import java.util.Scanner;
import java.math.*;

/*
 * author @tarannum ara
 */
public class InterestCal {
	double p,r,t;
	
	//*iniatialize values
	void takeInput() {
		
		Scanner sc = new Scanner(System.in);
		p = sc.nextDouble();
		r = sc.nextDouble();
		t = sc.nextDouble();
		sc.close();
	}
	
	// compute the simple interest and return the value..
	double SIcalculate() {
		double si = p*r*t/100;
		return si;
	}
	
	double CIcalculate() {
		double ci = p*(Math.pow((1+r/100),t))-p;
		return ci;
	}


	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));	
		InterestCal obj = new InterestCal();
		bw.write("enter principle, rate, time:\n");
		bw.flush();
		
		obj.takeInput();
		bw.write("\nsimple interest: "+obj.SIcalculate());
		bw.write("\ncompund interest: "+obj.CIcalculate());
		bw.flush();

	}
}
