package methodoverloading;

public class Main {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.sum(3.7, 3.7);;
		c.sum(3, 3.7);
		c.sum(2, 5);

	}

}
