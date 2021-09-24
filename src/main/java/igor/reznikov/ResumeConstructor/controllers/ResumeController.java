package igor.reznikov.ResumeConstructor.controllers;

import igor.reznikov.ResumeConstructor.dtos.request.ResumePost;
import igor.reznikov.ResumeConstructor.dtos.response.ResumeView;
import igor.reznikov.ResumeConstructor.servecies.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    private ResumeService resumeService;

    @Autowired
    public void setResumeService(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping
    public Long createResume(@RequestBody ResumePost resumeView) {
        return resumeService.add(resumeView);
    }

    @GetMapping("/{id}")
    public ResumeView getResumeById(@PathVariable Long id){
        return resumeService.getResumeById(id);
    }
}
