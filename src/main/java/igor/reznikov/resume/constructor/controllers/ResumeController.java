package igor.reznikov.resume.constructor.controllers;

import igor.reznikov.resume.constructor.dtos.request.ResumePost;
import igor.reznikov.resume.constructor.dtos.response.ResumeView;
import igor.reznikov.resume.constructor.servecies.ResumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resume")
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeService resumeService;

    @PostMapping
    public Long createResume(@RequestBody ResumePost resumePost) {
        return resumeService.add(resumePost);
    }

    @GetMapping("/{id}")
    public ResumeView getResumeById(@PathVariable Long id) {
        return resumeService.getResumeById(id);
    }
}
