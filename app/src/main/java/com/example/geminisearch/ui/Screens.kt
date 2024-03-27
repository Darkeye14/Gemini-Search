package com.example.geminisearch.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.geminisearch.ChatViewModel
import com.example.geminisearch.R

@Composable
fun HomeScreen() {

    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
                    .height(55.dp)
                    .padding(16.dp)
            ){
                Text(modifier = Modifier.align(Alignment.Center),
                    text = stringResource(id = R.string.app_name),
                    fontSize = 19.sp,
                    color = MaterialTheme.colorScheme.onPrimary
                    )
            }
        }
    ) {
        ChatScreen(paddingValues = it)
    }
}

@Composable
fun ChatScreen(paddingValues: PaddingValues) {
      val chatViewModel = viewModel<ChatViewModel>()
    val chatState = chatViewModel.chatState.collectAsState().value
}