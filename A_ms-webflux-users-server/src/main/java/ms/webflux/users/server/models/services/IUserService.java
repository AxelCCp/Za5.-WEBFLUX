package ms.webflux.users.server.models.services;

import ms.webflux.users.server.models.documents.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IUserService {
	
	public Flux<User>usersList();
	
	public Mono<User>getUserById(String id);

}
