package com.example.weartilecheck.presentation


import android.graphics.Color.argb
import androidx.compose.ui.graphics.Color
import androidx.wear.protolayout.ColorBuilders.ColorProp
import androidx.wear.protolayout.ResourceBuilders
import androidx.wear.protolayout.TimelineBuilders.Timeline
import androidx.wear.protolayout.material.Colors
import androidx.wear.protolayout.material.Text
import androidx.wear.protolayout.material.Typography
import androidx.wear.tiles.RequestBuilders
import androidx.wear.tiles.TileBuilders
import androidx.wear.tiles.TileBuilders.Tile
import androidx.wear.tiles.TileService
import com.google.common.util.concurrent.Futures
import com.google.common.util.concurrent.ListenableFuture

class MyTileService : TileService() {
    override fun onTileRequest(requestParams: RequestBuilders.TileRequest): ListenableFuture<TileBuilders.Tile> {
        return Futures.immediateFuture(
            Tile.Builder()
                .setResourcesVersion("1")
                .setTileTimeline(
                    Timeline.fromLayoutElement(
                        Text.Builder(this, "Hello World")
                            .setTypography(Typography.TYPOGRAPHY_DISPLAY1)
                            .setColor(ColorProp.Builder(argb(23, 34, 45, 56)).build())
                            .build()
                    )
                )
                .build()
        )
    }

}