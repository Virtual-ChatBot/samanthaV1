package com.beemil.samantha;

import com.beemil.samantha.config.web.TomcatConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(TomcatConfig.class)
public class SamanthaV1Application {

	public static void main(String[] args) {

		SpringApplication.run(SamanthaV1Application.class, args);
	}
}