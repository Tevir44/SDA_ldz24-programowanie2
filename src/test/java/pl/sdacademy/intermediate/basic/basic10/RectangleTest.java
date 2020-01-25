package pl.sdacademy.intermediate.basic.basic10;

import org.junit.*;

public class RectangleTest {

    private Rectangle rectangle;

    private static final int DEFAULT_WIDTH = 3;
    private static final int DEFAULT_HEIGHT = 5;
    private static final int DEFAULT_AREA = 15;
    private static final int DEFAULT_PERIMETER = 16;

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
        rectangle = new Rectangle(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    @After
    public void tearDown() {
        System.out.println("After single test case");
    }


    @Test
    public void testGetWidth() {
        Assert.assertEquals(DEFAULT_WIDTH, rectangle.getWidth());
    }

    @Test
    public void getHeight() {
        Assert.assertEquals(DEFAULT_HEIGHT, rectangle.getHeight());
    }

    @Test
    public void testCalculateArea() {
        Assert.assertEquals(DEFAULT_AREA, rectangle.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Assert.assertEquals(DEFAULT_PERIMETER, rectangle.calculatePerimeter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowExceptionOnIncorrectValuesInConstructor() {
        rectangle = new Rectangle(-1, DEFAULT_HEIGHT);
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
    }

    @Test
    public void testDoesntUpdateHeightWithNegativeValue() {
        rectangle.updateHeight(-1);
        Assert.assertEquals(DEFAULT_HEIGHT, rectangle.getHeight());
    }

    @Test
    public void testDoesntUpdateWidthWithNegativeValue() {
        rectangle.updateWidth(-1);
        Assert.assertEquals(DEFAULT_WIDTH, rectangle.getWidth());
    }


}
