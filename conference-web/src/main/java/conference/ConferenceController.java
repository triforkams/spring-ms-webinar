package conference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class ConferenceController {

    private TalkService talkService;

    @Autowired
    public ConferenceController(TalkService talkService) {
        this.talkService = talkService;
    }

    @RequestMapping("/")
    String allTalks(Model model) {
        model.addAttribute("talks", talkService.allTalks());
        return "index";
    }

    @RequestMapping("/talk/{talkId}")
    String allTalks(Model model, @PathVariable Long talkId) {
        model.addAttribute(talkService.talkDetails(talkId));
        return "talk";
    }
}
