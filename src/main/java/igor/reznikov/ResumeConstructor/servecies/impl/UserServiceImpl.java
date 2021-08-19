package igor.reznikov.ResumeConstructor.servecies.impl;

import igor.reznikov.ResumeConstructor.entities.BasicInformation;
import igor.reznikov.ResumeConstructor.repositories.BasicInformationRepository;
import igor.reznikov.ResumeConstructor.servecies.UserService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    BasicInformationRepository basicInformationRepository;

    @Override
    public BasicInformation getUser(Long id) {
        return basicInformationRepository.getById(id);
    }
}
