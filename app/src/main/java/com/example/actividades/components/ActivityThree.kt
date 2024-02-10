package com.example.helloworld.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable()
fun LayoutNew() {
    Column(modifier = Modifier
        .height(150.dp)
        .width(106.dp)
        .background(
            Color.White
        )
        .padding(4.dp)
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
            .background(Color(0xFF0B3143))){}
        Spacer(modifier = Modifier.height(4.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
            .background(Color(0xFF42D887))){}
        Spacer(modifier = Modifier.height(4.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
            .background(Color(0xFF0B3143))){}
        Spacer(modifier = Modifier.height(4.dp))
        Row(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            ){
            Column(
                modifier = Modifier.fillMaxHeight().width(30.dp).background(Color(0xFF0B3143))
            ) { }
            Spacer(modifier = Modifier.fillMaxHeight().width(4.dp))
            Column(
                modifier = Modifier.fillMaxHeight().width(30.dp).background(Color(0xFF4386F5))
            ) { }
            Spacer(modifier = Modifier.fillMaxHeight().width(4.dp))
            Column(
                modifier = Modifier.fillMaxHeight().width(30.dp).background(Color(0xFF0B3143))
            ) { }

        }

    }

}
