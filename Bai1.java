import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
			System.out.println("Tien goc vay la:");
			int principle = scanner.nextInt();
			System.out.println("Lai suat la:");
			double rate = scanner.nextDouble();
			System.out.println("Ki han vay la:");
			int period = scanner.nextInt();
			
			double mortage = (principle * (rate / 12) * Math.pow(1 + rate / 12, period * 12)) 
					         / (Math.pow(rate / 12 + 1, period * 12 ) - 1);
			System.out.println("So tien tra no hang thang la: " + mortage);
		
		
	}

}
