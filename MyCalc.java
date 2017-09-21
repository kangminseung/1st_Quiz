import java.util.Scanner;
public class MyCalc {
	public void showMenu() {
		int n;
		
		System.out.println("1. Add two integers");
		System.out.println("2. Subtract an integer from an integer");
		System.out.println("3. Multiply two integer");
		System.out.println("4. Divide an integer into an integer");
		System.out.println("5. Exit");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select one of the option numbers from above: ");
		n = sc.nextInt();
		
		switch(n) {
		case 1: addNumbers(); break;
		case 2: subNumbers(); break;
		case 3: multNumbers(); break;
		case 4: divNumbers(); break;
		case 5: System.out.println("BYE"); break;
		default: System.out.println("You input wrong number! Try again!!"); break;
		}
	}
	
	public class getNumbers {
		int n1, n2;
		
		public getNumbers() {
			getFirstNumber();
			getSecondNumber();
			setFirstNumber();
			setSecondNumber();
		}
		
		public void setFirstNumber() {
			System.out.println("Input First Number: ");
			Scanner sc = new Scanner(System.in);
			n1 = sc.nextInt();
			this.n1 = n1;
		}
		public int getFirstNumber() { return n1; }
		
		public void setSecondNumber() {
			System.out.println("Input second Number: ");
			Scanner sc = new Scanner(System.in);
			n2 = sc.nextInt();
			this.n2 = n2;
		}
		public int getSecondNumber() { return n2; }
	}
	
	public void addNumbers() {
		int res;
		getNumbers a = new getNumbers();
		res = a.getFirstNumber() + a.getSecondNumber();
		System.out.println(a.getFirstNumber() + " + " + a.getSecondNumber() + " = " + res);
	}
	
	public void subNumbers() {
		int res;
		getNumbers s = new getNumbers();
		res = s.getFirstNumber() - s.getSecondNumber();
		System.out.println(s.getFirstNumber() + " + " + s.getSecondNumber() + " = " + res);
	}
	
	public void multNumbers() {
		int res;
		getNumbers m = new getNumbers();
		res = m.getFirstNumber() * m.getSecondNumber();
		System.out.println(m.getFirstNumber() + " + " + m.getSecondNumber() + " = " + res);
	}
	
	public void divNumbers() {
		int res;
		getNumbers d = new getNumbers();
		res = d.getFirstNumber() / d.getSecondNumber();
		System.out.println(d.getFirstNumber() + " + " + d.getSecondNumber() + " = " + res);
	}
	
	boolean checkIfDigit(String st) {
		int count = 0;
	
		if(st==null || st.equals(""))
			return false;
		
		for(int i=0; i<st.length(); i++) {
			char ch = st.charAt(i);
            if((ch<'0' || ch>'9') && ch !='.')
            	return false;
            if (ch == '.') {
            	if (count==1 || i == 0)
            		return false;
            	else
            		count++;
            }
        }
        return true;
	}
	
	double convertNumbers(String num){
		double cn = Double.parseDouble(num);
		return cn;
	}
	
	public static void main(String[] args) {
		MyCalc calulation = new MyCalc();
		calulation.showMenu();
	}
}