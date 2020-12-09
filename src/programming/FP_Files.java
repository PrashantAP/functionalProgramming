package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FP_Files {

	public static void main(String[] args) throws IOException {
		Files.lines(Paths.get("file.txt"))
				.forEach(System.out::println);
	}
}
