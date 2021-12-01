package com.example.extractdogapi.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DogImageDao {

    @Query("SELECT * FROM DogImages")
    fun getAllDogImages(): Flow<List<DogImageEntity>>

    //returns row in descending order and selects the first column
    @Query("SELECT * FROM DogImages ORDER BY id DESC LIMIT 1")
    fun getMostRecentlyAddedDog(): DogImageEntity

    //deletes the previous image and gets the next
    @Query("DELETE FROM DogImages WHERE id=(select max(id)-1 from DogImages)")
    suspend fun deleteDog()

    @Insert
    suspend fun addDogImage(dogImageEntity: DogImageEntity)

}