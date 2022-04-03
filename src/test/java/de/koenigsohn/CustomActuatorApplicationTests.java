package de.koenigsohn;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;


@SpringBootTest
class CustomActuatorApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void getLicenses() throws IOException {
		String data = readFileInputStream();
		System.out.println(data);

	}

	private String readFileInputStream() throws IOException {
		FileInputStream fis = new FileInputStream("src/test/resources/dependency-license.json");
		return IOUtils.toString(fis, StandardCharsets.UTF_8);
	}


}
