#lang profj/beginner
//represent computer images
class Image {
int height;//pixels
int width;//pixels
String source;// file name
String quality;//Informal
String gallery = "Nature";

Image (int height, int width, String source, String quality){
this.height = height;
this.width = width;
this.source = source;
this.quality = quality;
}
}

class ImgExp {
Image var1 = new Image (5,1000,"large.gif","high");
Image var2 = new Image (120,200, "med.gif","low");
Image var3 = new Image (1200,1000, "large.gif","high");
ImgExp () {}
}
