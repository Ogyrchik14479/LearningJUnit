package igor.reznikov.ResumeConstructor.servecies.impl;

import igor.reznikov.ResumeConstructor.dtos.ResumeDto;
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
    public Long add(ResumeDto resumeDto) {
        Resume resume = ResumeMapper.INSTANCE.toResume(resumeDto);
        return resumeRepository.save(resume).getId();
    }

    @Override
    public ResumeDto getResumeById(Long id) {
        return ResumeMapper.INSTANCE.toResumeDTO(resumeRepository.findById(id).get());
    }
}
