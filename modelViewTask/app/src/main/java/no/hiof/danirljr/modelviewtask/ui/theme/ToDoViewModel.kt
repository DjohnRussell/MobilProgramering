package no.hiof.danirljr.modelviewtask.ui.theme

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ToDoViewModel : ViewModel() {
    private val _toDoList = MutableStateFlow(emptyList<String>())
    val toDoList: StateFlow<List<String>> = _toDoList



    fun addTask(task: String) {
        val updatedList = _toDoList.value.toMutableList()
        updatedList.add(task)
        _toDoList.value = updatedList
    }

    fun removeTask(task: String) {
        val updatedList = _toDoList.value.toMutableList()
        updatedList.remove(task)
        _toDoList.value = updatedList
    }
}










