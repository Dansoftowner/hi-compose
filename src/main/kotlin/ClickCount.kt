// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import kotlin.system.exitProcess

fun main() = application {
    Window(
        title = "Hello compose!",
        state = rememberWindowState(width = 700.dp, height = 500.dp),
        onCloseRequest = ::exitApplication
    ) {
        val count = remember { mutableStateOf(0)  }
        MaterialTheme {
            Column(modifier = Modifier.fillMaxSize()) {
                Text("Hi ${count.value}", modifier = Modifier.align(Alignment.CenterHorizontally))
                Button(modifier = Modifier.align(Alignment.CenterHorizontally), onClick = { count.value++ }) {
                    Text("Click!")
                }
            }
        }
    }
}
