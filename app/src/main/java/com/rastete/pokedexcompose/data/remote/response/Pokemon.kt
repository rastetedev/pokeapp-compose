package com.rastete.pokedexcompose.data.remote.response

import com.google.gson.annotations.SerializedName

data class Pokemon(
    val id: Int,
    val name: String,
    val sprites: Sprites,
    val types: List<Type>,
    val weight: Int,
    val height: Int,
    val stats: List<Stat>,
)

data class Sprites(
    @SerializedName("back_default")
    val backDefault: String,
    @SerializedName("back_female")
    val backFemale: Any,
    @SerializedName("back_shiny")
    val backShiny: String,
    @SerializedName("back_shiny_female")
    val backShinyFemale: Any,
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any,
    @SerializedName("front_shiny")
    val frontShiny: String,
    @SerializedName("front_shiny_female")
    val frontShinyFemale: Any,
)

data class Type(
    val slot: Int,
    val type: TypeX
)

data class TypeX(
    val name: String
)

data class Stat(
    @SerializedName("base_stat")
    val baseStat: Int,
    val stat: StatX
)

data class StatX(
    val name: String
)
