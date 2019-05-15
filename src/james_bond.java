
public class james_bond {
	 public static void main(String[] args) {
			vault vault = new vault(20194);
			int code =  findCode(vault);
			System.out.println(code);
		}
		 
		static int findCode(vault v) {
			for(int i = 0; i <= 1000000;i ++) {
				if (i == v.secretCode) {
					return(i);
				}
			}
			return 0;
		}

}
