
public class vault {
	int secretCode;
	public vault(int secretCode) {
		this.secretCode = secretCode;
	}
	public static void main(String[] args) {
				
	}
	
	boolean tryCode(int number){
		if (number == secretCode) {
			return true;
		}
		else {
		return false;}
	}
	}


