package JUnitLearning;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import JavaConcepts_CollectionsExample.A;

@RunWith(Suite.class)
@SuiteClasses({JUnitAssertions.class, JUnit.class, Juint2.class, A.class
	})
public class TestSuite {
}
