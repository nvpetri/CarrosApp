package br.senai.sp.carrosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.carrosapp.ui.theme.CarrosAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarrosAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Image(
        painterResource(id = R.drawable.wall),
        contentDescription = "Backgound da tela",
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = Modifier
            .background(Color(0x88000000))
            .padding(22.dp)
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            trailingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search Button",
                        tint = Color(0x94FFFFFF)
                    )
                }
            },
            placeholder = {
                Text(
                    text = "Buscar Copas Pistão",
                    color = Color(0x94FFFFFF)
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color.Red,
                focusedBorderColor = Color.Green,
                unfocusedContainerColor = Color(0x56912929),
                focusedContainerColor = Color(0x56912929)
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Copas Pistão",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = Modifier.height(20.dp))

        LazyRow(
            modifier = Modifier
                .height(50.dp)
        ) {
            items(10) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(125.dp)
                        .padding(bottom = 6.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0x56912929)
                    ),
                    border = BorderStroke(
                        width = 2.dp,
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color.Yellow,
                                Color.Red
                            ),
                        )
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Card(
                            modifier = Modifier
                                .size(width = 90.dp, height = 80.dp),
                            shape = CircleShape
                        ) {
                            Image(
                                painterResource(id = R.drawable.mc),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                }
            }
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(top = 10.dp)
        ) {
            items(10) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(125.dp)
                        .padding(bottom = 6.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0x56912929)
                    ),
                    border = BorderStroke(
                        width = 2.dp,
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color.Yellow,
                                Color.Red
                            ),
                        )
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 20.dp, start = 20.dp)
                    ) {
                        Card(
                            modifier = Modifier
                                .size(width = 90.dp, height = 80.dp),
                            shape = CircleShape
                        ) {
                            Image(
                                painterResource(id = R.drawable.mc),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                        }
                        Column {
                            Text(
                                text = "Carros",
                                color = Color.Yellow,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 10.dp)
                            )
                            Text(
                                text = "Ao viajar para a Califórnia, o famoso carro de corridas Relâmpago McQueen se perde e vai parar em Radiator Springs, uma cidadezinha na Rota 66.",
                                color = Color.White,
                                fontSize = 9.sp,
                                lineHeight = 12.sp,
                                modifier = Modifier.padding(start = 10.dp),
                            )
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CarrosAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting()
        }
    }
}