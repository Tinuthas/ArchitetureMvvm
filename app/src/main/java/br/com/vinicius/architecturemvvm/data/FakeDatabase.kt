package br.com.vinicius.architecturemvvm.data

class FakeDatabase private constructor(){

    var quoteDao = FakeQuotesDao()
        private set

    companion object {

        @Volatile private var instance: FakeDatabase? = null
        fun getInstance() =
            instance ?: synchronized(this) {
            instance ?: FakeDatabase().also { instance = it }
        }
    }
}