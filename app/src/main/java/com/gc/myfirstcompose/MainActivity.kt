package com.gc.myfirstcompose

import android.os.Bundle
import android.view.Gravity
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gc.personsapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {

    val verticalGradientBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xff4E342E),
            Color(0xff8D6E63),
            Color(0xffD7CCC8)
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme(false) {
                Column(
                    modifier = Modifier
                        .background(color = Color.White)
                        .fillMaxSize()
                ) {
                    Row(
                        modifier = Modifier
                            .padding(20.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center


                    )
                    {
                        Text(
                            text = "Weather Forecast",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = Color.Black
                        )
                    }


                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()

                    ) {

                        Spacer(modifier = Modifier.height(10.dp))
                        Image(
                            painterResource(id = R.drawable.ic_nightlight_round_black_24dp),
                            contentDescription = "Moon",
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = "31,9°",
                            fontWeight = FontWeight.Bold,
                            fontSize = 45.sp,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Tbilisi,Georgia",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.Gray
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier
                            .padding(20.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly


                    )
                    {
                        Text(
                            text = "Today",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "Tomorrow",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = Color.Gray
                        )
                        Text(
                            text = "After",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = Color.Gray
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Card(shape = RoundedCornerShape(10.dp)) {
                            Column(
                                modifier = Modifier
                                    .height(190.dp)
                                    .width(100.dp)
                                    .background(color = colorResource(R.color.scanner_line))
                                    .fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Text(
                                    text = "18:00",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    color = Color.White,
                                )
                                Image(
                                    painterResource(id = R.drawable.ic_wb_cloudy_white_24dp),
                                    contentDescription = "Moon",
                                )
                                Text(
                                    text = "12°",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    color = Color.White,
                                )

                            }
                        }

                        Card(shape = RoundedCornerShape(10.dp)) {
                            Column(
                                modifier = Modifier
                                    .height(190.dp)
                                    .width(100.dp)
                                    .background(color = colorResource(R.color.yellow_update_eta_text))
                                    .fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Text(
                                    text = "19:00",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    color = Color.White,
                                )
                                Image(
                                    painterResource(id = R.drawable.ic_wb_sunny_black_24dp),
                                    contentDescription = "Moon",
                                )
                                Text(
                                    text = "19°",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    color = Color.White,
                                )

                            }
                        }

                        Card(shape = RoundedCornerShape(10.dp)) {
                            Column(
                                modifier = Modifier
                                    .height(190.dp)
                                    .width(100.dp)
                                    .background(color = colorResource(R.color.purple_200))
                                    .fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Text(
                                    text = "22:00",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    color = Color.White,
                                )
                                Image(
                                    painterResource(id = R.drawable.ic_nightlight_round_black_24dp),
                                    contentDescription = "Moon",
                                )
                                Text(
                                    text = "5°",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp,
                                    color = Color.White,
                                )

                            }
                        }

                    }
                    Spacer(modifier = Modifier.height(20.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(20.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "Additional Info",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.Black,

                            )
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth()

                        ) {
                            Column(modifier = Modifier.weight(1f))
                            {
                                Row(
                                    horizontalArrangement = Arrangement.Start,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Wind",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        color = Color.Black,

                                        )
                                    Spacer(modifier = Modifier.width(30.dp))

                                    Text(
                                        text = "12 m/h",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        color = Color.LightGray,

                                        )
                                }
                            }

                            Column(modifier = Modifier.weight(1f))
                            {
                                Row(
                                    horizontalArrangement = Arrangement.Start,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Humidity",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        color = Color.Black,

                                        )
                                    Spacer(modifier = Modifier.width(30.dp))
                                    Text(
                                        text = "55 %",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        color = Color.LightGray,
                                    )
                                }

                            }

                        }


                        Spacer(modifier = Modifier.height(5.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth()

                        ) {
                            Column(modifier = Modifier.weight(1f))
                            {
                                Row(
                                    horizontalArrangement = Arrangement.Start,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Visibility",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        color = Color.Black,

                                        )
                                    Spacer(modifier = Modifier.width(30.dp))
                                    Text(
                                        text = "25 km",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        color = Color.LightGray,
                                    )


                                }
                            }

                            Column(modifier = Modifier.weight(1f)) {
                                Row(

                                    horizontalArrangement = Arrangement.Start,
                                    modifier = Modifier.fillMaxWidth()

                                ) {
                                    Text(
                                        text = "UV",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        color = Color.Black,

                                        )
                                    Spacer(modifier = Modifier.width(30.dp))
                                    Text(
                                        text = "1",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 15.sp,
                                        color = Color.LightGray,
                                    )
                                }
                            }


                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Image(
                            painterResource(id = R.drawable.whether),
                            contentDescription = "Moon",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillWidth
                        )

                    }


                }


            }
        }


    }


}



