package com.rastete.pokedexcompose.domain

import com.rastete.pokedexcompose.data.remote.response.Pokemon
import com.rastete.pokedexcompose.data.remote.response.PokemonList
import com.rastete.pokedexcompose.util.Resource


interface PokemonRepository {

    suspend fun getPokemonList(limit:Int, offset:Int) : Resource<PokemonList>

    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon>
}