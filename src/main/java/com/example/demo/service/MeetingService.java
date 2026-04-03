package com.example.demo.service;

import com.example.demo.dto.MeetingDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MeetingService {

    @Autowired
    private meetList storedMeetings;

    private final RestTemplate restTemplate = new RestTemplate();

    public List<MeetingDTO> getMeetingsOf2026(Integer paisKey) {

        String url = "https://api.openf1.org/v1/meetings?year=2026";

        if (paisKey != 0) {
            url += "&country_key=" + paisKey;
        }

        List<MeetingDTO> meetings = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<MeetingDTO>>() {
                }).getBody();

        if (meetings != null) {
            storedMeetings.setMeetings(meetings);
        }
        return meetings;
    }

    // public List<MeetingDTO> getMeetingsByYearAndCountry() {
    // return storedMeetings.getMeetings();
    // }

}
