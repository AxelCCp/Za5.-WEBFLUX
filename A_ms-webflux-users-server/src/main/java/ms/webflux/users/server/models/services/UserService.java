package ms.webflux.users.server.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ms.webflux.users.server.models.dao.IUserDao;
import ms.webflux.users.server.models.documents.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService implements IUserService{

	@Override
	public Flux<User> usersList() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	
	@Override
	public Mono<User> getUserById(String id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}
	
	@Autowired
	private IUserDao userDao;

	

}
