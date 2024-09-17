package ex11;

public interface ToBeStored {
    public static void main(String[] args) {
        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }

    class Book {
        private String writer;
        private String title;
        private double weight;

        public Book(String writer, String title, double weight) {
            this.writer = writer;
            this.title = title;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return writer + ": " + title;
        }
    }
    class CD {
        private String artist;
        private String title;
        private int year;

        public CD(String artist, String title, int year) {
            this.artist = artist;
            this.title = title;
            this.year = year;
        }

        @Override
        public String toString() {
            return artist + ": " + title + " (" + year + ")";
        }
    }

}
