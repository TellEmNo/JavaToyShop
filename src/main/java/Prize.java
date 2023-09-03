public class Prize  {
    private String prizeName;
    private int prizeId;

    public Prize ()  {
        this.prizeName = prizeName;
        this.prizeId = -1;
    }

    public void setPrizeId(int prizeId) {
        this.prizeId = prizeId;
    }

    public int getPrizeId ()  {
        return prizeId;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getPrizeName() {
        return prizeName;
    }


}
