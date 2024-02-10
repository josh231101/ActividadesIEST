import androidx.compose.foundation.background
import androidx.compose.foundation.border
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


data class Box(val color: Color, val number: String)



@Preview(showBackground = true)
@Composable
fun Sudoku() {
    /**
     * 1 row
     * 4 columns
     * 4 boxs |
     */
    Row(
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(50.dp)
                .background(Color(0xFFBBADA0))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFF59563))

            ){
                Text(text = "16", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFEDCF72))

            ){
                Text(text = "128", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White

                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFF67C5F))

            ){
                Text(text = "32", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFF59563))

            ){
                Text(text = "16", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White

                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(50.dp)
                .background(Color(0xFFBBADA0))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFCDC1B4))

            ){
                Text(text = "", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White

                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFF59563))

            ){
                Text(text = "16", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White

                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFF65E3B))

            ){
                Text(text = "64", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White

                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFF2B179))

            ){
                Text(text = "8", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White

                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(50.dp)
                .background(Color(0xFFBBADA0))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFCDC1B4))

            ){
                Text(text = "", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White

                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFCDC1B4))

            ){
                Text(text = "", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White

                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFEEE4DA))

            ){
                Text(text = "2", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color(0xFF776E65)

                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFF2B179))

            ){
                Text(text = "8", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color.White

                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(50.dp)
                .background(Color(0xFFBBADA0))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFEDE0C8))

            ){
                Text(text = "4", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color(0xFF776E65)

                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFCDC1B4))

            ){
                Text(text = "", modifier = Modifier
                    .align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFCDC1B4))

            ){
                Text(text = "", modifier = Modifier
                    .align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFBBADA0))
                    .padding(5.dp)
                    .background(Color(0xFFEEE4DA))

            ){
                Text(text = "2", modifier = Modifier
                    .align(Alignment.Center)
                    , color = Color(0xFF776E65)

                )
            }
        }

    }

}
