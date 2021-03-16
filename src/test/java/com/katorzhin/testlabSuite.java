package com.katorzhin;

import com.katorzhin.client.testlabTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class testlabSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for testlab");
    suite.addTestSuite(testlabTest.class);
    return suite;
  }
}
