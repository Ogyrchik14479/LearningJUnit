package igor.reznikov.resume.constructor.servecies;

import igor.reznikov.resume.constructor.dtos.request.ResumePost;
import igor.reznikov.resume.constructor.dtos.response.ResumeView;

public interface ResumeService {

    Long add(ResumePost resumePost);

    ResumeView getResumeById(Long id);
}
