import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PreviewSudokuGrid() {
        Row(
        ) {
                Column(
                ) {
                        Text(text = "Caja 1", Modifier.background(Color.Red).padding(12.dp))
                        Text(text = "Caja 4", Modifier.background(Color.Red).padding(12.dp))
                        Text(text = "Caja 7", Modifier.background(Color.Red).padding(12.dp))

                }
            Column(
            ) {
                Text(text = "Caja 2", Modifier.background(Color.Red).padding(12.dp))
                Text(text = "Caja 5", Modifier.background(Color.Red).padding(12.dp))
                Text(text = "Caja 8", Modifier.background(Color.Red).padding(12.dp))

            }
            Column(
            ) {
                Text(text = "Caja 3", Modifier.background(Color.Red).padding(12.dp))
                Text(text = "Caja 6", Modifier.background(Color.Red).padding(12.dp))
                Text(text = "Caja 9", Modifier.background(Color.Red).padding(12.dp))

            }

    }

}
