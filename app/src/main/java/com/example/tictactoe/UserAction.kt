package com.example.tictactoe

sealed class UserAction {
    object PlayAgainButtonClicked: UserAction()
    data class BoardTaped(val cellNo: Int): UserAction()
}
