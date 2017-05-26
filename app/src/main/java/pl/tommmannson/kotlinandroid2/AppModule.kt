package pl.tommmannson.kotlinandroid2

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Created by tomasz.krol on 2017-05-26.
 */

@Module
class AppModule {

    @Provides
    fun data() : Data {
        return Data("Tomek from component", 1)
    }
}
