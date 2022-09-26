package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping()
    public String hello()   {
        return "<html>" +
                    "<body>" +
                        "<h1>'Skills Tracker'</h1>" +
                        "<h2>'We have a few skills we would like to learn. Here is the list!'</h2>" +
                        "<ol>" +
                            "<li>'Java'</li>" +
                            "<li>'JavaScript'</li>" +
                            "<li>'Python'</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String form()  {
        return "<html>" +
                    "<body>" +
                        "<form action='form-submit' method = 'post'>" +
                            "<label for = 'name'>Name: </label><br>" +
                            "<input id = 'name' type = 'text' name = 'name'/><br>" +
                            "<label for = 'favorite-language'>My favorite language: </label><br>" +
                            "<select id='favorite-language' name = 'language1'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='Javascript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select><br>" +
                            "<label for = 'second-favorite'>My second favorite language: </label><br>" +
                            "<select id='second-favorite' name = 'language2'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='Javascript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select><br>" +
                            "<label for = 'third-favorite'>My third favorite language: </label><br>" +
                            "<select id='third-favorite' name = 'language3'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='Javascript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select><br>" +
                            "<input type = 'submit' value='Submit'/>" +
                        "</form>" +
                    "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @RequestMapping(value = "form-submit", method = {RequestMethod.GET, RequestMethod.POST})
    public String formSubmit(@RequestParam  String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3)    {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                            "<li>" + language1 + "</li>" +
                            "<li>" + language2 + "</li>" +
                            "<li>" + language3 + "</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
    }
}
