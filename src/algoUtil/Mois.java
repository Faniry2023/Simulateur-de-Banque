package algoUtil;

public class Mois {
	public int transformeMois(String mois) {
		int moisATrans = 0;
		switch(mois) {
			case "Janvier":
				moisATrans = 1;
				break;
			case "Fevrier":
				moisATrans = 2;
				break;
			case "Mars":
				moisATrans = 3;
				break;
			case "Avril":
				moisATrans = 4;
				break;
			case "Mai":
				moisATrans = 5;
				break;
			case "Juin":
				moisATrans = 6;
				break;
			case "Juillet":
				moisATrans = 7;
				break;
			case "Aout":
				moisATrans = 8;
				break;
			case "Septembre":
				moisATrans = 9;
				break;
			case "Octobre":
				moisATrans = 10;
				break;
			case "Novembre":
				moisATrans = 11;
				break;
			case "Decembre":
				moisATrans = 12;
		}
		return moisATrans;
	}
}
