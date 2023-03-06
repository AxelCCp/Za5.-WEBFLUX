package ms.webflux.users.server;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import ms.webflux.users.server.models.dao.IUserDao;
import ms.webflux.users.server.models.documents.User;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class MsWebfluxUsersServerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MsWebfluxUsersServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		mongoTemplate.dropCollection("users").subscribe();
		
		Flux.just(
				
				new User("Jack", "Daniels", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Johnnie", "Walker", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Captain", "Morgan", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("JB", "Whiskey", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("White", "Horse", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Chivas", "Regal", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				
				new User("Jack", "Daniels", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Johnnie", "Walker", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Captain", "Morgan", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("JB", "Whiskey", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("White", "Horse", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Chivas", "Regal", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00)
				/*
				new User("Jack", "Daniels", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Johnnie", "Walker", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Captain", "Morgan", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("JB", "Whiskey", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("White", "Horse", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Chivas", "Regal", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				
				new User("Jack", "Daniels", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Johnnie", "Walker", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Captain", "Morgan", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("JB", "Whiskey", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("White", "Horse", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Chivas", "Regal", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				
				new User("Jack", "Daniels", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Johnnie", "Walker", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Captain", "Morgan", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("JB", "Whiskey", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("White", "Horse", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00),
				new User("Chivas", "Regal", new Date(), "adhkajshdk 123", "gasg@jhg.com", "274364234", true, 200.00)
				*/
				).flatMap(user -> userDao.save(user)).subscribe(user -> log.info("MONGO DATABASE INSERT : " + user.toString()));
		
	}

	
	private static final Logger log = LoggerFactory.getLogger(MsWebfluxUsersServerApplication.class);
	@Autowired
	private ReactiveMongoTemplate mongoTemplate;
	@Autowired
	private IUserDao userDao;
}
