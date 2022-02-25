import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(title = "Binary to decimal", onCloseRequest = ::exitApplication) {

        var binaryValue by remember { mutableStateOf(TextFieldValue("")) }
        var decimalValue by remember { mutableStateOf(TextFieldValue("")) }

        MaterialTheme {
            Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(2.dp)) {
                Row(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text("Binary:")
                    TextField(
                        value = binaryValue,
                        onValueChange = {
                            binaryValue = it
                            decimalValue = TextFieldValue(binaryValue.text.toLong(2).toString())
                        })
                }

                Row(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text("Decimal:")
                    TextField(
                        value = decimalValue,
                        onValueChange = {
                            decimalValue = it
                            binaryValue = TextFieldValue(decimalValue.text.toLong().toString(2))
                        }
                    )
                }

            }
        }
    }
}
