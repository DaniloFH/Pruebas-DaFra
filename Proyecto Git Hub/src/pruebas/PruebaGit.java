package pruebas;

public class PruebaGit {
	private int ruedas;//private: para encapsular esa variable/propiedad
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;



	public PruebaGit(){//Metodo constructor: da un estado inicial al objeto

		ruedas=8;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;

	}

	public String dime_datos_generales() {//metodo GETTER

		return "La plataforma del vehículo tiene " + ruedas + ". Mide " + largo/1000 + " metros con un anche de " + ancho + " cm "
		+ "y un peso de plataforma " + peso_plataforma + " kg.";	
	}

	public void establece_color(String color_coche) {//metodo SETTER //EN EL PARENTESIS DECLARAMOS UNA VARIABLE DENOMINADA PARAMETRO O ARGUMENTO

		//color="azul"; //ESTO ES PARA DARLE UN COLOR DETERMINADO

		color=color_coche;
	}

	public String devuelve_colores() {

		return "El color del coche es: " + color;
	}

	public void configurar_Asiento(String asientos_cuero) {//SETTER

		if(asientos_cuero=="si") {
			this.asientos_cuero=true;
		}
		else {
			this.asientos_cuero=false;
		}
	}

	public String dime_asientos() {//GETTER

		if(asientos_cuero==true) {
			return "EL coche tiene asientos de cuero";

		}
		else {
			return "El coche tiene asientos de serie";
		}
	}

	public void configura_climatizador(String climatizador) {

		if(climatizador == "si") {
			this.climatizador=true;
		}
		else {
			this.climatizador=false;
		}
	}

	public String dime_climatizador() {

		if(climatizador==true) {
			return"El coche incorpora climatizador";
		}
		else {
			return "El coche lleva aire acondicionado";
		}
	}

	public String dime_peso_coche() {//es SETTER y GETTER a la vez, porque por un lado establecemos el valor de la variable peso_total y por otro lado le pedimos que nos devuelva un dato (return)

		int peso_carroceria=500;
		peso_total=peso_plataforma + peso_carroceria;

		if(asientos_cuero==true) {

			peso_total=peso_total+50;
		}

		if (climatizador==true) {

			peso_total=peso_total+20;
		}

		return "El peso del coche es " + peso_total;

	}

	public int precio_coche() {//GETTER
		int precio_final=10000;

		if(asientos_cuero == true) {

			precio_final+=2000;
		}
		if(climatizador==true) {

			precio_final+=1500;
		}

		return precio_final;
	}
	
}
