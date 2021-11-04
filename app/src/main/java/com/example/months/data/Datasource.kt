package com.example.months.data

import com.example.months.R
import com.example.months.model.Months
import java.time.Month


class Datasource {
    fun loadMonths(): List<Months> {
        return listOf<Months>(
                    Months(R.string.one),
                    Months(R.string.two),
                    Months(R.string.three),
                    Months(R.string.four),
                    Months(R.string.five),
                    Months(R.string.Six),
                    Months(R.string.Seven),
                    Months(R.string.Eight),
                    Months(R.string.Nine),
                    Months(R.string.Ten),
                    Months(R.string.twelfth),
                    Months(R.string.eleventh)
                )
            }

    }
