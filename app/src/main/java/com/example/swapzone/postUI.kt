package com.example.swapzone
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter


class postUI :ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CharityPostScreen()
        }
    }
}

@Composable
fun CharityPostScreen() {
    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
        TopBar()
        PostContent()
        PostButton()
    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "swapzone", color = Color(0xFF2BAE66), fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun PostContent() {
    Column(modifier = Modifier.padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.avatar), // Placeholder avatar
                contentDescription = "Avatar",
                modifier = Modifier.size(40.dp).background(Color.Gray, CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            TextField(value = "", onValueChange = {}, placeholder = { Text("Add a post to call for donations..") }, modifier = Modifier.weight(1f))
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Hội từ thiện trẻ em Sài Gòn (Saigon Children’s Charity CIO)", fontWeight = FontWeight.Bold)
        Text(text = "1h - Thanh Khê, Đà Nẵng", fontSize = 12.sp, color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "CHƯƠNG TRÌNH THIỆN NGUYỆN 'CÙNG EM ĐẾN TRƯỜNG'...", fontSize = 14.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = rememberImagePainter("https://lopvancothu.com/wp-content/uploads/2020/11/suy-nghi-ve-mai-am-tinh-thuong.png"),
            contentDescription = "Charity Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth().height(200.dp).background(Color.Gray, RoundedCornerShape(8.dp))
        )
    }
}

@Composable
fun PostButton() {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2BAE66)),
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Đăng bài", color = Color.White)
        }
    }
}
