package pl.sdacademy.intermediate.basic.basic10;

import org.junit.*;

public class RectangleTest {

    private Rectangle rectangle;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Starting RectangleTest");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finishing RectangleTest");
    }


    @Before
    public void setUp() {
        rectangle = new Rectangle(3, 5);
    }

    @After
    public void tearDown() {
        System.out.println("After single test case");
    }


    @Test
    public void testGetWidth() {
        Assert.assertEquals(3, rectangle.getWidth());
    }

    @Test
    public void getHeight() {
        Assert.assertEquals(5, rectangle.getHeight());
    }

    @Test
    public void testCalculateArea() {
        Assert.assertEquals(15, rectangle.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Assert.assertEquals(16, rectangle.calculatePerimeter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionOnIncorrectValuesInConstructor() {
        rectangle = new Rectangle(-1, 10);
    }


    @Test
    public void testUpdateHeightWithCorrectValue() {
        rectangle.updateHeight(4);
        Assert.assertEquals(4, rectangle.getHeight());

    }

    @Test
    public void testUpdateWidthwithCorrectValue() {
        rectangle.updateWidth(20);
        Assert.assertEquals(20, rectangle.getWidth());
        rectangle.updateWidth(-1);
        Assert.assertNotEquals(-1, rectangle.getWidth());
        Assert.assertEquals(20, rectangle.getWidth());
    }

    @Test
    public void testDoesntUpdateHeightWithNegativeValue() {
        rectangle.updateHeight(-1);
        Assert.assertNotEquals(-1, rectangle.getHeight());
        Assert.assertEquals(5, rectangle.getHeight());
    }

    @Test
    public void testDoesntUpdateWidthWithNegativeValue() {
        rectangle.updateWidth(-1);
        Assert.assertNotEquals(-1, rectangle.getWidth());
        Assert.assertEquals(3, rectangle.getWidth());
    }


}
