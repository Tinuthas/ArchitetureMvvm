package br.com.vinicius.architecturemvvm.data

class QuoteRepository private constructor(private val quoteDao: FakeQuotesDao){

    fun addQuote(quote: Quote){
        quoteDao.addQuote(quote)
    }

    fun getQuotes() = quoteDao.getQuotes()

    companion object{
        @Volatile private var instance: QuoteRepository?= null

        fun getInstance(quoteDao: FakeQuotesDao) =
                instance ?: synchronized(this) {
                    instance ?: QuoteRepository(quoteDao).also { instance = it }
                }
    }

}