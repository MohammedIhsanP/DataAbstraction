public interface Vehicle {

        void ChangeGear();
        void ApplyBreak();
        void SpeedUp();

        public static void main(String[] args) throws InterruptedException {
            car gear1 =new car();
            gear1.ChangeGear();
            Thread.sleep(600);
            car speedup1 =new car();
            speedup1.SpeedUp();
            Thread.sleep(600);
            car break1 =new car();
            break1.ApplyBreak();
            Thread.sleep(1000);
            bike gear2 =new bike();
            gear2.ChangeGear();
            Thread.sleep(600);
            bike speedup2 =new bike();
            speedup2.SpeedUp();
            Thread.sleep(600);
            bike break2 =new bike();
            break2.ApplyBreak();
            Thread.sleep(1000);
            bicycle gear3 =new bicycle();
            gear3.ChangeGear();
            Thread.sleep(600);
            bicycle speedup3 =new bicycle();
            speedup3.SpeedUp();
            Thread.sleep(600);
            bicycle break3 =new bicycle();
            break3.ApplyBreak();
        }
    }
    class car implements Vehicle {
        public void ChangeGear() {
            System.out.println("gear of the car changed");
        }

        public void ApplyBreak() {
            System.out.println("break applied on the car");
        }

        public void SpeedUp() {
            System.out.println("speed of the car increased");
        }
    }
    class bike implements Vehicle {
        public void ChangeGear() {
            System.out.println("gear of the bike changed");
        }

        public void ApplyBreak() {
            System.out.println("break applied on the bike");
        }

        public void SpeedUp() {
            System.out.println("speed of the bike increased");
        }

    }
    class bicycle implements Vehicle {
        public void ChangeGear() {
            System.out.println("gear of the bicycle changed");
        }

        public void ApplyBreak() {
            System.out.println("break applied on the bicycle");
        }

        public void SpeedUp() {
            System.out.println("speed of the bicycle increased");
        }

}

