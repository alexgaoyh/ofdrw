package org.ofdrw.core.basicStructure.ofd;

import org.junit.jupiter.api.Test;
import org.ofdrw.TestTool;

public class OFDATest {
    public static OFDA ofdCase(){
        return new OFDA()
                .addDocBody(DocBodyTest.docBodyCase())
                .addDocBody(DocBodyTest.docBodyCase());
    }

    @Test
    public void gen(){
        TestTool.genXml("OFD", doc ->doc.add(ofdCase()));
    }
}
