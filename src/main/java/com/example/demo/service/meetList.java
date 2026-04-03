package com.example.demo.service;

import com.example.demo.service.MeetingService;
import com.example.demo.dto.paises;
import com.example.demo.dto.MeetingDTO;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class meetList {

    private List<MeetingDTO> meetings = new ArrayList<>();

    public List<MeetingDTO> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<MeetingDTO> meetings) {
        this.meetings = meetings;

        System.out.println("meetings: " + meetings.get(0).countryName());

        for (MeetingDTO meeting : meetings) {
            paises pais = new paises();
            pais.setPais(meeting.countryName());

        }

    }
}