package kg.ash.javavi.searchers;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import java.io.File;
import java.util.List;

public class ReflectionPackageSearcherTest {

    @Ignore
    @Test
    public void testGetEntries() {
        List<PackageEntry> entries = new ReflectionPackageSearcher().loadEntries();
        Assert.assertTrue(entries.size() > 0);
    }
    
}
