  class Image {
        int width;
        int height;
        String source ;//file name
        String quality; //informal
        String gallery;//gallery
        Image (int width, int height,String source,String quality,String gallery){
            this.width = width;
            this.height = height;
            this.source = source;
            this.quality= quality;
            this.gallery= gallery;
        }
        //Number Number -> Boolean
        // determines whether the image height is larger than its width.
        boolean isPortrait(){
            return this.height>this.width;
        }
        //Number Number -> Number
        //computes how many pixels the image contains.
        int size (){
            return this.width*this.height;
        }
        //Image Image -> Boolean
        //determines whether one image contains more pixels then the other image
        boolean isLarger (Image that) {
            return this.size()>that.size();
        }
        //Image Image -> Boolean
        //determines whether this image is the same as a given one.
        boolean same (Image that) {
            return  this.source.equals(that.source);
        }
    }

class ImageExamples {
    Image i0 = new Image(100,200,"Nature.jpg","high","Wild");
    Image i1 =new Image(200,200,"Nature.jpg","high","Wild");
    Image i2 = new Image(100,200,"Wild.jpg","high","Wild");   
    ImageExamples (){}
}


/* Image
  int width // image height in pixels
  int height// image widht in pixels
  string source// image name
  string quality// its quality
  string gallery // its gallery
  
  METHODS
  boolean isPortrait() 
  int size()
  boolean isLarger(Image that)
  boolean same (Image that)
*/
  
   
  