/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.developers.testing.util

import android.graphics.Bitmap
import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Size
import androidx.core.graphics.createBitmap
import com.android.developers.androidify.customize.ComposableBitmapRenderer

class FakeComposableBitmapRenderer : ComposableBitmapRenderer {
    override fun initialize() {
    }

    override fun dispose() {
    }

    override suspend fun renderComposableToBitmap(
        canvasSize: Size,
        composableContent: @Composable (() -> Unit),
    ): Bitmap? {
        return createBitmap(1, 1)
    }
}
