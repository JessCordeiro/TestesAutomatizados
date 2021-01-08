package util;

public class funcoes {
	public static Double removeCifradoDevolveDouble(String texto) {
		texto = texto.replace("$", "");
		return Double.parseDouble(texto);
	}
	
	public static int removeTextoItemsDevolveInt(String texto) {
		texto = texto.replace(" items", "");
		return Integer.parseInt(texto);
	}
}
