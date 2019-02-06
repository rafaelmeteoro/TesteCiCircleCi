package com.meteoro.testecicircleci.validator

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ValidatorHelperTest {

    private lateinit var validatorHelper: ValidatorHelper

    @Before
    fun setup() {
        validatorHelper = ValidatorHelper()
    }

    @Test
    fun validate() {
        assertEquals(validatorHelper.calculateDigit(""), 0)
    }

    @Test
    fun validate2() {
        assertEquals(validatorHelper.calculateDigit(""), 1)
    }
}