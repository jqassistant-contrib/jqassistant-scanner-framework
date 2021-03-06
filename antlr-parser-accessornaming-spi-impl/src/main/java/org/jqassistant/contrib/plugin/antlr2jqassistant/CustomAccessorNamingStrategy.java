package org.jqassistant.contrib.plugin.antlr2jqassistant;

import org.mapstruct.ap.spi.DefaultAccessorNamingStrategy;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.type.TypeKind;
import java.beans.Introspector;

public class CustomAccessorNamingStrategy extends DefaultAccessorNamingStrategy {

    @Override
    public boolean isGetterMethod(ExecutableElement method) {
        return method.getReturnType().getKind() != TypeKind.VOID;
    }

    @Override
    public String getPropertyName(ExecutableElement getterOrSetterMethod) {
        String methodName = getterOrSetterMethod.getSimpleName().toString();
        return Introspector.decapitalize(
                !methodName.equals("getter") && !methodName.equals("setter") && ((methodName.startsWith("get") || methodName.startsWith("set")))
                        ? methodName.substring(3)
                        : methodName
        );
    }
}
