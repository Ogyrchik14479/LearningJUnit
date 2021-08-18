package igor.reznikov.ResumeConstructor.servecies.impl;

import igor.reznikov.ResumeConstructor.entities.User;
import igor.reznikov.ResumeConstructor.repositories.UserRepository;
import igor.reznikov.ResumeConstructor.servecies.UserService;
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
