package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.ZonedDateTime;

public record DriversList(

        @JsonProperty("broadcast_name") String broadcastName,
        @JsonProperty("driver_number") Integer driverNumber,
        @JsonProperty("first_name") String firstName,
        @JsonProperty("full_name") String fullName,
        @JsonProperty("headshot_url") String headshotUrl,
        @JsonProperty("last_name") String lastName,
        @JsonProperty("meeting_key") Integer meetingKey,
        @JsonProperty("name_acronym") String nameAcronym,
        @JsonProperty("session_key") Integer sessionKey,
        @JsonProperty("team_colour") String teamColour,
        @JsonProperty("team_name") String teamName) {
}
