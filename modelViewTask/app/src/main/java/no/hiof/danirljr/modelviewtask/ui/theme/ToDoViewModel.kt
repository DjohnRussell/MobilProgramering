package no.hiof.danirljr.modelviewtask.ui.theme

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ToDoViewModel : ViewModel(){
    private var _uiState = MutableStateFlow( listOf(String()))
    val uiState = _uiState.asStateFlow()


    var toDoList = mutableSetOf<String>(

    )

    fun markTaskAsDone() {

    }

    fun addTask(taskToDo : String) {
        toDoList.add(taskToDo)
    }

    fun removeTask(removeTask : String) {
        toDoList.remove(removeTask)
    }


}


