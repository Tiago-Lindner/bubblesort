/**
 * @License
 * Copyright 2020 Bubble Sort Application
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.ifrs.vvs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    

    @Test
    @DisplayName("teste que veio no codigo")
    void testApp1() {
        assertEquals(1, 1);
    }

    @Test
    @DisplayName("teste basico")
    void testApp2() {
        BubbleSort bubble = new BubbleSort();
        int[] vetO = {1, 2, 3, 4};
        int[] vetD = {4, 2, 3, 1};
        bubble.sort(vetD);
        assertArrayEquals(vetO, vetD);
    }

    @Test
    @DisplayName("vetores sem ordenar")
    void testApp3() {
        int[] vetO = {1, 2, 3, 4};
        int[] vetD = {4, 2, 3, 1};
        assertNotEquals(vetO, vetD);
    }

    @Test
    @DisplayName("mesmo vetor")
    void testApp4() {
        int[] vetO = {1, 2, 3, 4};
        int[] vetD = vetO;
        assertArrayEquals(vetO, vetD);
    }

    @Test
    @DisplayName("vetores maiores")
    void testApp5() {
        BubbleSort bubble = new BubbleSort();
        int[] vet1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] vet2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        bubble.sort(vet1);
        assertArrayEquals(vet2, vet1);
    }

    @Test
    @DisplayName("vetores maiores sem ordenar")
    void testApp6() {
        int[] vet1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] vet2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertNotEquals(vet2, vet1);
    }

    @Test
    @DisplayName("vetores de tamanho diferentes mas ordenados")
    void testApp7() {
        int[] vetO = {1, 2, 3, 4};
        int[] vet2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertNotEquals(vetO, vet2);
    }

    @Test
    @DisplayName("vetores de tamanho diferentes com bubble sort")
    void testApp8() {
        BubbleSort bubble = new BubbleSort();
        int[] vetO = {1, 2, 3, 4};
        int[] vet1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubble.sort(vet1);
        assertNotEquals(vetO, vet1);
    }

    @Test
    @DisplayName("Numeros grandes")
    void testApp9() {
        BubbleSort bubble = new BubbleSort();
        int[] vetO = {1, 3, 20, 7777, 9999, 56666, 444422, 6666666, 888888888, 1000000000};
        int[] vet1 = {1000000000, 9999, 888888888, 7777, 6666666, 56666, 444422, 3, 20, 1};
        bubble.sort(vet1);
        assertArrayEquals(vetO, vet1);
    }

    @Test
    @DisplayName("Numeros repetidos")
    void testApp10() {
        BubbleSort bubble = new BubbleSort();
        int[] vetO = {1, 1, 1, 2, 2, 3 };
        int[] vet1 = {1, 2, 3, 2, 1, 1};
        bubble.sort(vet1);
        assertArrayEquals(vetO, vet1);
    }

    @Test
    @DisplayName("array vazio")
    void testApp11() {
        BubbleSort bubble = new BubbleSort();
        int[] vetO = {};
        int[] vet1 = vetO;
        bubble.sort(vet1);
        assertArrayEquals(vetO, vet1);
    }

}