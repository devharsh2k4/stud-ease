package com.example.studease.data.repository


import com.example.studease.domain.repository.DataStoreOperations
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val dataStore: DataStoreOperations
) {
    suspend fun saveOnBoardingState(completed:Boolean){
        dataStore.saveOnBoardingState(completed = completed)
    }

    fun readOnBoardingState():Flow<Boolean>{
        return dataStore.readOnBoardingState()
    }

}