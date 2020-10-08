package com.millinder.foosball;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoosballController {
    @PostMapping(path = "/foos", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String newMatchRequest(SlackCommandData data) {
        return data.getUser_name() + " is looking for players";
    }

    @PostMapping(path = "/play", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String joinMatch(SlackCommandData data) {
        return data.getUser_name() + " wants to play";
    }
}
