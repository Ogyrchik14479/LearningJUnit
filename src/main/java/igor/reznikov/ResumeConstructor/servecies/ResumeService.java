package igor.reznikov.ResumeConstructor.servecies;

import igor.reznikov.ResumeConstructor.dtos.request.ResumePost;
import igor.reznikov.ResumeConstructor.dtos.response.ResumeView;
import igor.reznikov.ResumeConstructor.entities.Resume;

public interface ResumeService {

    Long add(ResumePost resumePost);

    ResumeView getResumeById(Long id);
}
