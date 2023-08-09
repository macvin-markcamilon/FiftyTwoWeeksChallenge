package com.mrkcmln.fiftytwoweekschallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CalculatorViewModel :  ViewModel(){

    val state by mutableStateOf(CalculatorState())
        //private set
}