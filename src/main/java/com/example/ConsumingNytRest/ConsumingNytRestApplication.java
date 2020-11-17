package com.example.ConsumingNytRest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingNytRestApplication {
// logger, to send output to the log (the console, in this example).
private static final Logger log= LoggerFactory.getLogger(ConsumingNytRestApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ConsumingNytRestApplication.class, args);
	}


//A RestTemplate, which uses the Jackson JSON processing library to process the incoming data.
 @Bean
public RestTemplate restTemplate (RestTemplateBuilder builder){

	return builder.build();
}

//A CommandLineRunner that runs the RestTemplate (and, consequently, fetches our quotation) on startup.
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{

		return args -> { TopStories topStories=restTemplate.getForObject("https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=Pt9j8BVfv0IuX9CgdGBvFAArQxgjALrk",TopStories.class);
		log.info(topStories.toString());
		};
	}
}