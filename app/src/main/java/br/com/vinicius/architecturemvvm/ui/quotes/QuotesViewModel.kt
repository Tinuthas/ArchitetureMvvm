package br.com.vinicius.architecturemvvm.ui.quotes

import androidx.lifecycle.ViewModel
import br.com.vinicius.architecturemvvm.data.Quote
import br.com.vinicius.architecturemvvm.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}