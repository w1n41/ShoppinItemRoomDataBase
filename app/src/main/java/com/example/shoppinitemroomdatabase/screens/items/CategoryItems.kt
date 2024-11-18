package com.example.shoppinitemroomdatabase.screens.items

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.shoppinitemroomdatabase.R.color.white
import com.example.shoppinitemroomdatabase.R.color.auburn
import com.example.shoppinitemroomdatabase.R.color.black_bean
import com.example.shoppinitemroomdatabase.R.color.falu_red
import com.example.shoppinitemroomdatabase.R.color.rosewood
import com.example.shoppinitemroomdatabase.dummy.Dummy
import com.example.shoppinitemroomdatabase.models.CategoryModel
import com.example.shoppinitemroomdatabase.utils.ScreensRoute
import com.example.shoppinitemroomdatabase.viewmodels.CategoryViewModel


@Composable
fun CategoryItems(
    categoryViewModel: CategoryViewModel,
    categoryModel: CategoryModel,
    navHostController: NavHostController,
    onEditClicked: (CategoryModel) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(8.dp)
            .clickable {
                categoryViewModel.setSelectedCategory(categoryModel)
                navHostController.navigate(ScreensRoute.ITEMS_SCREEN)
            }
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
                text = categoryModel.name,
                color = colorResource(white)
            )
            IconButton(
                onClick = {
                    onEditClicked(categoryModel)
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