package pl.tommmannson.kotlinandroid2

import java.util.Date

import javax.inject.Singleton

import dagger.Component

/**
 * Created by tomasz.krol on 2017-05-26.
 */

@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent {

    fun data(): Data
}
