package com.example.shoppinitemroomdatabase.screens.items

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.shoppinitemroomdatabase.R.color.auburn
import com.example.shoppinitemroomdatabase.R.color.black_bean
import com.example.shoppinitemroomdatabase.R.color.falu_red
import com.example.shoppinitemroomdatabase.R.color.rosewood
import com.example.shoppinitemroomdatabase.R.color.white
import com.example.shoppinitemroomdatabase.models.ItemModel
import com.example.shoppinitemroomdatabase.viewmodels.ItemViewModel

@Composable
fun ItemsItems(
    itemViewModel: ItemViewModel,
    itemModel: ItemModel,
    onEditClicked:(itemModel: ItemModel) -> Unit
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        listOf(
                            colorResource(black_bean),
                            colorResource(auburn)
                        )
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier.padding(10.dp).weight(10f),
                text = itemModel.name,
                color = colorResource(white)
            )
            IconButton(
                onClick = {
                    onEditClicked(itemModel)
                },
                modifier = Modifier
                    .background(
                        brush = Brush.linearGradient(
                            listOf(
                                colorResource(falu_red),
                                colorResource(rosewood)
                            )
                        ),
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = " ",
                    tint = Color.White
                )
            }
        }
    }
}