package com.sebix.quotes.utilities

import com.sebix.quotes.data.FakeDatabase
import com.sebix.quotes.data.QuoteRepository
import com.sebix.quotes.ui.quotes.QuotesViewModel
import com.sebix.quotes.ui.quotes.QuotesViewModelFactory

object InjectorUtilis {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}