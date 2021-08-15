import com.buschmais.jqassistant.core.scanner.api.DefaultScope;
import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.plugin.common.test.AbstractPluginIT;
import org.jqassistant.contrib.plugin.javagen.api.JavaGenFileDescriptor;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;


public class JavaGenScannerPluginTestIT extends AbstractPluginIT {

//    static String file = "/helloworld.java";
//    static String file = "/Java8Parser.java";
    static String file = "/JavaGenFileScannerPlugin.java";

    @Test
    @TestStore(type = TestStore.Type.REMOTE)
    public void scanJavaGenFile() {
        store.beginTransaction();
        File testFile = new File(getClassesDirectory(JavaGenScannerPluginTestIT.class), file);

        Descriptor descriptor = getScanner().scan(testFile, file, DefaultScope.NONE);
        assertThat(descriptor).isInstanceOf(JavaGenFileDescriptor.class);

        store.commitTransaction();
    }
}
