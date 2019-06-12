package org.odve.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author evdokimov evgenii
 */

@Controller
public class GameController {

    @GetMapping("/home")
    public ModelAndView home(@RequestParam(name="name", required=false, defaultValue="<empty>") String name,
                             Map<String, Object> model) {
        model.put("name", name);
        return new ModelAndView("home", model);
    }
}
