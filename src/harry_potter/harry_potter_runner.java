package harry_potter;

public class harry_potter_runner {
public static void main(String[] args) {
	HarryPotter harry = new HarryPotter();
	harry.makeInvisible(true);
	harry.spyOnSnape();
	harry.makeInvisible(false);
	harry.castSpell("stupefy");
}
}