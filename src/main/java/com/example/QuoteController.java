package com.example;

import org.springframework.boot.cloud.CloudPlatform;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/api/quote")
public class QuoteController {

    private final QuoteService quoteService;
    private final Environment environment;

    public QuoteController(QuoteService quoteRepository, Environment environment) {
        this.quoteService = quoteRepository;
        this.environment = environment;
    }

    @PostMapping(value = {"/create/{author}"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createQuote(@PathVariable(value = "author") String author) {
        Quote quote = new Quote();
        quote.setQuote(UUID.randomUUID().toString());
        quote.setAuthor(author);
        quote.setK8s(CloudPlatform.KUBERNETES.isActive(environment));
        quote = quoteService.create(quote);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(quote.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/delete/{quoteId}")
    public ResponseEntity<Void> deleteCar(@PathVariable(value = "quoteId") Integer quoteId) {
        quoteService.delete(quoteId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/random")
    public Quote randomQuote() {
        Quote result = quoteService.randomQuote();
        if (CloudPlatform.KUBERNETES.isActive(environment)) {
            result.setK8s(true);
        }
        return result;
    }
}
