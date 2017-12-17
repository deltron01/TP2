package metier;

public class Compte {
	
	private int code;
	private float solde;
	private static int nbrComptes = 0;
	public Compte(float solde) {
		++nbrComptes;
		this.code = nbrComptes;
		this.solde = solde;
	}

	public void verser(float mt){
		solde = solde + mt;
	}
	public void retirer(float mt){
		solde = solde - mt;
	}

	public String toString() {
		return "Compte [] : Code --> " + code + " , Solde --> " + solde;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public float getSolde() {
		return solde;
	}


	public static int getNbrComptes() {
		return nbrComptes;
	}

	
}
