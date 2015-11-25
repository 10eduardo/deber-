package ejercicios;

public class circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		private double radio;
	 public circulo (){
 }
	 public circulo (double radioParam){
		 this.radio=radioParam;
	 }
		 public void setradio(double radioParam){
			 this.radio=radioParam;
		 }
		 public double getradio(){
			 return this.radio; 
	 }
	 public double getarea(){
		 return Math.PI*radio*radio; 
	 }
	}
