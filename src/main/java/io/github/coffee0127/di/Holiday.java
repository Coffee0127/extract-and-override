/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Bo-Xuan Fan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.github.coffee0127.di;

import java.time.LocalDate;
import java.time.Month;

/**
 * Holiday with constructor dependency injection
 *
 * @author Bo-Xuan Fan
 * @since 2018-09-29
 */
public class Holiday {

    private LocalDate date;

    public Holiday() {
        this(null);
    }

    Holiday(LocalDate date) {
        if (date == null) {
            date = LocalDate.now();
        }
        this.date = date;
    }

    public String sayXmas() {
        boolean isXmas = date.getMonth().equals(Month.DECEMBER)
            && date.getDayOfMonth() == 25;
        if (isXmas) {
            return "Merry Xmas";
        }
        return "Today is not Xmas";
    }

}
