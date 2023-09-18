package no.hiof.danirljr.modelviewtask.ui.theme

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ToDoViewModel : ViewModel(){
    private var _uiState = MutableStateFlow( listOf(String()))
    val uiState = _uiState.asStateFlow()


    val toDoList = mutableSetOf<String>(

    )


    fun addTask(task: String) {
        toDoList.add(task.toString())
    }

    fun removeTask(removeTask : String) {
        toDoList.remove(removeTask)
    }


}




