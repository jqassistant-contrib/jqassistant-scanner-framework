//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.api.model.ArrayAccess_lfno_primary;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import javax.annotation.Generated;
import org.mapstruct.Mapper;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Mapper(config = MapperConfiguration.class)
public interface ArrayAccess_lfno_primaryMapper {

    ArrayAccess_lfno_primary map(@Context() ScannerContext scannerContext, Java8Parser.ArrayAccess_lfno_primaryContext parserContext);
}
