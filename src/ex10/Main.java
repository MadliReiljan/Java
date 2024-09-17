package ex10;

public class Main {
    public interface NationalService {
        int getDaysLeft();
        void work();
    }

    public class CivilService implements NationalService {
        private int daysLeft;

        public CivilService() {
            this.daysLeft = 362;
        }

        @Override
        public int getDaysLeft() {
            return daysLeft;
        }

        @Override
        public void work() {
            if (daysLeft > 0) {
                daysLeft--;
            }
        }
    }

    public class MilitaryService implements NationalService {
        private int daysLeft;

        public MilitaryService(int daysLeft) {
            this.daysLeft = daysLeft;
        }

        @Override
        public int getDaysLeft() {
            return daysLeft;
        }

        @Override
        public void work() {
            if (daysLeft > 0) {
                daysLeft--;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        CivilService civilService = main.new CivilService();
        System.out.println("Civil service days left: " + civilService.getDaysLeft());
        civilService.work();
        System.out.println("After working, days left: " + civilService.getDaysLeft());

        MilitaryService militaryService = main.new MilitaryService(500);
        System.out.println("Military service days left: " + militaryService.getDaysLeft());
        militaryService.work();
        System.out.println("After working, days left: " + militaryService.getDaysLeft());
    }
}

