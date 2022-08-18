package myfirstproject;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		

		double horas =48;
		double preciohora = 5000;
		double salBruto = horas * preciohora;
		double porcRetencion = 0.125;
		double salNeto = salBruto - (salBruto * porcRetencion);
		System.out.println("El salario bruto es: "+ salBruto);
		System.out.println("La retencion en la fuente es: "+ salBruto * porcRetencion);
		System.out.println("El salario neto es: "+ salNeto);
		
	
}
}
