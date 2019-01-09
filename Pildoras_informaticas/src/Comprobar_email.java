

public class Comprobar_email {

	public static void main(String[] args) {
		String email = "agustin@gmail.com";
		boolean email_ok;
		boolean arroba_ok=false;
		int cont_arroba;

		cont_arroba = 0;

		if (email.charAt(0) == '@')//Si el primer caracter es @
			arroba_ok = false;
		else
			for (int i = 0; i < email.length(); i++) {

				if (email.charAt(i) == '@')//Contar cantidad de @
					cont_arroba++;

				if (cont_arroba == 1)
					arroba_ok = true;
				else
					arroba_ok = false;
				
				//Si alguno de los últimos 3 caracteres es un @
				if (i >= email.length() - 3 && email.charAt(i) == '@') {
					arroba_ok = false;
					break;
				}

				//Si hay más de un @
				if (cont_arroba > 1) {
					arroba_ok = false;
					break;
				}
			}
		
		
		
		System.out.println(arroba_ok);
		
	}
}