package com.meteoro.testecicircleci.validator

interface Validator {
    fun validate(input: String): Boolean
}