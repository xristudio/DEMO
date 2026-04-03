package com.example.demo.service;

import com.example.demo.dto.DriversList;
import com.example.demo.dto.MeetingDTO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DriverService {

    private final RestTemplate restTemplate = new RestTemplate();

    public List<DriversList> getDriversOf2026(Integer p, Integer s) {
        // https://api.openf1.org/v1/drivers?driver_number=1&session_key=9158

        String url = "https://api.openf1.org/v1/drivers?driver_number=" + p;// + "&session_key=" + s;

        if (s != 0) {
            url += "&session_key=" + s;
        }

        List<DriversList> drivers = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<DriversList>>() {
                }).getBody();

        return drivers;
    }

    // public List<MeetingDTO> getMeetingsByYearAndCountry() {
    // return storedMeetings.getMeetings();
    // }

}
