package controller.client.testeur;

public class Testeur {
	public boolean testeEmail(String email) {
		boolean val = false;
		if(email.endsWith("@gmail.com")) {
			val = true;
		}
		return val;
	}
	public boolean testLieu(String lieu) {
		boolean rep = false;
		if(lieu.length() > 0) {
			rep = true;
		}
		return rep;
	}
	public int testContact(String contact) {
		//0 = validere  -----   1 = erreur 33,34,32  ---   2 = numero incomplet
		int o = 0;
		try {
			if(!contact.substring(4, 6).equals("32") || !contact.substring(4, 6).equals("33") || !contact.substring(4, 6).equals("34")) {
				o = 1;
			}else {
				if(contact.length() < 12 || contact.length() > 12) {
					o = 2;
				}
			}
		}catch(StringIndexOutOfBoundsException t) {
			o = 2;
		}
		return o;
	}
}
