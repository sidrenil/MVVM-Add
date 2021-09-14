package com.example.mvvmbasic.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.mvvmbasic.data.Quote
import com.example.mvvmbasic.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}