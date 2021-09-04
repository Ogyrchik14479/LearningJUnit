package igor.reznikov.ResumeConstructor.servecies;

import igor.reznikov.ResumeConstructor.dtos.ResumeDto;

public interface ResumeService {

    Long add(ResumeDto resumeDto);

    ResumeDto getResumeById(Long id);
}
