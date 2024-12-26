package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {        package com.example.helloworld
        
        import android.os.Bundle
        import androidx.activity.ComponentActivity
        import androidx.activity.compose.setContent
        import androidx.activity.enableEdgeToEdge
        import androidx.compose.foundation.Image
        import androidx.compose.foundation.background
        import androidx.compose.foundation.layout.*
        import androidx.compose.foundation.shape.CircleShape
        import androidx.compose.material3.*
        import androidx.compose.runtime.Composable
        import androidx.compose.ui.Alignment
        import androidx.compose.ui.Modifier
        import androidx.compose.ui.graphics.Color
        import androidx.compose.ui.layout.ContentScale
        import androidx.compose.ui.res.painterResource
        import androidx.compose.ui.text.font.FontWeight
        import androidx.compose.ui.unit.dp
        import androidx.compose.ui.unit.sp
        import androidx.compose.ui.tooling.preview.Preview
        import com.example.helloworld.ui.theme.HelloWorldTheme
        
        class MainActivity : ComponentActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                enableEdgeToEdge()
                setContent {
                    HelloWorldTheme {
                        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                            Greeting(
                                name = "World!",
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                    }
                }
            }
        }
        
        @Composable
        fun Greeting(name: String, modifier: Modifier = Modifier) {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .background(Color(0xFFF0F0F0))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.White, shape = CircleShape)
                        .padding(16.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Hello $name!",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF6200EE)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Welcome to the beautiful Hello World app.",
                    fontSize = 18.sp,
                    color = Color(0xFF333333)
                )
            }
        }
        
        @Preview(showBackground = true)
        @Composable
        fun GreetingPreview() {
            HelloWorldTheme {
                Greeting("Android")
            }
        }
            HelloWorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "World!",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWorldTheme {
        Greeting("Android")
    }
}