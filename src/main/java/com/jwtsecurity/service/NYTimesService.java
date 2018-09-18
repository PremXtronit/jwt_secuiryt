package com.jwtsecurity.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class NYTimesService extends BaseService {


    @Autowired
    private RestTemplate restTemplate;

    public String getNYTimesArticles() {

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", String.valueOf(MediaType.TEXT_HTML));

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://api.nytime.com/svc/mostpopular/v2/mostviewed/all-section/7.json?api-key=sample-key");
        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                String.class);

        return response.getBody();
    }
}
