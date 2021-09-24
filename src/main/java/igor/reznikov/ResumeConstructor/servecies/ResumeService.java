package igor.reznikov.ResumeConstructor.servecies;

import igor.reznikov.ResumeConstructor.dtos.response.ResumeView;

public interface ResumeService {

    Long add(ResumeView resumeView);

    ResumeView getResumeById(Long id);
}
