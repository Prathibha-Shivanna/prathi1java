import java.util.Arrays;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < args.length; i++) {
			Arrays.sort(args);
			System.out.println(args[i]);
		}
	}

}
