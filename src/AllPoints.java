import java.util.HashMap;
import java.util.Map;

public class AllPoints {
    private static AllPoints instance;
    private final Map<Long, Point> points = new HashMap<>();

    private AllPoints() {
    }

    public static AllPoints getInstance() {
        if (instance == null) {
            instance = new AllPoints();
        }
        return instance;
    }

    public Map<Long, Point> getPoints() {
        return points;
    }

    public Point getPointByName(long name) {
        return points.get(name);
    }

//    public void loadData() {
//        points.put(1L, new Point(1L, 1, 1));
//        points.put(2L, new Point(2L, 2, 3));
//        points.put(3L, new Point(3L, 3, 4));
//        points.put(4L, new Point(4L, 4, 5));
//        points.put(5L, new Point(5L, 5, 3));
//        points.put(6L, new Point(6L, 4, 2));
//        points.put(7L, new Point(7L, 3, 1));
//        points.put(8L, new Point(8L, 2, 2));
//
//        points.get(1L).addBounds(8);
//        points.get(2L).addBounds(8L, 3L);
//        points.get(3L).addBounds(2L, 6L, 4L);
//        points.get(4L).addBounds(3, 5);
//        points.get(5L).addBounds(4,6);
//        points.get(6L).addBounds(3,5,7);
//        points.get(7L).addBounds(8,6);
//        points.get(8L).addBounds(1, 7, 2);
//    }

    public void loadData() {
        points.put(1L, new Point(1, 135, 322));
        points.put(2L, new Point(2, 280, 210));
        points.put(3L, new Point(3, 408, 93));
        points.put(4L, new Point(4, 440, 21));
        points.put(5L, new Point(5, 273, 35));
        points.put(6L, new Point(6, 97, 41));
        points.put(7L, new Point(7, 97, 148));
        points.put(8L, new Point(8, 167, 135));
        points.put(9L, new Point(9, 258, 179));
        points.put(10L, new Point(10, 107, 279));
        points.put(11L, new Point(11, 52, 393));
        points.put(12L, new Point(12, 35, 417));
        points.put(13L, new Point(13, 56, 430));
        points.put(14L, new Point(14, 70, 421));
        points.put(15L, new Point(15, 120, 562));
        points.put(16L, new Point(16, 132, 557));
        points.put(17L, new Point(17, 153, 567));
        points.put(18L, new Point(18, 146, 585));
        points.put(19L, new Point(19, 130, 590));
        points.put(20L, new Point(20, 253, 622));
        points.put(21L, new Point(21, 340, 619));
        points.put(22L, new Point(22, 424, 552));
        points.put(23L, new Point(23, 435, 539));
        points.put(24L, new Point(24, 611, 576));
        points.put(25L, new Point(25, 615, 452));
        points.put(26L, new Point(26, 563, 432));
        points.put(27L, new Point(27, 616, 340));
        points.put(28L, new Point(28, 468, 451));
        points.put(29L, new Point(29, 449, 466));
        points.put(30L, new Point(30, 361, 536));
        points.put(31L, new Point(31, 347, 550));
        points.put(32L, new Point(32, 331, 530));
        points.put(33L, new Point(33, 317, 532));
        points.put(34L, new Point(34, 296, 505));
        points.put(35L, new Point(35, 278, 515));
        points.put(36L, new Point(36, 250, 487));
        points.put(37L, new Point(37, 213, 514));
        points.put(38L, new Point(38, 236, 428));
        points.put(39L, new Point(39, 261, 416));
        points.put(40L, new Point(40, 283, 394));
        points.put(41L, new Point(41, 304, 374));
        points.put(42L, new Point(42, 327, 356));
        points.put(43L, new Point(43, 345, 337));
        points.put(44L, new Point(44, 367, 320));
        points.put(45L, new Point(45, 389, 301));
        points.put(46L, new Point(46, 407, 286));
        points.put(47L, new Point(47, 373, 238));
        points.put(48L, new Point(48, 398, 216));
        points.put(49L, new Point(49, 423, 205));
        points.put(50L, new Point(50, 446, 182));
        points.put(51L, new Point(51, 467, 164));
        points.put(52L, new Point(52, 507, 205));
        points.put(53L, new Point(53, 537, 249));
        points.put(54L, new Point(54, 516, 267));
        points.put(55L, new Point(55, 538, 335));
        points.put(56L, new Point(56, 507, 307));
        points.put(57L, new Point(57, 505, 340));
        points.put(58L, new Point(58, 489, 329));
        points.put(59L, new Point(59, 483, 224));
         points.put(60L, new Point(60, 470, 150));
        points.put(61L, new Point(61, 459, 245));
        points.put(62L, new Point(62, 432, 264));
        points.put(63L, new Point(63, 488, 387));
        points.put(64L, new Point(64, 469, 403));
        points.put(65L, new Point(65, 448, 426));
        points.put(66L, new Point(66, 431, 445));
        points.put(67L, new Point(67, 405, 463));
        points.put(68L, new Point(68, 382, 479));
        points.put(69L, new Point(69, 338, 512));

        points.get(1L).addBounds(10, 11, 2);
        points.get(2L).addBounds(1, 9, 3);
        points.get(3L).addBounds(2);
        points.get(4L).addBounds(4, 5);
        points.get(5L).addBounds(9, 4, 6);
        points.get(6L).addBounds(5, 7);
        points.get(7L).addBounds(8, 6, 10);
        points.get(8L).addBounds(7);
        points.get(9L).addBounds(2, 5, 8);
        points.get(10L).addBounds(1, 7);
        points.get(11L).addBounds(1, 12);
        points.get(12L).addBounds(13);
        points.get(13L).addBounds(15);
        points.get(14L).addBounds(11);
        points.get(15L).addBounds(19);
        points.get(16L).addBounds(14);
        points.get(17L).addBounds(16);
        points.get(18L).addBounds(17);
        points.get(19L).addBounds(20);
        points.get(20L).addBounds(21, 18);
        points.get(21L).addBounds(20, 22);
        points.get(22L).addBounds(21, 23);
        points.get(23L).addBounds(22, 26);
        points.get(24L).addBounds(25);
        points.get(25L).addBounds(24, 26);
        points.get(26L).addBounds(25, 23, 27);
        points.get(27L).addBounds(26,55);
        points.get(28L).addBounds(29, 64);
        points.get(29L).addBounds(65, 28, 30);
        points.get(30L).addBounds(29, 31, 69);
        points.get(31L).addBounds(30, 32);
        points.get(32L).addBounds(33, 31);
        points.get(33L).addBounds(32, 34);
        points.get(34L).addBounds(35, 33);
        points.get(35L).addBounds(36, 34);
        points.get(36L).addBounds(35, 37);
        points.get(37L).addBounds(17, 36);
        points.get(38L).addBounds(39, 34);
        points.get(39L).addBounds(40, 38, 69);
        points.get(40L).addBounds(39, 41, 68);
        points.get(41L).addBounds(40, 42, 67);
        points.get(42L).addBounds(41, 43, 66);
        points.get(43L).addBounds(42, 44, 65);
        points.get(44L).addBounds(43, 45, 64);
        points.get(45L).addBounds(44, 46, 63);
        points.get(46L).addBounds(45, 47, 61, 62);
        points.get(47L).addBounds(48, 46);
        points.get(48L).addBounds(47, 49, 61);
        points.get(49L).addBounds(48, 50, 60);
        points.get(50L).addBounds(49, 51, 59);
        points.get(51L).addBounds(50, 52, 3);
        points.get(52L).addBounds(51, 53, 59);
        points.get(53L).addBounds(52, 55);
        points.get(54L).addBounds(53, 59, 56);
        points.get(55L).addBounds(27, 53, 27);
        points.get(56L).addBounds(57, 54, 60);
        points.get(57L).addBounds(58, 56, 55, 62);
        points.get(58L).addBounds(61, 57);
        points.get(59L).addBounds(54, 52, 60, 50);
        points.get(60L).addBounds(49, 61, 56, 59);
        points.get(61L).addBounds(60, 48, 46, 58);
        points.get(62L).addBounds(57, 46, 63);
        points.get(63L).addBounds(62, 45, 64);
        points.get(64L).addBounds(65, 63, 44, 28);
        points.get(65L).addBounds(29, 66, 64, 44);
        points.get(66L).addBounds(67, 65, 42);
        points.get(67L).addBounds(68, 66, 41);
        points.get(68L).addBounds(67, 69, 40);
        points.get(69L).addBounds(30, 68, 32, 39);
    }

}
