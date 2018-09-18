package com.jwtsecurity.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@Service
public class NYTimesService extends BaseService {


    @Autowired
    private RestTemplate restTemplate;

    public String getNYTimesArticles() {

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", String.valueOf(MediaType.TEXT_PLAIN));

        Map<String, String> params = new HashMap<String, String>();
        params.put("section", "all-sections");
        params.put("period", "7");

        String url = "http://api.nytimes.com/svc/mostpopular/v2/mostviewed/{section}/{period}.json?api-key=sample-key";
        URI uri = UriComponentsBuilder.fromUriString(url)
                .buildAndExpand(params)
                .toUri();

        HttpEntity<?> entity = new HttpEntity<>(headers);

       /* HttpEntity<String> response = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                entity,
                String.class);

        return response.getBody();*/

        return "";
    }
}
