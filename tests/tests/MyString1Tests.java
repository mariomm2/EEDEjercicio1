package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import eed.MyString1;

class MyString1Tests {

    @Test
    void testContarPalabras() {
        assertEquals(3, MyString1.contarPalabras("Hola soy Mario"));
        assertEquals(1, MyString1.contarPalabras("  Mario  "));
        assertEquals(5, MyString1.contarPalabras("  Me llamo Mario Martin"));
        assertEquals(0, MyString1.contarPalabras(""));
        assertEquals(0, MyString1.contarPalabras(null));
    }

    @Test
    void testContarLetrasDiferentes() {
        assertEquals(5, MyString1.contarLetrasDiferentes("Mario"));
        assertEquals(5, MyString1.contarLetrasDiferentes("AaBbCcDdE"));
        assertEquals(0, MyString1.contarLetrasDiferentes(""));
        assertEquals(0, MyString1.contarLetrasDiferentes(null));
    }

    @Test
    void testContarFrecuenciaPalabras() {
        Map<String, Integer> resultado = MyString1.contarFrecuenciaPalabras("Martin Martin Mario");
        assertEquals(2, resultado.getOrDefault("martin", 0));
        assertEquals(1, resultado.getOrDefault("mario", 0));
        assertTrue(MyString1.contarFrecuenciaPalabras("").isEmpty());
        assertTrue(MyString1.contarFrecuenciaPalabras(null).isEmpty());
    }

    @Test
    void testContarFrecuenciaLetras() {
        Map<Character, Integer> resultado = MyString1.contarFrecuenciaLetras("mario mario");
        assertEquals(2, resultado.getOrDefault('m', 0));
        assertEquals(2, resultado.getOrDefault('a', 0));
        assertEquals(2, resultado.getOrDefault('r', 0));
        assertEquals(2, resultado.getOrDefault('i', 0));
        assertEquals(2, resultado.getOrDefault('o', 0));
        assertTrue(MyString1.contarFrecuenciaLetras("").isEmpty());
        assertTrue(MyString1.contarFrecuenciaLetras(null).isEmpty());
    }

    @Test
    void testEsPalindroma() {
        assertTrue(MyString1.esPalindroma("ana"));
        assertTrue(MyString1.esPalindroma("oso"));
        assertFalse(MyString1.esPalindroma("Java"));
        assertFalse(MyString1.esPalindroma(""));
        assertFalse(MyString1.esPalindroma(null));
        assertTrue(MyString1.esPalindroma("A Santa at NASA"));
    }
}
