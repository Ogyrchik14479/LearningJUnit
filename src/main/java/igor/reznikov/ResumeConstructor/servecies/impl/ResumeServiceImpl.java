package igor.reznikov.ResumeConstructor.servecies.impl;

import igor.reznikov.ResumeConstructor.dtos.request.ResumePost;
import igor.reznikov.ResumeConstructor.dtos.response.ResumeView;
import igor.reznikov.ResumeConstructor.entities.Resume;
import igor.reznikov.ResumeConstructor.mappers.ResumeMapper;
import igor.reznikov.ResumeConstructor.repositories.ResumeRepository;
import igor.reznikov.ResumeConstructor.servecies.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    ResumeRepository resumeRepository;

    @Override
    public Long add(ResumePost resumePost) {
        Resume resume = ResumeMapper.INSTANCE.toResume(resumePost);
        return resumeRepository.save(resume).getId();
    }

    @Override
    public ResumeView getResumeById(Long id) {
        return ResumeMapper.INSTANCE.toResumeDTO(resumeRepository.findById(id).get());
    }
}
