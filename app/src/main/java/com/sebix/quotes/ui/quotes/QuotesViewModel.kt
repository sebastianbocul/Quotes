package com.sebix.quotes.ui.quotes

import androidx.lifecycle.ViewModel
import com.sebix.quotes.data.Quote
import com.sebix.quotes.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) :ViewModel(){
    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}