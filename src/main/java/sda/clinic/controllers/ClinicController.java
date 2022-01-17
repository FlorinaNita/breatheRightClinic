package sda.clinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sda.clinic.repositories.CourseRepository;

@Controller
public class ClinicController {

    @Autowired
    private CourseRepository courseRepository;

    public ClinicController() {
        System.out.println(getClass().getSimpleName() + " created");
    }

    @GetMapping("/frontpage")
    public ModelAndView getFrontPage() {
        ModelAndView modelAndView = new ModelAndView("frontpage");
        return modelAndView;
    }

    @GetMapping("/about-us")
    public ModelAndView getAboutUsPage() {
        ModelAndView modelAndView = new ModelAndView("aboutus");
        return modelAndView;
    }



    @GetMapping("/breathing-naturally")
    public ModelAndView getBreathingNaturallyPage() {
        ModelAndView modelAndView = new ModelAndView("breathingnaturally");
        return modelAndView;
    }

    @GetMapping("/chronic-cough")
    public ModelAndView getChronicCoughPage() {
        ModelAndView modelAndView = new ModelAndView("chroniccough");
        return modelAndView;
    }

    @GetMapping("/coronavirus-recovery-rehab")
    public ModelAndView getLongCovidPage() {
        ModelAndView modelAndView = new ModelAndView("coronavirusrecoveryrehab");
        return modelAndView;
    }

    @GetMapping("/courses")
    public ModelAndView getCoursesPage() {
        ModelAndView modelAndView = new ModelAndView("courses");
        modelAndView.addObject("courseList", courseRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/account-details")
    public ModelAndView getMyAccountPage() {
        ModelAndView modelAndView = new ModelAndView("cart");
        return modelAndView;
    }

    @GetMapping("/power-breathe")
    public ModelAndView getPowerBreathePage() {
        ModelAndView modelAndView = new ModelAndView("powerbreathe");
        return modelAndView;
    }

    @GetMapping("/respiratory-disorders")
    public ModelAndView getRespiratoryDisordersPage() {
        ModelAndView modelAndView = new ModelAndView("respiratorydisorders");
        return modelAndView;
    }

    @GetMapping("/respiratory-physiotherapy")
    public ModelAndView getRespiratoryPhysiotherapyPage() {
        ModelAndView modelAndView = new ModelAndView("respiratoryphysiotherapy");
        return modelAndView;
    }


}
