import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.*;
import java.util.Scanner;

public class costCal {
	int choice1, choice2;
	double area , price;
	
	costCal(double area){
		this.area = area;
	}
	
	double standard() {
		//cost=1200 per square feet
		price = area*1200;
		return price;
	}
	
	double abv_standard() {
		//cost=1500 per square feet
		price = area*1500;
		return price;
	}
	
	double high_standard() throws IOException {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		bw.write("want fully automated or not(y/n):");
		bw.flush();
	    char ch = sc.next().charAt(0);
	    
	    if(ch == 'y') {
	    	//cost=2500
	    	price = area*2500;
	    }
	    else {
	    	//cost=1800
	    	price = area*1800;
	    }
	    
		return price;
	}

	
	
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		bw.write("enter your material choice:\n1:standard material\n2:above standard material\n3:high standard material\n");
		bw.flush();
	    int ch = sc.nextInt();
		
		bw.write("enter area of the house:");
		bw.flush();	
		double area = sc.nextDouble();
		
		
		// making object
		costCal obj = new costCal(area);
		if(ch==1) {
			bw.write("price of the house:" + obj.standard());
			bw.flush();	
		}
		
		else if(ch==2) {
			bw.write("price of the house:" + obj.abv_standard());
			bw.flush();	
		}
		else if(ch==3){
			bw.write("price of the house:" + obj.high_standard());
			bw.flush();
		}
		
		else {
			bw.write("ERROR");
			bw.flush();
		}
	
	}

}
