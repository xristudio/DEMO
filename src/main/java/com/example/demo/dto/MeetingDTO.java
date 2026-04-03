package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.ZonedDateTime;

public record MeetingDTO(
    @JsonProperty("meeting_key") Integer meetingKey,
    @JsonProperty("meeting_name") String meetingName,
    @JsonProperty("meeting_official_name") String meetingOfficialName,
    @JsonProperty("location") String location,
    @JsonProperty("country_key") Integer countryKey,
    @JsonProperty("country_code") String countryCode,
    @JsonProperty("country_name") String countryName,
    @JsonProperty("country_flag") String countryFlag,
    @JsonProperty("circuit_key") Integer circuitKey,
    @JsonProperty("circuit_short_name") String circuitShortName,
    @JsonProperty("circuit_type") String circuitType,
    @JsonProperty("circuit_info_url") String circuitInfoUrl,
    @JsonProperty("circuit_image") String circuitImage,
    @JsonProperty("gmt_offset") String gmtOffset,
    @JsonProperty("date_start") ZonedDateTime dateStart,
    @JsonProperty("date_end") ZonedDateTime dateEnd,
    @JsonProperty("year") Integer year
) {}
