package conference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TalkService {

    private RestTemplate restTemplate = new RestTemplate();
    private ReviewService reviewService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    public TalkService(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    public Talk[] allTalks() {
        logger.info("Returning latest talks");
        return restTemplate.getForObject("http://localhost:8881/talk", Talk[].class);
    }


    public Talk talkDetails(Long talkId) {
        Talk talk = restTemplate.getForObject("http://localhost:8881/talk/{id}", Talk.class, talkId);
        talk.setReviews(reviewService.reviewsFor(talkId));
        return talk;
    }
}
