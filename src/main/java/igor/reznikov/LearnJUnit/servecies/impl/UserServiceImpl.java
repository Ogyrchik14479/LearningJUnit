package igor.reznikov.LearnJUnit.servecies.impl;

import igor.reznikov.LearnJUnit.entities.User;
import igor.reznikov.LearnJUnit.repositories.UserRepository;
import igor.reznikov.LearnJUnit.servecies.UserService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        return userRepository.getById(id);
    }
}
