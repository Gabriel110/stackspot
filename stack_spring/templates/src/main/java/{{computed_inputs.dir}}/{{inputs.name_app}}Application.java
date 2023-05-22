package {{computed_inputs.package_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{inputs.name_app}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{inputs.name_app}}Application.class, args);
	}

}