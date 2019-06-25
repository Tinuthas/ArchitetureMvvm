package br.com.vinicius.architecturemvvm.utilities

import br.com.vinicius.architecturemvvm.data.FakeDatabase
import br.com.vinicius.architecturemvvm.data.QuoteRepository
import br.com.vinicius.architecturemvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory():QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}