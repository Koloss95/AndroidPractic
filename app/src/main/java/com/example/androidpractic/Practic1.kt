package com.example.androidpractic

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidpractic.ui.theme.AndroidPracticTheme

@Composable
fun ComposeArticleScreen(fstring: String, tstring: String, thstring: String) {
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = fstring,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = tstring,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = thstring,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    AndroidPracticTheme {
        ComposeArticleScreen(
            fstring = "Jetpack Compose tutorial",
            tstring = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            thstring = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
        )
    }
}