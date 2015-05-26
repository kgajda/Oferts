package pl.oferts.web.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by karol on 26.05.15.
 */
@Controller
public class HomeController {
    String[] cat = {"First", "Secend"};

    @RequestMapping(value = {"/", "/index", "home"}, method = RequestMethod.GET)
    public String getHomePage() {
        return "index";
    }

    @ModelAttribute(value = "categories")
    public Collection<String> getCategories() {
        return Arrays.asList(cat);
    }
}
