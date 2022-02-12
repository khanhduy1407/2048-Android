/*
 * Copyright © 2021 NKDuy Developer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nkduy.n2048.activities.helper;

import com.nkduy.n2048.activities.Element;

import java.io.Serializable;

public class GameState implements Serializable {

    public int n = 4;
    public int[] numbers;
    public int[] last_numbers;
    public int points = 0;
    public int last_points = 0;

    public boolean undo=false;

    public GameState(int size) {
        numbers = new int[size*size];
    }

    public GameState(int[][] e) {
        int length = 1;

        for (int[] value : e) {
            if (value.length > length) {
                length = value.length;
            }
        }

        this.n = e.length;
        numbers = new int[e.length*e.length];
        int c = 0;

        for (int[] ints : e) {
            for (int anInt : ints) {
                numbers[c++] = anInt;
            }
        }

        last_numbers = numbers;
    }

    public GameState(Element[][] e, Element[][] e2) {
        int length = 1;

        for (Element[] value : e) {
            if (value.length > length) {
                length = value.length;
            }
        }

        this.n = e.length;
        numbers = new int[e.length*e.length];
        int c = 0;

        for (Element[] elements : e) {
            for (Element element : elements) {
                numbers[c++] = element.number;
            }
        }

        length = 1;

        for (Element[] elements : e2) {
            if (elements.length > length) {
                length = elements.length;
            }
        }

        last_numbers = new int[e2.length*e2.length];
        c = 0;

        for (Element[] elements : e2) {
            for (Element element : elements) {
                last_numbers[c++] = element.number;
            }
        }
    }

    public int getNumber(int i, int j) {
        try {
            return numbers[i*n+j];
        }
        catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public int getLastNumber(int i, int j) {
        try {
            return last_numbers[i*n+j];
        }
        catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("numbers: ");

        for (int i:numbers) {
            result.append(i).append(" ");
        }

        result.append(", n: ").append(n);
        result.append(", points: ").append(points);
        result.append(", undo: ").append(undo);

        return result.toString();
    }
}
