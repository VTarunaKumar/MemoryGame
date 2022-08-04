package com.example.memorygame.models

enum class BoardSize(val numCard : Int) {
    Easy(8),
    Medium(18),
    Hard(24);


    fun getWidth(): Int {
        return when (this) {
            Easy -> 2
            Medium -> 3
            Hard -> 4
        }
    }


        fun getHeight(): Int {

            return numCard/getWidth()

            }



        fun getNumPairs(): Int {
            return numCard/2
        }



    }




