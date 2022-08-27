// need to be executed from command line
// javac CommandLineArgs.java
// java CommandLineArgs 1 2 3
public class CommandLineArgs {

	public static void main(String[] args) {
		for (String elem : args)
            System.out.println(elem);

	}

}
