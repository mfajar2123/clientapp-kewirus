
package com.clientapp.service;

import java.nio.charset.Charset;
import java.util.List;
import com.clientapp.model.Event;
import com.clientapp.util.BasicHeader;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import static org.springframework.web.servlet.function.RequestPredicates.headers;

@Service
public class EventService {

    private RestTemplate restTemplate;

    @Autowired
    public EventService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${server.baseUrl}/event")
    private String url;


    public List<Event> getAll() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "Basic a2hhbGlzYTpraGFsaXNh");// Khalisa (Basic Authentication) username:password
        return restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Event>>() {
                }).getBody();
    }

    public Event getById(Long id) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic a2hhbGlzYTpraGFsaXNh");
        return restTemplate.exchange(url + "/" + id, HttpMethod.GET, null,
                new ParameterizedTypeReference<Event>() {
                }).getBody();
    }

    public Event create(Event event) {
        return restTemplate.exchange(url, HttpMethod.POST, new HttpEntity(event),
                new ParameterizedTypeReference<Event>() {
                }).getBody();
    }

    public Event update(Long id, Event event) {
        return restTemplate.exchange(url + "/" + id, HttpMethod.PUT,new HttpEntity(event),
                new ParameterizedTypeReference<Event>() {
                }).getBody();
    }

    public Event delete(Long id) {
        return restTemplate.exchange(url + "/" + id, HttpMethod.DELETE, null,
                new ParameterizedTypeReference<Event>() {
                }).getBody();
    }

}