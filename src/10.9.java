    class JetFuel {
        int gallons; //quantity of gallons
        String level; // the quality level
        int price; // in cents per gallon.

        JetFuel(int gallons, String level, int price) {
            this.gallons = gallons;
            this.level = level;
            this.price = price;
        }

        int totalsale() {
            return this.gallons * this.price;
        }

        int discount() {
            if (this.gallons > 100000) {
                return (Math.round(this.totalsale() * (10 / 100F)));
            } else {
                return 0;
            }
        }

        int discountprice() {
            return this.totalsale() - this.discount();
        }

    }

