package com.example.basestate

import WellnessTaskItem
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun WellnessTaskList(
    list: List<WellnessTask>,
    modifier: Modifier = Modifier,
    onCloseTask: (WellnessTask) -> Unit
){
    LazyColumn (modifier = modifier){
        items(
            items = list,
            key = { task -> task.id }
        ){ task ->
            WellnessTaskItem(taskName = task.label, onClose = { onCloseTask(task) })
        }
    }
}

