package com.typhon.mysnakegame

import android.app.GameState
import kotlin.random.Random


data class SnakeGameState(
    val xAxisGridSize:Int=20,
    val yAxisGridSize:Int=30,
    val direction:Direction =Direction.RIGHT,
    val snake:List<Coordinate> = listOf(Coordinate(5,5)),
    val food: Coordinate= generateRandomFoodCoordinate(),
    val isGameOver:Boolean=false,
    val gameState: GameStat = GameStat.IDLE
){
    companion object{
        fun generateRandomFoodCoordinate(): Coordinate{
            return Coordinate(
                x= Random.nextInt(1,19),
                y= Random.nextInt(1,29)
            )
        }
    }
}
enum class GameStat{
    IDLE,
    STARTED,
    PAUSED
}
enum class Direction{
    UP,
    DOWN,
    LEFT,
    RIGHT
}
data class Coordinate(
    val x: Int,
    val y:Int

)
