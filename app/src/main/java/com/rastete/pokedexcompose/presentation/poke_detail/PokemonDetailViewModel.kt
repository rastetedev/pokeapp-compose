package com.rastete.pokedexcompose.presentation.poke_detail

import androidx.lifecycle.ViewModel
import com.rastete.pokedexcompose.data.remote.response.Pokemon
import com.rastete.pokedexcompose.domain.PokemonRepository
import com.rastete.pokedexcompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val pokemonRepository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        return pokemonRepository.getPokemonInfo(pokemonName)
    }
}