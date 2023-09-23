package br.com.alura.aluvery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alura.aluvery.R
import br.com.alura.aluvery.ui.theme.Purple200
import br.com.alura.aluvery.ui.theme.Purple500


@Composable
fun ProductHorizontalItem() {
    Surface(
        modifier = Modifier.padding(15.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Row(
            Modifier
                .widthIn(250.dp, 350.dp)
                .height(200.dp)
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .width(imageSize)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Purple500,
                                Purple200
                            )
                        )
                    )
                    .fillMaxHeight()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    Modifier
                        .align(Alignment.Center)
                        .offset(x = imageSize / 2)
                        .clip(shape = CircleShape)
                        .border(
                            width = 2.dp,
                            Brush.verticalGradient(listOf(Purple200, Purple500)),
                            CircleShape
                        )
                )
            }
            Spacer(modifier = Modifier.width(imageSize/2))
            Text(text = LoremIpsum(50).values.first(),
                modifier = Modifier.padding(30.dp),
                fontSize = 18.sp,
                maxLines = 6,
                overflow = TextOverflow.Ellipsis)

        }
    }

}

@Preview(showBackground = true)
@Composable
fun productPreview() {
    ProductHorizontalItem()
}

