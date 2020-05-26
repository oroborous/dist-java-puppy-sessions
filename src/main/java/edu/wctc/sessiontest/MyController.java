package edu.wctc.sessiontest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
//@SessionAttributes("myPuppy") // myPuppy has session scope
public class MyController {

    @RequestMapping("/endsession")
    public String endSession(SessionStatus status) {
        status.setComplete();

        return "index";
    }

    //@ModelAttribute("myPuppy")
    public Puppy puppy() {
        Puppy bean = new Puppy("Bean", 5);

        log.info("Adding a new puppy to model: " + bean.toString());

        return bean;
    }

    @RequestMapping("/")
    public String showFirstPage(@ModelAttribute("myPuppy") Puppy pup) {
        pup.chewSlipper();

        log.info("Inside of showFirstPage: " + pup.toString());

        return "index";
    }

    @RequestMapping("/lastpage")
    public String showLastPage(@ModelAttribute("myPuppy") Puppy pup) {
        pup.chewSlipper();

        log.info("Inside showLastPage: " + pup.toString());

        return "lastpage";
    }

    @RequestMapping("/nextpage")
    public String showNextPage(@ModelAttribute("myPuppy") Puppy pup) {
        pup.chewSlipper();

        log.info("Inside of showNextPage: " + pup.toString());

        return "nextpage";
    }

}
