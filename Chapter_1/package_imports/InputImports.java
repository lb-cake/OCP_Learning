package Chapter_1.package_imports;

import java.nio.*; // No Good
import java.nio.*.*; // No Good
import java.nio.file.Paths.*; // No Good
import java.nio.file.*; // Good

public class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}
