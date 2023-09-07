package revengerfitness.lazycolumnrecyclert11

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewFunction()
        }
    }
}


@Composable
private fun PreiewFunction() {
    Text(text = "hello",
        color= Color.White,
        modifier = Modifier .clickable {  } // sequence of modifiers is important
            .background(Color.Blue)
            .size(200.dp)
            .padding(36.dp)
            .border(4.dp, Color.Red)
            .clip(CircleShape)
            .background(Color.Yellow)
            .fillMaxSize()

    )
}

@Composable
fun ListViewItem(imgId:Int, name:String, occupation:String,modifier: Modifier){
    Row (modifier.padding(8.dp)){
        Image(painter = painterResource(id = imgId), contentDescription = "",
            Modifier.size(40.dp)
        )
        Column {
            Text(text = name,
                fontWeight = FontWeight.ExtraBold)

            Text(text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp)
        }
    }

}

