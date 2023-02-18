package test;

public class Auto {
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;	
	
	int cantidadAsientos() {
		int numAsientos = 0;
		for(int a=0; a<asientos.length;a++) {
			if(asientos[a] instanceof Asiento) {
				numAsientos++;				
			}
		}
		return numAsientos;
	}
	
	String verificarIntegridad() {
		if(registro!=motor.registro) {
			return "Las piezas no son originales";		
		}
		for(int a=0; a<asientos.length;a++) {
			if (asientos[a]!=null) {
				if(asientos[a].registro != registro) {
					return "Las piezas no son originales";				
				}
			}
			
		}
		return "Auto original";
		
	}

}
