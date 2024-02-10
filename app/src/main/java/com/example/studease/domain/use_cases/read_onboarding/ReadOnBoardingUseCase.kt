package com.example.studease.domain.use_cases.read_onboarding

import com.example.studease.data.repository.Repository
import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(): Flow<Boolean>{
        return repository.readOnBoardingState()
    }
}