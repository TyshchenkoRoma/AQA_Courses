import org.junit.*;


public class Annotation {
    @Before
    public void before(){
        System.out.println("before method");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class\n");
    }

    @After
    public void after(){
        System.out.println("after method\n");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }

    //    @Test(expected=org.junit.ComparisonFailure.class)
    @Test//(expected=junit.framework.ComparisonFailure.class)
    public void test1(){
        System.out.println("test1");
        Assert.assertEquals("1", "1");
    }

    @Test(timeout=1000)
    public void test2(){
        System.out.println("test2");
        String expected = "expected";
        String actual = "actual";
        Assert.assertFalse(expected.equals(actual));
        Assert.assertTrue(expected.equals(expected));
        Assert.assertNotNull(actual);
        Assert.assertSame(expected, "expected");
        while(true);
    }
}
