package com.rastete.pokedexcompose.data

import com.rastete.pokedexcompose.data.remote.PokeApi
import com.rastete.pokedexcompose.data.remote.response.Pokemon
import com.rastete.pokedexcompose.data.remote.response.PokemonList
import com.rastete.pokedexcompose.domain.PokemonRepository
import com.rastete.pokedexcompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepositoryImpl @Inject constructor(
    private val api: PokeApi
) : PokemonRepository {

    override suspend fun getPokemonList(limit:Int, offset:Int) : Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured")
        }
        return Resource.Success(data = response)
    }

    override suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(name = pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured")
        }
        return Resource.Success(data = response)
    }
}