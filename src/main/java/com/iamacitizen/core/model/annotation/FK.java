package com.iamacitizen.core.model.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotação que descreve um atributo que representa uma chave-estrangeira no modelo relacional.
 * @author felipe
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
public @interface FK {

    String[] name();

    String[] alias();

    String referencedTable();
}
