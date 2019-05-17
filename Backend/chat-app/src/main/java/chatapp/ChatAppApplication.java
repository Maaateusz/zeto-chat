package chatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatAppApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ChatAppApplication.class, args);
	}
}

/*public class ChatAppApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ChatAppApplication.class);
	}
	*/