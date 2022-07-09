package Junit;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({JunitTest.class})
@IncludeTags({"search"})
public class SearchSuit {
}
