package igor.reznikov.ResumeConstructor.controllers;

import igor.reznikov.ResumeConstructor.dtos.ResumeDto;
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
    public Long createLord(@RequestBody ResumeDto resumeDto) {
        return resumeService.add(resumeDto);
    }

    @GetMapping("/{id}")
    public ResumeDto getResumeById(@PathVariable Long id){
        return resumeService.getResumeById(id);
    }
}
