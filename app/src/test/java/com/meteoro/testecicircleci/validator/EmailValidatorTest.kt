package com.meteoro.testecicircleci.validator

import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class EmailValidatorTest {

    private lateinit var validator: Validator

    @Before
    fun setup() {
        validator = EmailValidator()
    }

    @Test
    fun validate() {
        assertTrue(validator.validate("faelanjelus@gmail.com"))
    }
}