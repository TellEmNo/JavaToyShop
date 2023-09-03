public class Prize  {
    private final String prizeName;
    private final int prizeId;

    public Prize (String prizeName, int prizeId)  {
        this.prizeName = prizeName;
        this.prizeId = -1;
    }

    public int getPrizeId ()  {
        return prizeId;
    }

    public String getPrizeName() {
        return prizeName;
    }

//    public synchronized void choosePrize (Shop store) throws Exception  {
//        String winnerName = "";
//        int winnerId = -1;
//        while (winnerName.equals("")) {
//            winnerName = store.getPrize().getPrizeName();
//        }
//        if (store.getPrize().getPrizeId() == -1) {
//            throw new Exception("No prize was drawn!");
//        } else {
//            winnerId = store.getPrize().getPrizeId();
//            System.out.print("Congratulations! Your prize is " + winnerName + "!");
//            break;
//        }
//    }
//
//    public Prize getPrize() throws Exception {
//        if (this.getPrizeId() != -1) {
//            Shop store = new Shop();
//            store.addToy(this);
//            store.organizeDraw();
//            Prize prize = new Prize(this.getPrizeName(), this.getPrizeId());
//            prize.choosePrize(store);
//            throw new Exception();
//        } else {
//            throw new IllegalArgumentException();
//        }
//    }
}
