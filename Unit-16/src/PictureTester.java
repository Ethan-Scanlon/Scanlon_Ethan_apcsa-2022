/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  
  
  public static void testNegate() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  public static void testGrayScale() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.grayScale();
	  beach.explore();
  }
  
  public static void testFixUnderwater() {
	  Picture beach = new Picture("water.jpg");
	  beach.explore();
	  beach.fixUnderwater();
	  beach.explore();
  }
  
  public static void testMirrorVerticalRightToLeft() {
	  Picture p = new Picture("caterpillar.jpg");
	  p.explore();
	  p.mirrorVerticalRightToLeft();
	  p.explore();
  }
  
  public static void testMirrorHorizontal() {
	  Picture pict = new Picture("redMotorcycle.jpg");
	  pict.explore();
	  pict.mirrorHorizontal();
	  pict.explore();
  }
  
  public static void testMirrorHorizontalBotToTop() {
	  Picture pict = new Picture("jenny-red.jpg");
	  pict.explore();
	  pict.mirrorHorizontalBotToTop();
	  pict.explore();
  }
  
  public static void testMirrorDiagonal() {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorDiagonal();
	  caterpillar.explore();
  }
  
  public static void testCopy()
  {
    Picture canvas = new Picture("ddg.jpg");
    Picture fromPic = new Picture("caterpillar.jpg");
    canvas.copy(fromPic, 
            10, 20);
    canvas.explore();
  }
  
  public static void testCopy2()
  {
	  Picture canvas = new Picture("ddg.jpg");
	    Picture fromPic = new Picture("caterpillar.jpg");
	    canvas.copy2(fromPic, 100, 110, 200, 400);
	    canvas.explore();
  }
  
  public static void testMyCollage()
  {
	  Picture canvas = new Picture("640x480.jpg");
	    canvas.myCollage();
	    canvas.explore();
  }
  
  public static void testEncodeAndDecode() {
	  Picture original = new Picture("beach.jpg");
	    Picture hide = new Picture("apple_icon.jpg");
	    
	    original.explore();
	    original.encode(hide);
	    original.explore();
	    original.decode();
	    original.explore();
	  
  }
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
    //testKeepOnlyGreen();
//    testNegate();
//    testGrayScale();
//    testFixUnderwater();
//    testMirrorVertical();
//	  testMirrorVerticalRightToLeft();
//	  testMirrorHorizontal();
//	  testMirrorHorizontalBotToTop();
//	  testMirrorDiagonal();
//    testMirrorTemple();
//    testMirrorArms();
//    testMirrorGull();
    //testMirrorDiagonal();
//    testCollage();
//    testCopy();
//    testCopy2();
//	  testMyCollage();
//    testEdgeDetection();
//    testEdgeDetection2();
    //testChromakey();
    testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}