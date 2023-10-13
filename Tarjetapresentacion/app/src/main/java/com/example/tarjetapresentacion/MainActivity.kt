package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(241,218,191)
                ) {
                    Presentation("Andres Felipe Vargas", "Android developer")
                    Info("555-555-55","Andrew","Andrew@gmail.com")
                }
            }
        }
    }
}

@Composable
fun Presentation(name: String,ocupation: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_launcher_foreground)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = name,
            fontSize = 20.sp,
            fontWeight = FontWeight.W700,
            modifier = Modifier
                .padding(5.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = ocupation,
            fontSize = 10.sp,
            color = Color.Green,
            modifier = Modifier
                .padding(5.dp)
                .align(alignment = Alignment.CenterHorizontally),
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 24.sp,
                /*shadow = Shadow(
                    color = Color.Black,
                    blurRadius = 5f
                )*/
            )
        )
    }
}

@Composable
fun Info(phone: String, social: String, email: String,  modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.ic_launcher_foreground)
    val imageModifier = Modifier
        .size(35.dp)
        .border(BorderStroke(1.dp, Color.Black))
        .background(Color(224,119,125))
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.fillMaxSize()
            .padding(30.dp)
    )
    {
            Row(
                modifier = Modifier.align(alignment = Alignment.Start)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = imageModifier
                )

                Text(
                    text = phone,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
            Row(
                modifier = Modifier.align(alignment = Alignment.Start)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = imageModifier
                )

                Text(
                    text = "@" + social,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
            Row(
                modifier = Modifier.align(alignment = Alignment.Start)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = imageModifier
                )

                Text(
                    text = email,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        Presentation("Andres Felipe Vargas", "Android developer")
        Info("555-555-55","Andrew","Andrew@gmail.com")
    }
}