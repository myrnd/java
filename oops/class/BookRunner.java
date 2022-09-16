public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();

		artOfComputerProgramming.name();
		effectiveJava.name();
		cleanCode.name();

		artOfComputerProgramming.setNoOfCoppies(10);
		effectiveJava.setNoOfCoppies(100);
		cleanCode.setNoOfCoppies(5);

		System.out.println(cleanCode.getNoOfCoppies());

		Book.title();
	}

}
