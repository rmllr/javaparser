package com.github.javaparser.metamodel;

import java.util.Optional;
import java.lang.reflect.Field;

public class NameExprMetaModel extends ClassMetaModel {

    NameExprMetaModel(JavaParserMetaModel parent, Optional<ClassMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, com.github.javaparser.ast.expr.NameExpr.class, "NameExpr", "com.github.javaparser.ast.expr.NameExpr", "com.github.javaparser.ast.expr", false);
        fieldMetaModels.add(new FieldMetaModel(this, "getName", "setName", "name", com.github.javaparser.ast.expr.SimpleName.class, null, true, false, false, false, false));
    }

    private Field getField(String name) {
        try {
            return NameExprMetaModel.class.getField(name);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

