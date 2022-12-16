package com.example;

public interface QuoteService {
    Quote randomQuote();

    Quote create(Quote quote);

    void delete(Integer quoteId);
}
