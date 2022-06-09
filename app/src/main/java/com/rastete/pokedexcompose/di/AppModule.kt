package com.rastete.pokedexcompose.di

import com.rastete.pokedexcompose.data.PokemonRepositoryImpl
import com.rastete.pokedexcompose.data.remote.PokeApi
import com.rastete.pokedexcompose.domain.PokemonRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePokeApi(): PokeApi {
        return Retrofit.Builder()
            .baseUrl(PokeApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }

    @Provides
    @Singleton
    fun providePokemonRepository(pokeApi: PokeApi): PokemonRepository {
        return PokemonRepositoryImpl(pokeApi)
    }
}