package revengerfitness.lazycolumnrecyclert11

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview()
@Composable
 fun PreviewFunction() {
   LazyColumn(content = {// recycler view
       items(getCategoryList()){item ->
           BlogCategory(img =item.img , title =item.title , subtitle =item.subtitle )

       }
   })

}

@Composable
fun BlogCategory(
    img: Int,
    title: String,
    subtitle: String
) {//parameterize composable function does not have preview annotation.
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ), modifier = Modifier
            .padding(8.dp)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img), contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
fun ItemDescription(
    title: String, subtitle: String, modifier: Modifier
) {// reusable composable
    Column(modifier = Modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Thin
        )
    }
}


data class Category(val img:Int, val title:String,val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))
    list.add(Category(R.drawable.aru,"prashant chauhan","android developer"))

    return list
}