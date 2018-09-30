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
package io.github.coffee0127.extract_and_override;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

/**
 * HolidayTest
 *
 * @author Bo-Xuan Fan
 * @since 2018-09-29
 */
public class HolidayTest {

    private Holiday target;

    @Before
    public void setUp() {
        target = spy(Holiday.class);
    }

    @Test
    public void should_return_xmas_if_today_is_xmas() {
        givenDate(12, 25);
        shouldResponse("Merry Xmas");
    }

    @Test
    public void should_not_return_xmas_if_today_is_not_xmas() {
        givenDate(1, 1);
        shouldResponse("Today is not Xmas");
    }

    private void shouldResponse(String response) {
        assertEquals(response, target.sayXmas());
    }

    private void givenDate(int month, int dayOfMonth) {
        when(target.getDate()).thenReturn(LocalDate.of(2018, month, dayOfMonth));
    }

}
