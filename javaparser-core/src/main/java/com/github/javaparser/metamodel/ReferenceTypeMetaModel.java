package com.github.javaparser.metamodel;

import java.util.Optional;
import java.lang.reflect.Field;

public class ReferenceTypeMetaModel extends ClassMetaModel {

    ReferenceTypeMetaModel(JavaParserMetaModel parent, Optional<ClassMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, com.github.javaparser.ast.type.ReferenceType.class, "ReferenceType", "com.github.javaparser.ast.type.ReferenceType", "com.github.javaparser.ast.type", true);
    }

    private Field getField(String name) {
        try {
            return ReferenceTypeMetaModel.class.getField(name);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

