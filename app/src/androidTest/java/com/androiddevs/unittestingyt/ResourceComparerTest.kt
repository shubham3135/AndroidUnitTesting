package com.androiddevs.unittestingyt

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer
    private lateinit var context: Context


    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
        context = ApplicationProvider.getApplicationContext<Context>()
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val result = resourceComparer.isEqual(context, R.string.app_name, "UnitTestingYT")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
        val result = resourceComparer.isEqual(context, R.string.app_name, "Hello")
        assertThat(result).isFalse()
    }
}