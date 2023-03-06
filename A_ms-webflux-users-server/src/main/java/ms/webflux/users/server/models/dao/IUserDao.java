package ms.webflux.users.server.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import ms.webflux.users.server.models.documents.User;

public interface IUserDao extends ReactiveMongoRepository<User,String> {

}
