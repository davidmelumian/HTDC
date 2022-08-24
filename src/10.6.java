//represents information about an image
    class Image {
        int width;// in pixels
        int height;// in pixels
        String source;

        Image(int width, int height, String source) {
            this.width = width;
            this.height = height;
            this.source = source;
        }

        //Image -> String
        //produces one of the three strings depending on the image.
        String sizeString() {
            if (this.width * this.height <= 10000) {
                return "small";
            } else {
                if (this.width * this.height >= 10001 && (this.width * this.height <= 1000000)) {
                    return "medium";
                } else {
                    return "large";
                }
            }
        }
    }