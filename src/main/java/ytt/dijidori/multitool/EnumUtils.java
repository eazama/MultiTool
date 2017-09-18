/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytt.dijidori.multitool;

import java.util.Random;

/**
 *
 * @author Eric
 */
public class EnumUtils {
    public static <T extends Enum<?>> T getRandom(Class<T> c) {
        return getRandom(c, new Random());
    }
    
        public static <T extends Enum<?>> T getRandom(Class<T> c, Random rand) {
        return c.getEnumConstants()[rand.nextInt(c.getEnumConstants().length)];
    }
}
