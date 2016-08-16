package com.mrv.yangtools.example;

import com.mrv.yangtools.codegen.SwaggerGenerator;
import com.mrv.yangtools.codegen.impl.SegmentTagGenerator;

import java.io.*;

/**
 * @author bartosz.michalik@amartus.com
 */
public class YamlGenerator {

    public static void main(String[] args) throws Exception {
//        final SwaggerGenerator generator = GeneratorHelper.getGenerator("mef-services", "mef-interfaces");
        final SwaggerGenerator generator = GeneratorHelper.getGenerator(m -> m.getName().startsWith("Tapi"));
        generator.tagGenerator(new SegmentTagGenerator());

        generator.generate(new FileWriter("swagger.yaml"));
//        generator.generate(new OutputStreamWriter(System.out));

    }
}