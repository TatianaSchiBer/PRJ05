package model;

public class Punto {
	
	//public static void main(String[] args) {
		
		int x, y;
		
		public Punto(int x,int y) {//\Punto a = new Punto(3,2)
			this.x= x;
			this.y= y;
	}

		@Override
		public String toString() {
			return "(" + x + "," + y + ")";
		}
}


		

