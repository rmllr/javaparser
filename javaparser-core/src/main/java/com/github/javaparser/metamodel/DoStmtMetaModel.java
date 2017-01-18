package com.github.javaparser.metamodel;

import java.util.Optional;
import java.lang.reflect.Field;

public class DoStmtMetaModel extends ClassMetaModel {

    DoStmtMetaModel(JavaParserMetaModel parent, Optional<ClassMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, com.github.javaparser.ast.stmt.DoStmt.class, "DoStmt", "com.github.javaparser.ast.stmt.DoStmt", "com.github.javaparser.ast.stmt", false);
        fieldMetaModels.add(new FieldMetaModel(this, "getBody", "setBody", "body", com.github.javaparser.ast.stmt.Statement.class, null, true, false, false, false, false));
        fieldMetaModels.add(new FieldMetaModel(this, "getCondition", "setCondition", "condition", com.github.javaparser.ast.expr.Expression.class, null, true, false, false, false, false));
    }

    private Field getField(String name) {
        try {
            return DoStmtMetaModel.class.getField(name);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}

