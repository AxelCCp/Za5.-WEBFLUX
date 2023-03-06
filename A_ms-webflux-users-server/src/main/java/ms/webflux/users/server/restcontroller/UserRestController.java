package ms.webflux.users.server.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ms.webflux.users.server.models.documents.User;
import ms.webflux.users.server.models.services.IUserService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserRestController {

	
	@GetMapping
	public Flux<User>listOfUsers(){
		Flux<User> users = userService.usersList().map(user -> {
			user.getName().toUpperCase();
			user.getLastname().toUpperCase();
			return user;	
		}).doOnNext(u -> log.info(u.toString()));
		return users;
	}
	
	
	@GetMapping("/{id}")
	public Mono<User>getUserById(@PathVariable String id){
		Flux<User> users = userService.usersList();
		Mono<User> user = users.filter(u -> u.getId().equals(id)).next().doOnNext(u -> log.info(u.toString()));
		return user;
	}
	
	
	@Autowired
	private IUserService userService;
	private static final Logger log = LoggerFactory.getLogger(UserRestController.class);
	
	
}
